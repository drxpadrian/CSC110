package CH3;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int hourlyWage;
        int weeklyHours;
        int weeklySalary;
        int overtimeHours;
        final int WEEKLY_LIMIT = 40;

        System.out.println("Enter hourly wage: ");
        hourlyWage = scnr.nextInt();

        System.out.println("Enter weekly hours: ");
        weeklyHours = scnr.nextInt();

        if (weeklyHours <= WEEKLY_LIMIT) {
            weeklySalary = weeklyHours * hourlyWage;
        } else {
            overtimeHours = weeklyHours - WEEKLY_LIMIT;
            weeklySalary = (int) ((hourlyWage * WEEKLY_LIMIT) +
                    (hourlyWage * overtimeHours * 1.5));
        }
        System.out.print("Weekly salary is: " + weeklySalary);
    }
}