package src.main.java.org.example.kripa.questions2;

import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of the number:");
        int count = scanner.nextInt();

        int i;
        double sum = 0;
        for(i=1; i<=count; i++)
        {
            double number = scanner.nextInt();
            sum = sum + number;

        }
        double average = sum /count;
        System.out.println("The average is " + average);
    }
    }

