package Exercise6;

/*

🚀 Exercise 6: Find the Missing Number in an Array
Problem Description
You are given an array of integers from 1 to n, where one number is missing. Write a function that finds and returns the missing number. You must solve it without sorting the array.

Function Signature:

java
Copy
Edit
public static int findMissingNumber(int[] arr);
Input:

An array arr of integers containing n-1 numbers from 1 to n, where one number is missing.
The length of the array will be between 1 and 1000.
Output:

Return the missing number.

 */

public class FindingMissingInt {
    public static void main(String[] args) {

    }

    public static Integer findMissingNumber(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] + 1) != arr[(i + 1)]) {
                return arr[(i + 1)];
            }
        }
        return null;
    }
}
