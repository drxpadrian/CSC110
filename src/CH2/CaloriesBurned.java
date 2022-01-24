package CH2;

import java.util.Scanner;

public class CaloriesBurned {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //declare all variables
        int age;
        int weight;
        int heartRate;
        int time;

        double menCalories;

        //read in 4 values for age, weight, heartRate, time
        age = scnr.nextInt();
        weight = scnr.nextInt();
        heartRate = scnr.nextInt();
        time = scnr.nextInt();

        //Calculate calories burned for women and men
        menCalories = ((age * 0.2757) + (weight * 0.03295) + (heartRate * 1.0781) - 75.4991) * time / 8.368;

        //check your answer - then comment out
        //System.out.println("Women: " + womenCalories);
        //System.out.println("Men: " + menCalories);

        //now format using printf.  remember that \n is a newline

        System.out.printf("Calories: %.2f calories\n", menCalories);
    }
}
