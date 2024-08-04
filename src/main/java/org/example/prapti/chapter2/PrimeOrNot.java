package org.example.prapti.chapter2;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;

        if (n <= 1) {
            System.out.println("The number " + n + " is neither");
        }

        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                x++;

        }
        if (x == 1)
            System.out.println("The number" + n + "  is prime");
        else
            System.out.println("The number" + n + "  is not prime");


    }}