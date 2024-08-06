package src.main.java.org.example.kripa.questions2;

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {

        //Getting the input from the user for calculation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial: ");
        int num = scanner.nextInt();


        //Initializing the factorial as a 1
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("The factorial of the " + num + " is " + fact);
    }
}



