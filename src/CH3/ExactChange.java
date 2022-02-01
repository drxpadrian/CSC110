package CH3;

import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        int input;
        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number of pennies ");
        input = scan.nextInt();

        if (input <= 0) {
            System.out.println("No change");
        }
        else{
            dollars = (input / 100);
            input = input % 100;
            quarters = (input / 25);
            input = input % 25;
            dimes = (input / 10);
            input = input % 10;
            nickels = (input / 5);
            input = input % 5;
            pennies = (input);

            //Dollars
            if (dollars == 1) {
                System.out.println(dollars + " Dollar");
            }
            else if (dollars >= 2) {
                System.out.println(dollars + " Dollars");
            }
            //Quarters
            if (quarters == 1) {
                System.out.println(quarters + " Quarter");
            }
            else if (quarters >= 2) {
                System.out.println(quarters + " Quarters");
            }
            //Dimes
            if (dimes == 1) {
                System.out.println(dimes + " Dime");
            }
            else if (dimes >= 2) {
                System.out.println(dimes + " Dimes");
            }
            //Nickels
            if (nickels == 1) {
                System.out.println(nickels + " Nickel");
            }
            else if (nickels >= 2) {
                System.out.println(nickels + " Nickels");
            }
            //Pennies
            if (pennies == 1) {
                System.out.println(pennies + " Penny");
            }
            else if (pennies >= 2) {
                System.out.println(pennies + " pennies");
            }
        }
    }
}
