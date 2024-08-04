package org.example.prapti.chapter2;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of values: ");
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=5;i++)
            for(int j=1;j<=5;j++)
                System.out.println("*");
            System.out.println("");

    }
}
