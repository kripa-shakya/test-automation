package org.example.nikishma;
import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }

        if (num <= 1) {
            isPrime = false;
        }

        if (isPrime) {
            System.out.println( + num + " is a prime number.");
        } else {
            System.out.println( + num + " is not a prime number.");
        }


    }
}

