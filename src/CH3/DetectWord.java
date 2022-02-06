package CH3;

import java.util.Scanner;

public class DetectWord {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;

        System.out.println("Enter a word: ");
        userString = scnr.next();

        if (userString.equals("Quit")) {
            System.out.println("Goodbye");
        }
        else {
            System.out.println("Hello");
        }
    }
}
