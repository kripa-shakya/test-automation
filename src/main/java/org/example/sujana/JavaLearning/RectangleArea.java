package org.example.sujana.JavaLearning;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length of the rectangle:");
        int length = scanner.nextInt();

        System.out.println("Please enter the breadth of the rectangle:");
        int breadth = scanner.nextInt();

        int area = length*breadth;

        System.out.println("The area of rectangle is:" +area);

        scanner.close();

    }
}
