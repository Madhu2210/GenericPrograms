package com.bridglabz;

public class GenericMax {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer obj1 = 2, obj2 = 4, obj3 =6;
        Float x = 2.3f, y = 7.8f, z = 6.7f;
        getMaximum(obj1, obj2, obj3);

        getMaximum(x, y, z);
    }

    private static void getMaximum(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(x) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Maximum Number of Float Value is::" + max);
    }
    private static void getMaximum(Integer obj1, Integer obj2, Integer obj3) {
        Integer max = obj1;
        if(obj2.compareTo(obj1)>0){
            max = obj2;
        }
        if(obj3.compareTo(max)>0){
            max = obj3;
        }
        System.out.println("Maximum Number of Integer is::"+max);
    }
}

