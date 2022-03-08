package CH4;

import java.util.Scanner;

public class LabTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int i;

        System.out.println("Enter your first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter your second number: ");
        num2 = scan.nextInt();

        if (num2 < num1) {
            System.out.println("Second integer can't be less than the first.");
        }
        else {
            for (i = num1; i <= num2; i = i + 5) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

