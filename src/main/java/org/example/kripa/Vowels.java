package org.example.kripa;

import java.util.Scanner;
public class Vowels {

    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the character:");
        char ch = scanner.next().charAt(0);


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println(ch + " is a vowel letter");
        }
 else
        {
            System.out.println(ch + " is a consonant letter ");
        }
    }
}
