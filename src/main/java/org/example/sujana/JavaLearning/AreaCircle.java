package org.example.sujana.JavaLearning;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle:");
        float radius = scanner.nextFloat();

        double area = 3.14 * radius * radius;

        System.out.println("The area of circle is:" +area);

        scanner.close();

    }
}
