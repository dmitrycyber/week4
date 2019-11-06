package com.ivoninsky.task1;

public class Mathematics {
    private Object object1;
    private Object object2;

    /*public Mathematics (*//*Object object1, Object object2*//*) {
        this.object1 = object1;
        this.object2 = object2;
    }*/

    public int add (int object1, int object2) {
        return object1 + object2;
    }

    public float add (float object1, float object2) {
        return object1 + object2;
    }

    public double add (double object1, double object2) {
        return object1 + object2;
    }

    public byte add (byte object1, byte object2) {
        return (byte) (object1 + object2);
    }

    public short add (short object1, short object2) {
        return (short) (object1 + object2);
    }

    public long add (long object1, long object2) {
        return object1 + object2;
    }

    public String  add (String  object1, String object2) {
        return object1 + object2;
    }

    public Integer[]  add (Integer[]  object1, Integer[] object2) {
        Integer[] sum = new Integer[object1.length + object2.length];
        for (int i = 0; i < sum.length; i++) {
            int j = object1.length-1;
            sum[i] = object1[i];
            sum[j] = object2[i];
        }
        return sum;
    }













}
