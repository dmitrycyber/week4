package com.ivoninsky.task1;

public class Sphere extends Figure{

    private int radius;

    public Sphere (int radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Sphere";
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
}
