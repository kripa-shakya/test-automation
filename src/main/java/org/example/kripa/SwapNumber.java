package org.example.kripa;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[]args) {

        Scanner scanner= new Scanner(System.in);
        //Entering the first number

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        //Entering the second number
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swapping numbers using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Displaying numbers after swapping
        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

    }
}
