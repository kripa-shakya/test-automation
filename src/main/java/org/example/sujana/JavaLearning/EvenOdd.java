package org.example.sujana.JavaLearning;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number:");
        int num = scanner.nextInt();

        if (num%2==0){
            System.out.println("This is even number");
        }

        else {
            System.out.println("This is odd number");
        }
        scanner.close();
    }
}
