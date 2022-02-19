package CH4;

import java.util.Scanner;

public class CountMultiples {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int low;
        int high;
        int x;
        int count = 0;

        System.out.println("Enter low: ");
        low = scnr.nextInt();
        System.out.println("Enter high: ");
        high = scnr.nextInt();
        System.out.println("Enter X: ");
        x = scnr.nextInt();

        for(int i = low; i <= high; i++) {
            if ( i % x == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

