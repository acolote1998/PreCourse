package Exercise5;

/*

🚀 Exercise 5: Roman to Integer
Problem Description
Roman numerals are used to represent integer values with specific symbols. Your task is to write a function that converts a given Roman numeral into its corresponding integer value.

Roman numerals are read from left to right, but there's a twist:

If a smaller-value symbol appears before a larger-value symbol, it is subtracted.
If a smaller-value symbol appears after a larger-value symbol, it is added.

🔑 Rules
Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000

 */

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

    }

    public static Integer romToInt(String string) {
        HashMap<String, Integer> romValues = new HashMap<>();

        romValues.put("I", 1);
        romValues.put("V", 5);
        romValues.put("X", 10);
        romValues.put("L", 50);
        romValues.put("C", 100);
        romValues.put("D", 500);
        romValues.put("M", 1000);

        char[] charArray = string.toUpperCase().toCharArray();
        return 0;
    }
}
