package CH4;

import java.util.Scanner;

public class ChFourLabOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInput;
        int max = 0;
        double count = 0;
        double average;
        double sum = 0;

        userInput = scan.nextInt();

        while (userInput >= 0) {
            count++;
            sum = sum + userInput;
            max = Math.max(max, userInput);
            userInput = scan.nextInt();

        }

        System.out.print(max + " ");
        average = sum / count;
        System.out.printf("%.2f\n", average);
    }
}
