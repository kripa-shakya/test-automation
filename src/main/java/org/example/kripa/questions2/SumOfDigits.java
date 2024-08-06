package src.main.java.org.example.kripa.questions2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        int i, sum = 0,r;
        while (num > 0)
        {
            r = num % 10;
            sum = sum + r;
            num = num/10;
        }
        System.out.println("The sum of the entered digits is:" + sum);
    }
}
