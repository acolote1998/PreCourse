package chapter7;

import java.util.Scanner;

/*
Create a program that allows the user to enter any
number of grades and provides them with their
average score, as well as the highest and lowest scores.
 */
public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];
    }
}
