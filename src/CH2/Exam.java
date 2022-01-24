package CH2;
//Program Name: Exam.java
//Author: Adrian Linares
//Class: CSC110AB
//Date Written: 1/4/2022
//Brief Description: This programs asks for 3 exam scores, and it calculates and displays the average grade.
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int score1;
        int score2;
        int score3;
        double averageScore;

        System.out.println("Welcome to the average exam score calculator!");

        System.out.println("Enter your 1st exam score: ");
        score1 = scnr.nextInt();
        System.out.println("Enter you 2nd exam score: ");
        score2 = scnr.nextInt();
        System.out.println("Enter your 3rd exam score: ");
        score3 = scnr.nextInt();

        averageScore = (double) (score1 + score2 + score3) / 3;

        System.out.println("The average exam score is: " + averageScore);

    }
}
/* MY OUTPUT
Welcome to the average exam score calculator!
Enter your 1st exam score:
90
Enter you 2nd exam score:
91
Enter your 3rd exam score:
100
The average exam score is: 93.66666666666667
*/