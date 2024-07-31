package org.example.kripa;

import java.util.Scanner;

public class HelloKripa {
    public static void main(String[] args)

    {
        //Get the number of the hour worked
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner= new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();

        //Multiply hours and the pay rate
        double grosspay = hours * rate;

        // Display result
        System.out.println("The employee's gross pay is " + grosspay);

    }
}


