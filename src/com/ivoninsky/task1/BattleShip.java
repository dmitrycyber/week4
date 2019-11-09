package com.ivoninsky.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleShip {
    private int[][] field;
    private Random random = new Random();
    private List list;

    public BattleShip() {
        this.field = new int[10][10];
        this.list = new ArrayList<>();
    }

    public void printField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == 0 || field[i][j] == 2) {
                    System.out.print("  ");
                } else {
                    System.out.print("[]");
                }
            }
            System.out.println();
        }
    }

    public void printField2() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getField() {
        addShipsToField();
        return field;
    }

    private int[][] addShipToField(Ship ship) {
        int elementPositionI;
        int elementPositionJ;
        int direction = random.nextInt(2);
        if (direction == 1) {
            while (true) {
                elementPositionI = random.nextInt(10);
                elementPositionJ = random.nextInt(10);
                if (elementPositionJ + ship.getShip().length > 10) {
                    continue;
                } else if (isCellsInaccessibleInHorizontalDirection(elementPositionI, elementPositionJ, ship)) {
                    continue;
                }
                break;
            }
            //PRINT SHIP ON FIELD
            for (int j = elementPositionJ; j < elementPositionJ + ship.getShip().length; j++) {
                field[elementPositionI][j] = 1;
                makeInaccessibleCellsAroundOfShip(elementPositionI, j, -1, -1);
                makeInaccessibleCellsAroundOfShip(elementPositionI, j, -1, 1);
                makeInaccessibleCellsAroundOfShip(elementPositionI, j, 1, 1);
                makeInaccessibleCellsAroundOfShip(elementPositionI, j, 1, -1);
                makeInaccessibleCellsAroundOfShip(elementPositionI, j, -1, 0);
                makeInaccessibleCellsAroundOfShip(elementPositionI, j, 1, 0);

            }
            makeInaccessibleCellsAroundOfShip(elementPositionI, elementPositionJ, 0, -1);
            makeInaccessibleCellsAroundOfShip(elementPositionI, elementPositionJ, 0, ship.getShip().length);

            return field;
        } else {
            while (true) {
                elementPositionI = random.nextInt(10);
                elementPositionJ = random.nextInt(10);
                if (elementPositionI + ship.getShip().length > 10) {
                    continue;
                } else if (isCellsInaccessibleInVerticalDirection(elementPositionI, elementPositionJ, ship)) {
                    continue;
                }
                break;
            }
            //PRINT SHIP ON FIELD
            for (int i = elementPositionI; i < elementPositionI + ship.getShip().length; i++) {
                field[i][elementPositionJ] = 1;
                makeInaccessibleCellsAroundOfShip(i, elementPositionJ, -1, -1);
                makeInaccessibleCellsAroundOfShip(i, elementPositionJ, -1, 1);
                makeInaccessibleCellsAroundOfShip(i, elementPositionJ, 1, 1);
                makeInaccessibleCellsAroundOfShip(i, elementPositionJ, 1, -1);
                makeInaccessibleCellsAroundOfShip(i, elementPositionJ, 0, -1);
                makeInaccessibleCellsAroundOfShip(i, elementPositionJ, 0, 1);

            }
            makeInaccessibleCellsAroundOfShip(elementPositionI, elementPositionJ, -1, 0);
            makeInaccessibleCellsAroundOfShip(elementPositionI, elementPositionJ, ship.getShip().length, 0);
            return field;
        }
    }

    private boolean isCellsInaccessibleInHorizontalDirection(int elementPositionI, int elementPositionJ, Ship ship) {
        for (int j = elementPositionJ; j < elementPositionJ + ship.getShip().length; j++) {
            if (field[elementPositionI][j] != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isCellsInaccessibleInVerticalDirection(int elementPositionI, int elementPositionJ, Ship ship) {
        for (int i = elementPositionI; i < elementPositionI + ship.getShip().length; i++) {
            if (field[i][elementPositionJ] != 0) {
                return true;
            }
        }
        return false;


    }

    private void makeInaccessibleCellsAroundOfShip(
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

    private void addShipsToField() {
        ListOfShips listOfShips = new ListOfShips();
        listOfShips.addShipsToList();
        for (int i = 0; i < 10; i++) {
            addShipToField(listOfShips.getNextShip());
        }

    }


}
