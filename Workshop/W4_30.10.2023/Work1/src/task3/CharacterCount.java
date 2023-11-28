package task3;

import java.util.Scanner;

public class CharacterCount {
    private static final int MAX_CHAR = 256;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word : ");
        String word = input.nextLine();

        //Creates an array like an ASCII table, all values is equal to 0.
        int[] count = new int[MAX_CHAR];
        int len = word.length();

        //Counting part within ASCII arrays
        for (int i = 0; i < len; i++)
            count[word.charAt(i)]++;

        char[] ch = new char[word.length()];

        //Printing part
        for (int i = 0; i < len; i++) {
            ch[i] = word.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (word.charAt(i) == ch[j])
                    find++;
            }
            //Print only once found, not twice
            if (find == 1)
                System.out.println("Number of Occurrence of " + word.charAt(i) + " is:" + count[word.charAt(i)]);
        }
    }

}
