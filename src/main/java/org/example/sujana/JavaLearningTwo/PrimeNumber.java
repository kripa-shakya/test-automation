package org.example.sujana.JavaLearningTwo;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        } else {
            // Check for factors from 2 to number / 2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("This is a prime number.");
        } else {
            System.out.println("This is not a prime number.");
        }

        scanner.close();
    }
}

