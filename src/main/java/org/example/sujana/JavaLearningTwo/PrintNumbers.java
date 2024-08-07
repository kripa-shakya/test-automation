package org.example.sujana.JavaLearningTwo;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 is:");

        int num;

        for (num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
