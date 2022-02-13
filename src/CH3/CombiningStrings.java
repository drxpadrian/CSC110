package CH3;

import java.util.Scanner;

public class CombiningStrings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String secretID;
        String firstName;
        String lastName;

        System.out.println("Enter first name: ");
        firstName = scnr.next();
        System.out.println("Enter last name: ");
        lastName = scnr.next();

        secretID = firstName.concat(" ") + lastName;

        System.out.println(secretID);
    }
}
