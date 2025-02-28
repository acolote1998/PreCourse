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

        System.out.println(findMissingNumber(new Integer[]{1, 2, 4, 5, 6})); // Expected Output: 3

        System.out.println(findMissingNumber(new Integer[]{1, 3, 4, 5, 6})); // Expected Output: 2

        System.out.println(findMissingNumber(new Integer[]{2, 3, 4, 5, 6})); // Expected Output: 1

        System.out.println(findMissingNumber(new Integer[]{1})); // Expected Output: null

        System.out.println(findMissingNumber(new Integer[]{10, 12, 13, 14})); // Expected Output: 11

    }

    public static Integer findMissingNumber(Integer[] arr) {

        //n = amount of numbers including the missing one
        //arraySum = total sum of the array indexes
        //expectedSum = total expected value including the missing number

        int n = arr.length + 1;
        int arraySum = 0;
        int expectedSum = 0;

        if (2 > arr.length) {
            return null;
        } else {
            for (int i = 0; i < arr.length; i++) {

                arraySum += arr[i];


            }
            expectedSum = ((arr[0] + arr[arr.length - 1]) * n) / 2;


            return expectedSum - arraySum;
        }
    }
}
