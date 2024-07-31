package org.example.kripa;

import java.util.Scanner;

public class AskUser {
    public static void main(String[]args)
    {
        // Get the adjective from the user
        System.out.println("Enter the adjective for the season");
        Scanner scanner= new Scanner(System.in);
        String adj = scanner.nextLine();

        //Get the season of the year from the user
        System.out.println("Enter the season of the year");
        String season = scanner.nextLine();

        //Get the  number from the user
        System.out.println("Enter the number of times you drink the coffee");
        int NoOfTimes= scanner.nextInt();

        //Display result
        System.out.println("On a " + adj + " " +season+ " day, I drink a minimum of " + NoOfTimes + " cups of coffee.");
    }
}
