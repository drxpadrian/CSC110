package CH2;

import java.util.Scanner;

public class DrivingCosts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double milesPerGallon;
        double pricePerGallon;
        double gasCost;

        milesPerGallon = scan.nextDouble();
        pricePerGallon = scan.nextDouble();

        gasCost = pricePerGallon/milesPerGallon;

        System.out.printf("%.2f", 20 * gasCost);
        System.out.print(" ");
        System.out.printf("%.2f", 75 * gasCost);
        System.out.print(" ");
        System.out.printf("%.2f", 500 * gasCost);


    }
}
