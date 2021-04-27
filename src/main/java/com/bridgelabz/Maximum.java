package com.bridgelabz;

public class Maximum {


    public  static <T extends  Comparable<T>> T printGenric(T a, T b, T c) {
        T max = a;
        if(b.compareTo(max)>0) {
            max = b;
        }
        if(c.compareTo(max)>0) {
            max = c;
        }
        printGenric(a,b,c,max) ;
        return max;
    }

    public  static  String printGenrictest(String a, String b, String c) {
        String max = a;
        if(b.compareTo(max)>0) {
            max = b;
        }
        if(c.compareTo(max)>0) {
            max = c;
        }
        printGenric(a,b,c,max) ;
        return max;
    }



    private static <T extends  Comparable<T>> void printGenric(T a, T b, T c, T max) {
        System.out.println("maximum value is :"+max);
    }



}
