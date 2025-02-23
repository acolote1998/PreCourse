package chapter8;

/*
Write a method that adds spaces to a jumbled
String where all words are written together
with no spaces. Each new words begins with a capital letter.
 */

import java.util.Scanner;

public class SpaceToString {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a Jumbled phrase");
        String jumbledPhrase = scanner.nextLine();

    }

    public static String jumbledToSpaced(String string) {
        char[] jumbledCharacters = string.toCharArray();
        int amountOfWords = 0;

        for (int i = 0; i < jumbledCharacters.length; i++) {
            if (String.valueOf(jumbledCharacters[i]).equals(String.valueOf(jumbledCharacters[i]).toUpperCase())) {
                amountOfWords++;
            }
        }

        char[] properCharArray = new char[jumbledCharacters.length + (amountOfWords - 1)];

        for (int i = 0; i < properCharArray.length; i++) {

        }
        return null;
    }
}
