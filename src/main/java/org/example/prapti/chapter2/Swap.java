package org.example.prapti.chapter2;

public class Swap {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("TEST: "+(a+b));
        System.out.println("a :" + a + " b :" + b);
        /**
         * swap two integers
         */
        int test;
        test=a;
        a=b;
        b=test;


        System.out.println("a :" + a + " b :" + b);
    }
}
