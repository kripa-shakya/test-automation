package org.example.nikishma;

import java.util.Scanner;

public class FibonacciSeries {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = scanner.nextInt();

            int a = 0, b = 1;

            System.out.print("Fibonacci series of " + n+ " is: " + a);

            for (int i = 1; i < n; i++) {
                System.out.print(", " + b);
                int c = a + b;
                a = b;
                b = c;
            }


    }

}
