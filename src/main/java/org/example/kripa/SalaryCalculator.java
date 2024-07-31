package org.example.kripa;

import java.util.Scanner;

/* All sales people get the payment osf $1000 a week
Salespeople who exceed 10 sales get an additional bonus of $250
 */
public class SalaryCalculator {
    public static void main(String args[]) {
        //initialize the known values
        int sal = 1000;
        int bonus = 250;

        //Get values for the unknown
        System.out.println("Enter the number of sales the employee made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detours for the bonus earner
        if (sales > 10) {
            sal = sal + bonus;
        }
                System.out.println("The employee's pay is $" + sal);

            }
        }

