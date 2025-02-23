package chapter8;

/*
Write a method that counts
the number of words in a
string and prints them
individually on a
new line.
 */

import java.util.Scanner;

public class CountingWords {

    private static String words[];

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a sentence and I will give you back its words");
        String string = scanner.nextLine();
        printWords(words, string);

    }

    public static void printWords(String[] array, String string) {
        array = string.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " " + array[i]);
        }
    }
}
