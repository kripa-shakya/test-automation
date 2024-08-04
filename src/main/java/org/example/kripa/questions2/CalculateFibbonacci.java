package src.main.java.org.example.kripa.questions2;

import java.util.Scanner;

public class CalculateFibbonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Getting the input from the user
        System.out.println("Enter the number of fibonacci numbers: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci numbers are: ");

        int a=0;
        int b=1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a +" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
