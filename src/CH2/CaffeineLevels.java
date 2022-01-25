package CH2;

import java.util.Scanner;

public class CaffeineLevels {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75.
        double halfLife;

        System.out.println("Welcome to the caffeine half-life calculator........");

        System.out.println("Enter the caffeine amount: ");
        caffeineMg = scnr.nextDouble();

        halfLife = caffeineMg / 2;

        System.out.printf("After 6 hours: %.2f mg\n", halfLife);
        halfLife = halfLife / 2;
        System.out.printf("After 12 hours: %.2f mg\n", halfLife);
        halfLife = halfLife / 4;
        System.out.printf("After 24 hours: %.2f mg\n", halfLife);

    }
}
