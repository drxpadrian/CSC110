package CH2;

import java.util.Scanner;

public class PhoneNumberBreakdown {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        long phoneNumber;
        long first3Digits;
        long middle3Digits;
        long last4Digits;


        System.out.println("Beep boop this is the phone number formatter, welcome human...");

        System.out.println("Enter your phone number without any special characters... (I mean it): ");
        phoneNumber = scnr.nextLong();

        first3Digits =  phoneNumber / 10000000;
        middle3Digits = phoneNumber % 10000000 / 10000;
        last4Digits = phoneNumber % 10000;

        System.out.println("Beep boop, here ya go: ");
        System.out.print("(" + first3Digits + ") ");
        System.out.print(middle3Digits + "-");
        System.out.println(last4Digits);

    }
}
