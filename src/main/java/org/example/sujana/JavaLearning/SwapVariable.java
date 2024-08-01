package org.example.sujana.JavaLearning;

import java.util.Scanner;

public class SwapVariable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("The first number is:");
        int number1 = scanner.nextInt();

        System.out.println("The second number is:");
        int number2 = scanner.nextInt();

        System.out.println("The numbers before swapping are:");
        System.out.println("The first number is:" +number1);
        System.out.println("The second number is:" +number2);

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The numbers are swapping are:");
        System.out.println("The first number is:" +number1);
        System.out.println("The second number is:" +number2);

        scanner.close();
    }
}
