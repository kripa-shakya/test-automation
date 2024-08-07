package org.example.sujana.JavaLearningTwo;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number:");
        int num = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <=num; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + num + " is " + factorial);

        scanner.close();
    }
}
