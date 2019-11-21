package com.ivoninsky.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Picture {
    private List<Figure> list;
    private Map<String, Integer> map;

    public Picture() {
        this.list = new ArrayList();
        this.map = new HashMap();
    }

    public void addToPicture(Figure figure) {
        list.add(figure);
    }

    public Map getMapWithNamesAndCountOfFigures() {
        for (int i = 0; i < list.size(); i++) {
            Integer countOfFigures = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getName().equals(list.get(i).getName())) {
                    countOfFigures += 1;
                }
            }
            map.put(list.get(i).getName(), countOfFigures);
        }
        return map;
    }

    public double sumPerimetersOfFigures() {
        double sum = 0;
        Figure tmp;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(i);
            sum += tmp.getPerimeter();
        }
        return sum;
    }

    public double sumAreasOfFigures() {
        double sum = 0;
        Figure tmp;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(i);
            sum += tmp.getArea();
        }
        return sum;
    }

    public String namesOfFigures() {
        String sum = "";
        Figure tmp;
        for (int i = 0; i < list.size(); i++) {
            tmp = list.get(i);
            sum += tmp.getName() + " ";
        }
        return sum;
    }


}
