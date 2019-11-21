package com.ivoninsky.task1;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }
}
