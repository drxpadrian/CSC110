package CH7;

import java.util.Scanner;

public class StudentScoresModifyArraysUsingOtherElements {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int SCORES_SIZE = 4;
        int[] bonusScores = new int[SCORES_SIZE];
        int i;

        for (i = 0; i < bonusScores.length; ++i) {
            bonusScores[i] = scnr.nextInt();
        }

        for (i = 0; i < bonusScores.length - 1; ++i) {
            bonusScores[i] = bonusScores[i] + bonusScores[i + 1];
        }

        for (i = 0; i < bonusScores.length; ++i) {
            System.out.print(bonusScores[i] + " ");
        }
        System.out.println();
    }
}

