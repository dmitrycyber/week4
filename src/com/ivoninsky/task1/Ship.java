package com.ivoninsky.task1;


public class Ship {
    private int length;

    public Ship(int length){
        this.length = length;
    }

    public int[] getShip(){
        int[] ship = new int[length];
        for (int i = 0; i < ship.length; i++) {
            ship[i] = 1;
        }
        return ship;
    }
}
