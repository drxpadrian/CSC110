package CH6;

import java.util.Scanner;

public class ComputeOffset {
    public static void main(String[] args) {
        final int NUM_VALS = 4;
        int[] origList = new int[NUM_VALS];
        int[] offsetAmount = new int[NUM_VALS];
        int i;
        Scanner input = new Scanner(System.in);

        origList[0] = input.nextInt();
        origList[1] = input.nextInt();
        origList[2] = input.nextInt();
        origList[3] = input.nextInt();

        offsetAmount[0] = input.nextInt();
        offsetAmount[1] = input.nextInt();
        offsetAmount[2] = input.nextInt();
        offsetAmount[3] = input.nextInt();

        String product = "";

        for(i = 0; i <= origList.length - 1; i++)
        {
            product += Integer.toString(origList[i] *= offsetAmount[i]) + " ";
        }

        System.out.print(product);

        System.out.println();
    }
}
