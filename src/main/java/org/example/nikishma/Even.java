package org.example.nikishma;
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("First.Even");
        else
            System.out.println("Odd");
    }
}
