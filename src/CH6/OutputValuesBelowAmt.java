package CH6;

import java.util.Scanner;

public class OutputValuesBelowAmt {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];   // List of integers from input
        int size = scnr.nextInt();

        for(int i = 0; i < size; i++)
        {
            userValues[i] = scnr.nextInt();
        }

        int thresholdV = scnr.nextInt();

        for(int i = 0; i < size; i++)
        {
            if(userValues[i] <= thresholdV)
            {
                System.out.print(userValues[i] + ",");

            }
        } System.out.println();
    }
}

