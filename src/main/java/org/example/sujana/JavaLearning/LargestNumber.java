package org.example.sujana.JavaLearning;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = scanner.nextInt();

        System.out.println("Enter the second number:");
        int b = scanner.nextInt();

        System.out.println("Enter the third number:");
        int c = scanner.nextInt();

        int largestNumber;

        if (a >= b && a >= c) {
            largestNumber = a;
        } else if (b >= a && b >= c) {
            largestNumber = b;
        } else {
            largestNumber = c;
        }

        System.out.println("The largest number among three numbers is:" +largestNumber);
    }
}
