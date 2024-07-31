package org.example.kripa;
import java.util.Scanner;
public class CheckNumber {
    public static void main(String[]args)
    {
        //Get the number from the user
        System.out.println("Enter the number please");
        Scanner scanner= new Scanner(System.in);
        int num= scanner.nextInt();

        //checking if the number is the odd or the even

        if(num%2 ==0)
        {
            System.out.println("the entered number" +num+ "is the even number");

        }
        else {
            System.out.println("the entered number"  +num+  "is the odd number");
        }

    }

}
