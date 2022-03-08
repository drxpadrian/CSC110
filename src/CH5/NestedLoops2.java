package CH5;

import java.util.Scanner;

public class NestedLoops2 {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int numRows;
        int numColumns;
        int currentRow;
        int currentColumn;
        char currentColumnLetter;

        numRows = scnr.nextInt();
        numColumns = scnr.nextInt();

        for (int i = 1; i <= numRows; i++) {

            currentColumnLetter = 'A';

            for (int x = 1; x <= numColumns; x++) {
                System.out.print(i);
                System.out.print(currentColumnLetter + " ");
                currentColumnLetter++;
            }
        }
        System.out.println();
    }
}

