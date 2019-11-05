package com.ivoninsky.task1;

public class Square extends Figure {
    private int side;

    public Square(int side) {

        this.side = side;
    }

    @Override
    public String getName () {

        return "Square";
    }

    @Override
    public double getPerimeter () {
        return side * 4;
    }

    @Override
    public double getArea () {

        return side * side;
    }

}
