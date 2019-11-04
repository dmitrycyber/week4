package com.ivoninsky.task1;

public class Sphere extends Circle{

    public Sphere (int radius) {
        super(radius);
    }

    public double getVolume() {
        return 4/3 * Math.PI * getRadius();
    }
}
