package chapter8;

import java.util.Scanner;

public class wordBackwards {
    public static void main(String args[]) {
        /*
        Write a method that prints a given
        String backwards. For example,
        if given camel, it prints lemac.
         */

        Scanner scanner = new Scanner(System.in);
        String givenWord = scanner.nextLine();
        System.out.println(printBackwards(givenWord));


    }

    private static String printBackwards(String string) {
        char[] charArray = string.toCharArray();

        char[] charBackwardsArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {

            charBackwardsArray[i] = charArray[(charArray.length - 1) - i];
        }

        String wordBackwards = new String(charBackwardsArray);

        return wordBackwards;
    }
}