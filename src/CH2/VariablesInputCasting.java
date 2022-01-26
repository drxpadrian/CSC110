package CH2;

import java.util.Scanner;

public class VariablesInputCasting {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int userInt;
        double userDouble;
        char userCharacter;
        String userName;


        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        userCharacter = scnr.next().charAt(0);
        System.out.println("Enter string:");
        userName = scnr.next();

        System.out.println(userInt + " " + userDouble + " " + userCharacter + " " + userName);
        System.out.println(userName + " " + userCharacter + " " + userDouble + " " + userInt);
        System.out.println(userDouble + " cast to an integer is " + (int) userDouble);

    }
}
