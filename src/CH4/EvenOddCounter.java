//Program Name: UsernameGenerator.java
//Author: Adrian Linares
//Class: CSC110AB
//Date Written: 2/18/2022
//Brief Description: This program prompts the user for integers and identifies which number are odd or even, if a zero
//is pressed the program ends.
package CH4;

import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int value;
        int i = 1;
        int even = 0;
        int odd = 0;

        System.out.println("Even or Odd counter");
        System.out.println("-------------------");
        System.out.println("Please enter a series of integer values. 0 to quit.");
        System.out.println("Enter value " + i + ": ");

        value = scan.nextInt();

        while (value != 0) {
            if (value % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            i++;

            System.out.println("Enter value " + i + ": ");
            value = scan.nextInt();
        }
        System.out.println("The results: ");
        System.out.println("-------------");

        if (i == 1) {
            System.out.println("No values were entered");
        } else {
            System.out.println("Total values entered: " + (even + odd));
            System.out.println("Even values entered: " + even);
            System.out.println("Odd values entered: " + odd);
        }
    }
}
/* Your output here
Even or Odd counter
-------------------
Please enter a series of integer values. 0 to quit.
Enter value 1:
34
Enter value 2:
-2
Enter value 3:
3
Enter value 4:
0
The results:
-------------
Total values entered: 3
Even values entered: 2
Odd values entered: 1
 */