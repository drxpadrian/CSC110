package CH5;

import java.util.Scanner;

public class NestedLoop {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int i;
        int j;

        userNum = scnr.nextInt();

        for (i = 0; i <= userNum; ++i) {
            System.out.println(i);
            for (j = 0; j <= i; ++j) {
                if (i == userNum) {
                    System.out.print("");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
    }
}
