package Exercise1;

/*

Exercise 2: Check if a String is a Palindrome

Palindrome Checker

Problem Description:

Write a function that checks whether a given string is a palindrome. A palindrome is a word, phrase, or sequence that reads the same backward as forward, ignoring spaces, punctuation, and capitalization.

Function Signature:

public static boolean isPalindrome(String str);

Input:

A single string str (1 <= str.length <= 1000) containing alphanumeric characters and possibly spaces or punctuation.

Output:

Return true if the string is a palindrome, false otherwise.
Examples:

isPalindrome("A man a plan a canal Panama") should return true
isPalindrome("racecar") should return true
isPalindrome("hello") should return false

 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        isAPalindrome(scanner.nextLine());
    }

    public static boolean isAPalindrome(String str) {
        boolean isPal = false;
        char[] cleanString = str.trim().replace(" ", "").toLowerCase().toCharArray();
        return isPal;
    }
}


