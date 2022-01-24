package CH1;

import java.util.Scanner;

public class RealStateSummary {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int currentPrice;
        int lastMonthsPrice;

        System.out.println("Enter the price of the home: ");
        currentPrice = scnr.nextInt();
        System.out.println("Enter the price of the home from last month: ");
        lastMonthsPrice = scnr.nextInt();

        System.out.println("This house is $" + currentPrice + ". The change is $" + (currentPrice - lastMonthsPrice) + " since last month.");
        System.out.println("The estimated monthly mortgage is $"+ (currentPrice * 0.051) / 12 + ".");

    }
}
