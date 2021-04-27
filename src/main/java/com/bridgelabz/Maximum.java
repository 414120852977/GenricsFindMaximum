package com.bridgelabz;

import java.util.Arrays;

public class Maximum<T extends Comparable<T>> {
T a,b,c;

    public Maximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  T printGenric() {
        return Maximum.printGenric(a,b,c);
    }

    public static <T extends  Comparable<T>> T printGenric(T a, T b, T c) {
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

    public static <T extends Comparable<T>> T  maxParmeters(T... elements) {
            int i = 0;
        T max = elements[i];
          for(T e : elements){
              if(elements[1].compareTo(max)>0) {
                  max = elements[1];
              }
              if(elements[2].compareTo(max)>0) {
                  max = elements[2];
              }
              if(elements[3].compareTo(max)>0) {
                  max = elements[3];
              }
              if(elements[4].compareTo(max)>0) {
                  max = elements[4];
              }
          }
          return  max;
    }

    private static <T extends  Comparable<T>> void printGenric(T a, T b, T c, T max) {
        System.out.println("maximum value is :"+max);
    }

}
