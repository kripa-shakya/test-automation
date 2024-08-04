package org.example.prapti.chapter2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number to calculate the fibonacci number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int a = 0;
        int b = 1;
        int fib = 1;

        for(int i =2;i <=n;i++){
            fib = a+b;
            a=b;
            b= fib;
        }
        System.out.println("The " + n + "th Fibonacci number is: " + fib);
    }}

