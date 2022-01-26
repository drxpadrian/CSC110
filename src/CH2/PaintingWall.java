package CH2;

import java.util.Scanner;

public class PaintingWall {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double paintNeeded;
        double paintGallonCov = 350.0;

        System.out.println("Enter wall height (feet):");
        wallHeight = scnr.nextDouble();
        System.out.println("Enter the wall's width (feet)");
        wallWidth = scnr.nextDouble();

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        // Finish the output statement
        System.out.printf("Wall area: %.2f square feet\n", wallArea);
        // Calculate and output the amount of paint in gallons needed to paint the wall
        paintNeeded = wallArea / paintGallonCov;
        System.out.printf("Paint needed: %.2f gallons\n", paintNeeded);
        // Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        System.out.println("Cans needed: " + (int) Math.ceil(paintNeeded) + " can(s)");
    }
}
