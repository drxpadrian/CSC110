package CH3;

import java.util.Scanner;

public class charMatching {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        int stringSize;

        userInput = scnr.nextLine();

        stringSize = userInput.length();

        System.out.println("Size of userInput: " + stringSize);
    }
}
