package CH3;

import java.util.Scanner;

public class TextMessageAbbreviation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String abbreviation;

        System.out.println("Input an abbreviation:");
        abbreviation = scnr.next();

        if (abbreviation.equals("LOL") ) {
            System.out.println(abbreviation + " = laughing out loud");
        }
        else if (abbreviation.equals("IDK")) {
            System.out.println(abbreviation + " = I don't know");
        }
        else if (abbreviation.equals("BFF")) {
            System.out.println(abbreviation + " = best friends forever");
        }
        else if (abbreviation.equals("IMHO")) {
            System.out.println(abbreviation + " = in my humble opinion");
        }
        else if (abbreviation.equals("TMI")) {
            System.out.println(abbreviation + " = too much information");
        }
        else {
            System.out.println(abbreviation + " = Unknown at this time");
        }
    }
}
