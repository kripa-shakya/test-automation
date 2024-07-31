package org.example.kripa;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        double pi = 3.14;


        //Enter the radius of a circle
        System.out.print("Enter the radius:");
        double radius=scanner.nextDouble();

        double area = pi * radius*radius;

        System.out.println("The area of a circle is" +area);

    }
}
