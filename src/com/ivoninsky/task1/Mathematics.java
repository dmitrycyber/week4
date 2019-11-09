package com.ivoninsky.task1;

import java.util.List;
import java.util.Map;

public class Mathematics {
    private Object object1;
    private Object object2;

    public int sumOfTwoElement(int object1, int object2) {
        return object1 + object2;
    }

    public float sumOfTwoElement(float object1, float object2) {
        return object1 + object2;
    }

    public double sumOfTwoElement(double object1, double object2) {
        return object1 + object2;
    }

    public byte sumOfTwoElement(byte object1, byte object2) {
        return (byte) (object1 + object2);
    }

    public short sumOfTwoElement(short object1, short object2) {
        return (short) (object1 + object2);
    }

    public long sumOfTwoElement(long object1, long object2) {
        return object1 + object2;
    }

    public String sumOfTwoElement(String object1, String object2) {
        return object1 + object2;
    }

    public int[] sumOfTwoElement(int[] object1, int[] object2) {
        int[] sumArray = new int[object1.length + object2.length];
        for (int i = 0; i < object1.length; i++) {
            sumArray[i] = object1[i];
        }
        int i, j;
        for (i = object1.length, j = 0; i < sumArray.length; i++, j++) {
            sumArray[i] = object2[j];
        }
        return sumArray;
    }

    public List sumOfTwoElement(List object1, List object2) {
        object1.addAll(object2);
        return object1;
    }

    public Map sumOfTwoElement(Map object1, Map object2) {
        object1.putAll(object2);
        return object1;
    }


}
