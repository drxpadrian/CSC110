package CH2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String genericLocation;
        int wholeNumber;
        String pluralNoun;

        System.out.println("Enter a name: ");
        firstName = scnr.next();
        System.out.println("Enter a location: ");
        genericLocation = scnr.next();
        System.out.println("Enter a whole number: ");
        wholeNumber = scnr.nextInt();
        System.out.println("Enter a plural noun: ");
        pluralNoun = scnr.next();

        System.out.println(firstName + " went to " + genericLocation + " to buy " + wholeNumber + " different types of " + pluralNoun + ".");
    }
}
