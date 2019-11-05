package com.ivoninsky.task1;

import java.util.ArrayList;
import java.util.List;

public class Picture {
    private List<Figure> list;

    public Picture (){
        this.list = new ArrayList();
    }

    public List getList() {
        return list;
    }

    public List addToList(Figure figure) {
        list.add(figure);
        return list;
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
