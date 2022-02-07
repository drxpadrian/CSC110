package CH3;

import java.util.Scanner;

public class FindAlpha {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String passCode;

        passCode = scnr.next();

        char let0 = passCode.charAt(0);
        char let1 = passCode.charAt(1);

        if (Character.isLetter(let0)) {
            System.out.println("Alphabetic at " + let0);
        }
        if (Character.isLetter(let1)) {
            System.out.println("Alphabetic at " + let1);
        }
    }
}
