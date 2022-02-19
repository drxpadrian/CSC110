package CH3;
/*
* Using a conditional expression, write a statement that increments numUsers if updateDirection is 1,
* otherwise decrements numUsers. Ex: if numUsers is 8 and updateDirection is 1,
* numUsers becomes 9; if updateDirection is 0, numUsers becomes 7.
* Hint: Start with "numUsers = ...".
*/
import java.util.Scanner;

public class UpdateNumberOfUsers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numUsers;
        int updateDirection;

        System.out.println("Enter number of users: ");
        numUsers = scnr.nextInt();
        System.out.println("Enter direction(number): ");
        updateDirection = scnr.nextInt();

        numUsers = (updateDirection == 1) ? numUsers + 1 : numUsers - 1;

        System.out.println("New value is: " + numUsers);
    }
}
