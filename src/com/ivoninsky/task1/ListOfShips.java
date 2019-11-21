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

    public List addShipsToList(int multiply) {
        list.add(new Ship(4 * multiply));
        list.add(new Ship(3 * multiply));
        list.add(new Ship(3 * multiply));
        list.add(new Ship(2 * multiply));
        list.add(new Ship(2 * multiply));
        list.add(new Ship(2 * multiply));
        list.add(new Ship(1 * multiply));
        list.add(new Ship(1 * multiply));
        list.add(new Ship(1 * multiply));
        list.add(new Ship(1 * multiply));
        return list;
    }

    public Ship getNextShip() {
        return list.remove(random.nextInt(list.size()));
    }


}
