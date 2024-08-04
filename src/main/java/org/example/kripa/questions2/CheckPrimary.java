package src.main.java.org.example.kripa.questions2;

import java.util.Scanner;

public class CheckPrimary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();

        int count=0;
        for (int i = 0; i < num; i++)
        {
            if (num % 2== 0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("The " +num+" is a Primary number");

        }
        else {
            System.out.println("The " +num+" is not a Primary number");
        }
    }
}
