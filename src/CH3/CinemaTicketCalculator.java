//Program Name: CinemaTicketCalculator.java
//Author: Adrian Linares
//Class: CSC110AB
//Date Written: 1/29/2022
//Brief Description:This program assigns a ticket price depending on your age which is randomly assigned.
package CH3;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;


public class CinemaTicketCalculator {
    public static void main (String[] args)
    {
        //declare variables. assign to 0 initially
        int age = 0;
        double fullTicketPrice = 0.0;
        double ticketPrice = 0.0 ;

        Scanner scnr = new Scanner(System.in);
        Random generator = new Random();

        //Do not remove. Needed to display currency format with $ and 2 decimal places - nice
        NumberFormat fmtC = NumberFormat.getCurrencyInstance();

        System.out.println("Welcome to the Cinema Ticket Calculator");
        System.out.println("--------------------------------------");

        //generate a random age from 1 - 100
        age = generator.nextInt(100) + 1;

        //display the age that was generated
        System.out.println("Your age : " + age);

        //prompt the user for the full ticket price
        System.out.print("Please enter the full cinema ticket price:");
        fullTicketPrice = scnr.nextDouble();

        //Calculate and display the ticket price

        if (age < 5) {
            ticketPrice = 0.0;
            System.out.println("Your ticket price is " + fmtC.format(ticketPrice) + " which is free!");
        }
        else if (age >= 5 && age <= 13) {
            ticketPrice = fullTicketPrice / 2.0;
            System.out.println("Your ticket price is " + fmtC.format(ticketPrice) + " which is half price!");
        }
        else if (age >= 14 && age < 60) {
            ticketPrice = fullTicketPrice;
            System.out.println("Your ticket price is " + fmtC.format(ticketPrice) + " which is full price!");
        }
        else {
            ticketPrice = fullTicketPrice - (fullTicketPrice * 10 / 100);
            System.out.println("Your ticket price is " + fmtC.format(ticketPrice) + " which is the senior discount price!");
        }
    }
}
/* Your output here
Welcome to the Cinema Ticket Calculator
--------------------------------------
Your age : 71
Please enter the full cinema ticket price:10.50
Your ticket price is $9.45 which is the senior discount price!
 */
