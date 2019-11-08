package com.ivoninsky.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOfShips {
    private List<Ship> list;
    private Random random = new Random();

    public ListOfShips() {
        this.list = new ArrayList<>();
    }

    public List addShipsToList(){
        list.add(new Ship(4));
        list.add(new Ship(3));
        list.add(new Ship(3));
        list.add(new Ship(2));
        list.add(new Ship(2));
        list.add(new Ship(2));
        list.add(new Ship(1));
        list.add(new Ship(1));
        list.add(new Ship(1));
        list.add(new Ship(1));
        return list;
    }

    /*public Ship getNextShip() {
        return list.remove(random.nextInt(list.size()));
    }*/

    public Ship getNextShip(int index) {
        return list.get(index);
    }



}
