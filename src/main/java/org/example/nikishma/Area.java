package org.example.nikishma;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the area");
            int length = sc.nextInt();
            System.out.println("Enter the breadth of the area");
            int breadth = sc.nextInt();
            int area = length * breadth;
            System.out.println(area);
        }



    }

