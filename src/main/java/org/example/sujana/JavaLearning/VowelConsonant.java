package org.example.sujana.JavaLearning;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the alphabet:");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet== 'o' || alphabet == 'u') {
            System.out.println("The given alphabet is a vowel");
        }

        else {
            System.out.println("The given alphabet is a consonant");
        }

        scanner.close();
        }

    }

