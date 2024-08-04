package org.example.prapti.chapter2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
     System.out.println("Enter the number to calculate the factorial.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long factorial = 1;
        for (int i = 1 ; i<=number ;i++){
            factorial =factorial*i;
        }
        System.out.println("The factorial" + number+ "is" +factorial);
    }
}
