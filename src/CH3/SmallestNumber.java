package CH3;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        /* Declare some variables and create a Scanner object */
        int num1, num2, num3;
        int min;
        Scanner scnr = new Scanner(System.in);

        //read in the three numbers
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();

        //set num1 as the starting min
        if ((num1 < num2) && (num1 < num3)) {
            min = num1;
            System.out.println(min);
        }
        //now check if num2 is smaller, if so make num2 the min.  Use an if statement
        if ((num2 < num1) && (num2 < num3)) {
            min = num2;
            System.out.println(min);
        }
        //now check if num3 is smaller than the current min. Use an if statement
        //if it is, then make num3 the min
        if ((num3 < num1) && (num3 < num2)) {
            min = num3;
            System.out.println(min);
        }
        if (num1 == num2 || num2 == num3) {
            min = num1;
            System.out.println(min);
        }



    }
}


