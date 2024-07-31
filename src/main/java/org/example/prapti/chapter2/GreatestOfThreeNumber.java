package org.example.prapti.chapter2;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        int a=1, b=2, c=3, largestNumber;
        System.out.println("a :" + a + "b :" + b + "c :" +c);
        if (a>=b && a>=c) {
            System.out.println("Largest number is a");

        } else if (b>=a && b>=c) {
            System.out.println("Largest number is b");

        }else System.out.println("Largest number is c");
    }
}
