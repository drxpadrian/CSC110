package CH7;

import java.util.Scanner;

public class ArraysKeyValue {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ROWS = 2;
        final int NUM_COLS = 2;
        int [][] milesTracker = new int[NUM_ROWS][NUM_COLS];
        int i;
        int j;
        int maxMiles; // Assign with first element in milesTracker before loop
        int minMiles; // Assign with first element in milesTracker before loop

        for (i = 0; i < milesTracker.length; i++){
            for (j = 0; j < milesTracker[i].length; j++){
                milesTracker[i][j] = scnr.nextInt();
            }
        }

        maxMiles = milesTracker[0][0];
        minMiles = milesTracker[0][0];

        for(int row = 0; row < milesTracker[0].length; row++)
        {
            for(int col = 0; col < milesTracker[0].length; col++)
            {
                if(milesTracker[row][col] > maxMiles)
                    maxMiles = milesTracker[row][col];

                if(milesTracker[row][col] < minMiles)
                    minMiles = milesTracker[row][col];
            }
        }

        System.out.println("Min miles: " + minMiles);
        System.out.println("Max miles: " + maxMiles);
    }
}

