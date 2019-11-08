package com.ivoninsky.task1;

import com.sun.org.apache.bcel.internal.generic.FADD;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleShip2 {
    private int[][] field;
    private Random random = new Random();
    private List list;
    private int countOfShips = 0;

    public BattleShip2 () {
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
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getField(){
        return field;
    }

    public int[][] addShipToField(Ship ship) {

        int elementPositionI = random.nextInt(10);
        int elementPositionJ = random.nextInt(10);
        outer:
        while (elementPositionJ + ship.getShip().length > 10) {
            elementPositionI = random.nextInt(10);
            elementPositionJ = random.nextInt(10);
            if (!generateIndexOfX(elementPositionI, elementPositionJ, ship)) {
                break outer;
            }

        }
        //ПЕЧАТЬ
        for (int j = elementPositionJ; j < elementPositionJ+ship.getShip().length; j++) {
            field[elementPositionI][j] = 1;
            setElement(elementPositionI, j, -1, -1);
            setElement(elementPositionI, j, -1, 1);
            setElement(elementPositionI, j, 1, 1);
            setElement(elementPositionI, j, 1, -1);
        }
        setElement(elementPositionI, elementPositionJ, 0, -1);
        setElement(elementPositionI, elementPositionJ, 0, ship.getShip().length);

        return field;
    }

    public boolean generateIndexOfX (int elementPositionI, int elementPositionJ, Ship ship){
        if (elementPositionJ + ship.getShip().length > 10) {
            return true;
        }
        for (int j = elementPositionJ; j < elementPositionJ+ship.getShip().length+1; j++) {
            if (field[elementPositionI][j] != 0) {
                return true;
            }
        }
        return false;
    }

    private void setElement(
            int elementPositionI,
            int elementPositionJ,
            int incrementI,
            int incrementJ
    ) {
        int incrementedI = elementPositionI + incrementI;
        int incrementedJ = elementPositionJ + incrementJ;
        if (
                (incrementedI >= 0 && incrementedI < 10) && (incrementedJ >= 0 && incrementedJ < 10)) {

            field[incrementedI][incrementedJ] = 2;
        }
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


}
