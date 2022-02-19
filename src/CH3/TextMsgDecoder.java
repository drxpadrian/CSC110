package CH3;

import java.util.Scanner;

public class TextMsgDecoder {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String userLine;

        //get the String input and display it
        System.out.println("Enter text:");
        userLine = scnr.nextLine();
        System.out.println("You entered: " + userLine);

        // Now use series of if statements, NOT if-else (common error)
        // remember that if indexOf returns a -1, the String is not found.
        // So the != -1 is checking for when the String is found

        if (userLine.indexOf("BFF") != -1) {  //when this is true, that means that BFF is in userLine
            System.out.println("BFF: best friend forever");
        }

        if (userLine.indexOf("IDK") != -1) {
            System.out.println("IDK: I don't know");
        }

        if (userLine.indexOf("JK") != -1) {
            System.out.println("JK: just kidding");
        }

        if (userLine.indexOf("TMI") != -1) {
            System.out.println("TMI: too much information");
        }

        if (userLine.indexOf("TTYL") != -1) {
            System.out.println("TTYL: talk to you later");
        }
    }
}
