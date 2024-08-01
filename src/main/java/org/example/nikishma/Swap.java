package org.example.nikishma;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number is:");
        int num2 = sc.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The numbers are swapping are:");
        System.out.println("The first number is:" + num1);
        System.out.println("The second number is:" + num2);
    }
}
