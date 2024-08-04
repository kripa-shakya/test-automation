package org.example.prapti.chapter2;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int reverse = 0;

        while(n!=0) {
            int reminder = n % 10;
            reverse = reverse * 10 + reminder;
            n /=10;
        }
        System.out.println("The reversed number is " +reverse);
    }

}
