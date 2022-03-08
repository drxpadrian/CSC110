package CH6;

import java.util.Scanner;

public class AdjustListByNormalizing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] userValues = new double[20];
        double max;
        int numValues;

        numValues = scan.nextInt();

        for(int i = 0; i < numValues; i++) {
            userValues[i] = scan.nextDouble();
        }

        max = userValues[0];
        for(int i = 0; i < numValues; i++) {
            if(userValues[i] > max)
                max = userValues[i];
        }

        for(int i = 0; i < numValues; i++) {
            userValues[i] = userValues[i] / max;
            System.out.printf("%.2f", userValues[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
