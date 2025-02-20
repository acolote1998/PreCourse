package chapter2.exercise;

import java.util.Scanner;

public class SentenceGenerator {
    public static void main(String args[]){


        //Taks:
        //Create a program that asks a user for a season of the year
        //then a whole number, then an adjective. Use input to complete the
        // sentence below then output the result:

        //"On a [adjective] [season of the year] day, I drink a minimum
        // of [whole number] cups of coffee."

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a season of the year");
        String season = scanner.next();

        System.out.println("Thank you.");

        System.out.println("Please write an integer.");
        int number = scanner.nextInt();

        System.out.println("Thank you.");

        System.out.println("As a last thing, would you please write and adjective for me?.");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("I appreciate it.");

        System.out.println("It seems that on a "+adjective+" "+season+" day, I drink a minimum of "+number+" cups of coffee.");
    }
}
