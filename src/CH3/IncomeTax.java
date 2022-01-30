package CH3;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int annualSalary;
        double taxRate;
        int taxToPay;

        System.out.println("Enter annual salary: ");
        annualSalary = scnr.nextInt();

        // Determine the tax rate from the annual salary
        // FIXME: Write code to address the challenge question above
        if (annualSalary <= 20000) {
            taxRate = 0.10;
        }
        else if (annualSalary <= 50000) {
            taxRate = 0.20;
        }
        else if ((annualSalary > 50000) && (annualSalary <= 100000)) {
            taxRate = 0.30;
        }
        else {
            taxRate = 0.40;
        }

        taxToPay = (int)(annualSalary * taxRate);     // Truncate tax to an integer amount
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Tax rate: " + taxRate);
        System.out.println("Tax to pay: " + taxToPay);
    }
}
