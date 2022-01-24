package CH2;

import java.util.Scanner;

public class SpaceReplace {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("Enter your first name: ");
        firstName = scnr.next();
        System.out.println("Enter your last name: ");
        lastName = scnr.next();

        System.out.println(lastName + ", " + firstName);
    }
}
