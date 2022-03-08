//Program Name: UsernameGenerator.java
//Author: Adrian Linares
//Class: CSC110AB
//Date Written: 2/13/2022
//Brief Description:This program creates two usernames based on information inputted by the user
package CH3;

import java.util.Random;
import java.util.Scanner;

public class UsernameGenerator {
    public static void main(String[] args) {

        Random gen = new Random();
        Scanner scan = new Scanner(System.in);

        String firstName;
        String lastName;
        String birthYear;
        String userName1;
        String userName2;

        //Random number generators
        int value1 = gen.nextInt(100) + 1;
        int value2 = gen.nextInt(26) + 50;


        System.out.println("Welcome! This program will help you create a username.");

        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();
        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();
        System.out.println("Enter your birth year: ");
        birthYear = scan.nextLine();

        System.out.println();

        System.out.println("Here are two possible usernames generated for you: ");

        userName1 = firstName.charAt(1) + "$" + birthYear.substring(2)
                + lastName.toUpperCase() + value1;
        System.out.println(userName1 + " Length: " + userName1.length());

        userName2 = firstName.substring(0, 2) + firstName.length() + "$"
                + lastName.substring(lastName.length() -2 ) + value2;
        System.out.println(userName2 + " Length: " + userName2.length());
    }
}
/* Your output here
Welcome! This program will help you create a username.
Enter your first name:
Luke
Enter your last name:
Skywalker
Enter your birth year:
1987

Here are two possible usernames generated for you:
u$87SKYWALKER48 Length: 15
Lu4$er54 Length: 8
 */