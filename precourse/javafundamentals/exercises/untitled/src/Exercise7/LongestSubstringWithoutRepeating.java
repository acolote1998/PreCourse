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

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));

        System.out.println(lengthOfLongestSubstring("bbbbb"));

        System.out.println(lengthOfLongestSubstring("pwwkew"));


    }

    public static int lengthOfLongestSubstring(String str) {
        int maxDifferent = 0;
        char[] charArray = str.toLowerCase().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (maxDifferent != 0) {
                if (charArray[(i - 1)] == charArray[i]) {
                    maxDifferent++;
                }
            } else maxDifferent++;
        }

        return maxDifferent;
    }
}
