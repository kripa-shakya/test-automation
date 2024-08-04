package org.example.prapti.chapter2;

import java.util.Scanner;

public class SumOfTheDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        while(n!=0) {
            int reminder = n % 10;
            sum = sum + reminder;
            n /= 10;
        }
        System.out.println("The sum of number is " +sum);
    }

}