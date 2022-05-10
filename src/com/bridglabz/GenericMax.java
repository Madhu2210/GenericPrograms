package com.bridglabz;

public class GenericMax {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer obj1 = 2, obj2 = 4, obj3 =6;
        testMaximum (obj1, obj2, obj3);
    }

    private static void testMaximum(Integer obj1, Integer obj2, Integer obj3) {
        Integer max = obj1;
        if(obj2.compareTo(obj1)>0){
            max = obj2;
        }
        if(obj3.compareTo(max)>0){
            max = obj3;
        }
        System.out.println("Maximum Number is::"+max);
    }
}

