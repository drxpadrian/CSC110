package CH2;

import java.util.Scanner;

public class DivideInputIntegers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userNum;
        int divNum;
        int result;

        System.out.println("Beep Boop, this program divides input integers 3 times! :)");


        System.out.println("Enter a number: ");
        userNum = scan.nextInt();
        System.out.println("What do you want to divide the first number by? ");
        divNum = scan.nextInt();

        result = userNum / divNum;

        System.out.print(result + " ");
        System.out.print(result / divNum + " ");
        result = result / divNum;
        System.out.println(result / divNum);
    }
}
