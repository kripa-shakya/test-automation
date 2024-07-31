package org.example.kripa;

import java.util.Scanner;

//Add two numbers to find the sum of two numbers
public class AddNumber {
    public static void main (String args[])
    {
        //Getting the first number from the user
        System.out.println("Enter the first number");
        Scanner scanner= new Scanner(System.in);
        double num1= scanner.nextDouble();

        //Getting the second number from the user
        System.out.println("Enter the second number");
        double num2= scanner.nextDouble();

        //Add the two numbers
        double sum=num1 +num2;

        //Display result
        System.out.println("The sum of the two number is" +sum);

    }


}
