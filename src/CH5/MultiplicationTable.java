/*
Program Name :  MultiplicationTable.java
Author : Adrian Linares
Date : 02/28/2022
Class: CSC110AA/AB and CIS163AA
Description:
		  This program prompts the user for a number 1 - 5,
		  checks for bad input,
		  and creates a multiplication table.
		  Student completes.
*/
package CH5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int size;
        int value;
        Scanner scan = new Scanner(System.in);

        //read in size of multiplication table
        System.out.print("Please enter the table size from 1 to 5 (0 to quit): ");
        size = scan.nextInt();

    while (size != 0) {
        if ((size <= 5) && (size > 0)){
            //using a for loop, display the top header row of numbers
            System.out.print("\t");
            for (int horiz = 1; horiz <= size; horiz++) {
                System.out.print(horiz + "\t");
            }

            System.out.println();

            //using a for loop, display the top header row underline (use a dash)
            System.out.print("\t");
            for (int horiz = 1; horiz <= size; horiz++) {
                System.out.print("-" + "\t");
            }
            System.out.println();


            /* using a nested for loop create the rest of the table */
            for (int tableHorizontal = 1; tableHorizontal <= size; tableHorizontal++) {
                System.out.print(tableHorizontal + "|" + "\t");
                for (int rows = 1; rows <= size; rows++) {
                    value =  tableHorizontal * rows;
                    System.out.print(value + "\t");
                }
                System.out.println();
            }
        }
    else{
            System.out.println("Not a valid table size from 1 to 5, please try again.");
        }
        System.out.println("Enter a table number from 1 to 5 (Press 0 to quit): ");
        size = scan.nextInt();
    }

        System.out.println("\nDone!");
    }
}
/* Your output here:
Please enter the table size from 1 to 5 (0 to quit): 3
	1	2	3
	-	-	-
1|	1	2	3
2|	2	4	6
3|	3	6	9
Enter a table number from 1 to 5 (Press 0 to quit):
10
Not a valid table size from 1 to 5, please try again.
Enter a table number from 1 to 5 (Press 0 to quit):
0

Done!
 */
