package org.example.prapti.chapter2;

import java.util.Scanner;

public class FindTheAvarage {
    public static void main(String[] args) {
        System.out.println("Enter the number of values: ");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double sum = 0;

        for(double i =0;i<=n;i++){
            sum = sum + i;

    }
        double average = sum/n;
        System.out.println("The average of given number is " +average);
}


    }