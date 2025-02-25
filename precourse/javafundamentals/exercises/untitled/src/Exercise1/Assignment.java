package Exercise1;

/*

Exercise 1: Reverse a String

Write a Java method that takes a String as input and returns the reversed version of it.

Example:
Input: "hello"
Output: "olleh"

Requirements:
Do not use built-in methods like StringBuilder.reverse().
Use a loop to construct the reversed string manually.
The method should have the following signature:
public static String reverseString(String input)

 */

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

System.out.println(reverseString(scanner.nextLine()));



    }
    public static String reverseString(String string){

    char[] originalString = string.toCharArray();
    char [] newString = new char[originalString.length];

    for(int i=originalString.length;i>0;i--){
        newString[(originalString.length-i)]=originalString[i-1];
    }
        String result = new String(newString);
    return result;
    }
}
