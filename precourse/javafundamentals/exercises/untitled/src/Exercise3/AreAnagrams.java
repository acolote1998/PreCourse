package Exercise3;

import java.util.Arrays;
import java.util.Scanner;

/*

Exercise: Anagram Checker
Problem Description:
Write a function that checks whether two given strings are anagrams of each other. Two words are anagrams if they contain the same characters in the same frequency, but in a different order. Ignore spaces, punctuation, and capitalization.

Function Signature:

public static boolean areAnagrams(String str1, String str2);

Input:
Two strings, str1 and str2, containing alphanumeric characters and possibly spaces or punctuation.
Output:
Return true if the two strings are anagrams, false otherwise.

 */
public class AreAnagrams {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First string:");
        String string1 = scanner.nextLine();
        System.out.println("Second string:");
        String string2 = scanner.nextLine();

        System.out.println(isAnagram(string1, string2));
    }

    public static boolean isAnagram(String string1, String string2) {
        char[] firstString = string1.replaceAll(" ", "").toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        Arrays.sort(firstString);

        char[] secondString = string2.replaceAll(" ", "").toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        Arrays.sort(secondString);

        return Arrays.equals(firstString, secondString);
    }
}
