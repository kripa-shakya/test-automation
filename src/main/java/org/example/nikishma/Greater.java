package org.example.nikishma;

import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        if(a>b && a>c) {
            System.out.println("First.Greater number" + a);
        }
        else if(b>c){
            System.out.println("First.Greater number" + b);
        }
        else
            System.out.println("First.Greater number" + c);
    }
}
