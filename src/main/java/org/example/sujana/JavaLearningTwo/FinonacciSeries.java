package org.example.sujana.JavaLearningTwo;

import java.util.Scanner;

public class FinonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci series of " + num + " is: " + a);

        for (int i = 1; i < num; i++) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
    }
}

