package Exercise8;

/*

🚀 Exercise: Rotate an Array
Problem Description:
You are given an array arr[] of n elements and an integer k. Write a function to rotate the array arr[] to the right by k steps. The rotation should be done in-place.

Function Signature:

public static void rotateArray(int[] arr, int k);

Input:
An array of integers arr[] (1 <= arr.length <= 10^4).
An integer k (0 <= k <= arr.length).

Output:
The array rotated by k steps to the right.

Example:
System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 2))); // Expected Output: [4, 5, 1, 2, 3]
System.out.println(Arrays.toString(rotateArray(new int[]{7, 8, 9}, 1))); // Expected Output: [9, 7, 8]
System.out.println(Arrays.toString(rotateArray(new int[]{1, 2}, 3))); // Expected Output: [2, 1]

Additional Considerations:
You can assume k is always a valid input (i.e., between 0 and the length of the array).
Think of an efficient way to perform the rotation without creating a new array (i.e., do it in-place).

 */

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 2))); // Expected Output: [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(rotateArray(new int[]{7, 8, 9}, 1)));       // Expected Output: [9, 7, 8]
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2}, 3)));         // Expected Output: [2, 1]
        System.out.println(Arrays.toString(rotateArray(new int[]{1}, 10)));           // Expected Output: [1] (solo un número, nada que rotar)
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 0))); // Expected Output: [1, 2, 3, 4, 5] (0 pasos, no cambia nada)
        System.out.println(Arrays.toString(rotateArray(new int[]{42, 69, 13}, 3)));    // Expected Output: [42, 69, 13] (si k == array.length, se queda igual)
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 10))); // Expected Output: [1, 2, 3, 4, 5] (10 == 0 porque 10 % 5 == 0)
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 11))); // Expected Output: [5, 1, 2, 3, 4] (11 == 1 porque 11 % 5 == 1)
        System.out.println(Arrays.toString(rotateArray(new int[]{-1, -2, -3, -4, -5}, 2))); // Expected Output: [-4, -5, -1, -2, -3]


    }

    public static int[] rotateArray(int[] arr, int steps) {
        int stepsToMove = steps % arr.length;

        flipArray(arr, 0, arr.length - 1);

        flipArray(arr, 0, stepsToMove - 1);

        flipArray(arr, stepsToMove, arr.length - 1);

        return arr;
    }

    public static void flipArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
