package com.ivoninsky.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.DoubleToIntFunction;

public class Battleship {
    private int[][] field;
    private Random random = new Random();
    private List list;
    private int countOfShips = 0;

    public Battleship () {
        this.field = new int[10][10];
        this.list = new ArrayList<>();
    }

    public void printField(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == 0 || field[i][j] == 2) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("[]");
                }
            }
            System.out.println();
        }
    }

    public void printField2(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] getField(){
        return field;
    }

    public int[][] addShipToField(Ship ship) {
        int indexOfLine = random.nextInt(10);
        int indexOfElementInLine = random.nextInt(10);
        int direction = random.nextInt(2); //if direction = 0 - horizontal; else - vertical;
        System.out.println("Direction " + direction);
        System.out.println("LengthOfShip " + ship.getShip().length);
        if (direction == 0) {
            System.out.println("IndexOfLine " + indexOfLine);
            System.out.println("IndexOfElementInLine " + indexOfElementInLine);
            while (indexOfElementInLine + ship.getShip().length > field.length-1 && generateIndexOfX(indexOfLine, indexOfElementInLine, ship)) {
                indexOfLine = random.nextInt(10);
                indexOfElementInLine = random.nextInt(10);
            }
            //ПЕЧАТЬ
            for (int i = indexOfElementInLine; i < indexOfElementInLine+ship.getShip().length; i++) {
                field[indexOfLine][i] = 1;
                if (indexOfLine != 0){
                    field[indexOfLine-1][i] = 2;
                }
                else if (indexOfLine != field.length-1) {
                    field[indexOfLine+1][i] = 2;
                }
            }
            if (indexOfElementInLine != 0){
                field[indexOfLine][indexOfElementInLine-1] = 2;
            }
            else if (indexOfElementInLine != field.length-1) {
                field[indexOfLine][indexOfElementInLine+1] = 2;
            }
            return field;
        }

        else {
            System.out.println("IndexOfLine " + indexOfLine);
            System.out.println("IndexOfElementInLine " + indexOfElementInLine);
            while (indexOfLine + ship.getShip().length > field.length-1 && generateIndexOfY(indexOfLine, indexOfElementInLine, ship)) {
                indexOfLine = random.nextInt(10);
                indexOfElementInLine = random.nextInt(10);
            }
            //ПЕЧАТЬ
            for (int i = indexOfLine; i < indexOfLine+ship.getShip().length; i++) {
                field[i][indexOfElementInLine] = 1;
                if (indexOfElementInLine != 0){
                    field[i][indexOfElementInLine-1] = 2;
                }
                else if (indexOfElementInLine != field.length-1) {
                    field[i][indexOfElementInLine+1] = 2;
                }
            }
            if (indexOfLine != 0){
                field[indexOfLine-1][indexOfElementInLine] = 2;
            }
            else if (indexOfLine != field.length-1) {
                field[indexOfLine+1][indexOfElementInLine] = 2;
            }
            return field;
        }

    }

    public int[][] addShipsToField() {
        ListOfShips listOfShips = new ListOfShips();
        listOfShips.addShipsToList();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            addShipToField(listOfShips.getNextShip(i));
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == 1){
                    sum ++;
                }
            }
        }
        System.out.println(sum);
        return field;
    }

    public boolean generateIndexOfX (int indexOfLine, int indexOfElementInLine, Ship ship){
        if (indexOfElementInLine + ship.getShip().length > field.length-1) {
            return true;
        }
        for (int i = indexOfElementInLine; i < indexOfElementInLine+ship.getShip().length; i++) {
            if (field[indexOfLine][i] == 1 && field[indexOfLine][i] == 2) {
                return true;
            }
            else if (indexOfLine != 0 && field[indexOfLine-1][i] == 1 && field[indexOfLine-1][i] == 2 && field[indexOfLine+1][i] == 1 && field[indexOfLine+1][i] == 2) {
                return true;
            }
            else if (indexOfLine == 0 && field[indexOfLine+1][i] == 1 && field[indexOfLine+1][i] == 2) {
                return true;
            }
            else if (indexOfLine != field.length-1 && field[indexOfLine+1][i] == 1 && field[indexOfLine+1][i] == 2 && field[indexOfLine-1][i] == 1 && field[indexOfLine-1][i] == 2) {
                return true;
            }
            else if (indexOfLine == field.length-1 && field[indexOfLine-1][i] == 1 && field[indexOfLine-1][i] == 2) {
                return true;
            }
        }
        if (indexOfElementInLine != 0 && indexOfLine != 0 && indexOfElementInLine != field.length-1 && indexOfLine != field.length-1 && field[indexOfLine][indexOfElementInLine-1] == 1 && field[indexOfLine][indexOfElementInLine-1] == 2 && field[indexOfLine-1][indexOfElementInLine-1] == 1 && field[indexOfLine-1][indexOfElementInLine-1] == 2 && field[indexOfLine+1][indexOfElementInLine-1] == 1 && field[indexOfLine+1][indexOfElementInLine-1] == 2) {
            return true;
        }
        else if (indexOfElementInLine != field.length-1 && field[indexOfLine][indexOfElementInLine+1] == 1 && field[indexOfLine][indexOfElementInLine+1] == 2 && field[indexOfLine][indexOfElementInLine-1] == 1 && field[indexOfLine][indexOfElementInLine-1] == 2) {
            return true;
        }
        return false;
    }

    public boolean generateIndexOfY (int indexOfLine, int indexOfElementInLine, Ship ship){
        if (indexOfLine + ship.getShip().length > field.length-1) {
            return true;
        }
        for (int i = indexOfLine; i < indexOfLine+ship.getShip().length; i++) {
            if (field[i][indexOfElementInLine] == 1 && field[i][indexOfElementInLine] == 2) {
                return true;
            }
            else if (indexOfElementInLine != 0 && field[i][indexOfElementInLine-1] == 1  && field[i][indexOfElementInLine-1] == 2 && field[i][indexOfElementInLine+1] == 1  && field[i][indexOfElementInLine+1] == 2) {
                return true;
            }
            else if (indexOfElementInLine == 0 && field[i][indexOfElementInLine+1] == 1  && field[i][indexOfElementInLine+1] == 2) {
                return true;
            }
            else if (indexOfElementInLine != field.length-1 && field[i][indexOfElementInLine+1] == 1  && field[i][indexOfElementInLine+1] == 2) {
                return true;
            }
        }
        if (indexOfLine != 0 && field[indexOfLine-1][indexOfElementInLine] == 1  && field[indexOfLine-1][indexOfElementInLine] == 2) {
            return true;
        }
        else if (indexOfLine != field.length-1 && field[indexOfLine+1][indexOfElementInLine] == 1  && field[indexOfLine+1][indexOfElementInLine] == 2) {
            return true;
        }
        return false;

    }

}
