package org.example.kripa;
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[]args) {

        //Getting the first number from the user
        System.out.println("Enter the first number");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();

        //Getting the second number from the user
        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();

        //Getting the third number from the user
        System.out.println("Enter the third number");
        double num3 = scanner.nextDouble();

        if (num1>= num2 && num1>=num3)
        {
            System.out.println("The " + num1 + " is the greatest of the all");
        }

        else if (num2>=num1 && num2>=num3)
        {
            System.out.println("The " + num2 + " is the greatest of all");
        }

        else
        {
            System.out.println("The " + num3 + " is the greatest of all");
        }
    }

}
