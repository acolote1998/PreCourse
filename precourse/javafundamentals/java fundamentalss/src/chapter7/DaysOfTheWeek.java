package chapter7;

/*
Make an array that holds the textual values of the days of the week

Have the user input a number corresponding to the day of the week.
Assume that the week starts on monday

Your program should output the String that represents the day of the week

Example: User inputs the number 1, your program should print "Monday"
 */

import java.util.Scanner;

public class DaysOfTheWeek {

    private static String days[] = new String[7];

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        initialiseArray(days);

        System.out.println("Please write a number from 1 to 7 and we will assign a day to you");
    }

    public static void initialiseArray(String[] array) {
        array[0] = "Monday";
        array[1] = "Tuesday";
        array[2] = "Wednesday";
        array[3] = "Thursday";
        array[4] = "Friday";
        array[5] = "Saturday";
        array[6] = "Sunday";
    }

    public static String returnDayString(int number) {
        return days[(number - 1)];
    }

}
