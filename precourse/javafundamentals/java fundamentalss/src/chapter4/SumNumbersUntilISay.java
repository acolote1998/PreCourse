package chapter4;

import java.util.Scanner;

public class SumNumbersUntilISay {
    public static void main(String args[]){

        // Write a program that allows a user to enter
        // two numbers, and then sums up the two numbers.
        // The user should be able to repeat this action
        // until they indicate they are done.

        Scanner scanner = new Scanner(System.in);
        int numberOne, numberTwo;
        boolean repeat;

        System.out.println("Please write your first number");
        numberOne = scanner.nextInt();

        System.out.println("Please write your second number");
        numberTwo = scanner.nextInt();


    }
}
