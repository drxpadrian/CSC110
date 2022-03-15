package CH7;

import java.util.Scanner;

public class WordFrequencies {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] words = new String[20];

        String currentWord;
        int wordCount = 0; //frequency of a word

        int numWords = scnr.nextInt();//number of words to be read

        for(int x = 0; x < numWords; x++)//load the array with the words
        {
            words[x] = scnr.next();
        }

        for(int x = 0; x < numWords; x++)
        {
            currentWord = words[x];
            wordCount = 0;

            for(int y = 0; y < numWords; y++)
            {
                if(words[y].equals(currentWord))
                    wordCount++;
            }

            System.out.println(currentWord + " - " + wordCount);

        }
    }
}
