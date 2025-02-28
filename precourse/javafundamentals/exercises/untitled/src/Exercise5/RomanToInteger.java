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

        System.out.println(romToInt("III"));

        System.out.println(romToInt("IV"));

        System.out.println(romToInt("IX"));

        System.out.println(romToInt("LVIII"));

        System.out.println(romToInt("MCMXCIV"));

        System.out.println(romToInt("XL"));

        System.out.println(romToInt("CDXLIV"));

        System.out.println(romToInt("MMM"));

        System.out.println(romToInt("DCVII"));

        System.out.println(romToInt("CXC"));
    }

    public static Integer romToInt(String string) {
        HashMap<Character, Integer> romValues = new HashMap<>();

        romValues.put('I', 1);
        romValues.put('V', 5);
        romValues.put('X', 10);
        romValues.put('L', 50);
        romValues.put('C', 100);
        romValues.put('D', 500);
        romValues.put('M', 1000);

        char[] charArray = string.toUpperCase().toCharArray();

        int resultSum = 0;

        for (int i = 0; i < charArray.length; i++) {

            if ((i + 1) < charArray.length) {
                if (romValues.get(charArray[(i + 1)]) > romValues.get(charArray[i]) || romValues.get(charArray[(i + 1)]) == romValues.get(charArray[i])) {
                    resultSum += romValues.get(charArray[i]);
                } else {
                    resultSum += (romValues.get(charArray[(i + 1)]) - romValues.get(charArray[i]));
                    i++;
                }
            } else resultSum += romValues.get(charArray[i]);

        }

        return resultSum;
    }
}
