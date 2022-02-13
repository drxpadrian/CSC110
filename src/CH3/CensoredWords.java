package CH3;

/*Print "Censored" if userInput contains the word "darn", else print userInput. End with newline.
Ex: If userInput is "That darn cat.", then output is: Censored
Ex: If userInput is "Dang, that was scary!", then output is: Dang, that was scary!
Note: If the submitted code has an out-of-range access, the system will stop running the code after a few seconds,
and report "Program end never reached." The system doesn't print the test case that caused the reported message. */

import java.util.Scanner;

public class CensoredWords {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        System.out.println("Enter a sentence: ");
        userInput = scnr.nextLine();

        if( userInput.contains("darn")){
            System.out.println("Censored");
        }
        else{
            System.out.println(userInput);
        }
    }
}
