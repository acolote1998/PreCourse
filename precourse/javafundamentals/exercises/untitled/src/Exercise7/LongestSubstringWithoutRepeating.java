package Exercise7;

/*

🚀 Exercise: Find the Longest Substring Without Repeating Characters

Problem Description:

You are given a string s. Your task is to find the length of the longest substring without repeating characters.

Function Signature:

public static int lengthOfLongestSubstring(String s);

Input:
A string s of length n (1 <= n <= 10^4).

Output:
An integer representing the length of the longest substring without repeating characters.

Example:



System.out.println(lengthOfLongestSubstring("abcabcbb")); // Expected Output: 3

System.out.println(lengthOfLongestSubstring("bbbbb")); // Expected Output: 1

System.out.println(lengthOfLongestSubstring("pwwkew")); // Expected Output: 3

 */

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));// Expected Output: 3

        System.out.println(lengthOfLongestSubstring("bbbbb"));// Expected Output: 1

        System.out.println(lengthOfLongestSubstring("pwwkew"));// Expected Output: 3

        System.out.println(lengthOfLongestSubstring("abcdefg")); // Expected Output: 7

        System.out.println(lengthOfLongestSubstring("abcdefghijabcdefghij")); // Expected Output: 10


    }

    public static int lengthOfLongestSubstring(String str) {
        int maxDifferent = 0;
        int changingCounter = 0;

        char[] charArray = str.toLowerCase().toCharArray();

        HashMap<Character, Integer> containedLetters = new HashMap<>();

        for (int i = 0; i < charArray.length; i++) {

            //If the char is already in the hashmap
            if (containedLetters.containsKey(charArray[i])) {
                changingCounter = 1;
                containedLetters.replace(charArray[i], i);
            } else {
                containedLetters.putIfAbsent(charArray[i], i);
                changingCounter++;
            }
            if (changingCounter > maxDifferent) {
                maxDifferent = changingCounter;
            }

        }


        return maxDifferent;
    }
}
