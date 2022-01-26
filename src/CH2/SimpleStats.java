package CH2;

import java.util.Scanner;

public class SimpleStats {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        num4 = scnr.nextInt();

        System.out.println( (num1 * num2 * num3 * num4) + " " + ((num1 + num2 + num3 + num4) / 4 ));
        System.out.printf("%.3f ", (double)(num1 * num2 * num3 * num4 ));
        System.out.printf("%.3f\n ", ((double)(num1 + num2 + num3 + num4 ) / 4 ));

    }
}
