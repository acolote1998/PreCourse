package Exercise4;

/*

🚀 Exercise: First Non-Repeating Character
Problem Description:
Write a function that finds the first non-repeating character in a given string and returns it. If all characters repeat, return null.

Function Signature:

public static Character firstNonRepeatingChar(String str);

Input:
A single string str (1 ≤ str.length ≤ 1000) containing only letters (a-z, A-Z).

Output:
Return the first character that appears only once in the string.
If no unique character is found, return null.

 */

import java.util.HashMap;

public class findFirstNonRepeatingChar {
    public static void main(String[] args) {

    }

    public static Character firstNonRepeatingChar(String stringToCheck) {

        HashMap<Character, Integer> charCount = new HashMap<>();

        char[] stringCharArray = stringToCheck.toCharArray();

        for (int i = 0; i < stringCharArray.length; i++) {
            int calculateValue = 1;
            if (charCount.get(stringCharArray[i]) == null) {
                charCount.put(stringCharArray[i], calculateValue);
            } else {
                charCount.put(stringCharArray[i], calculateValue++);
            }
        }

        System.out.println(charCount);

        return null;
    }
}
