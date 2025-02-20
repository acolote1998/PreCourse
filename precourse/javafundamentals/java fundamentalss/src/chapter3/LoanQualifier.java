package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String arg[]){
        // To qualify for a loan, a person must take at least
        // 30 000 and have been working at their current job
        // for at least 2 years.

        int salaryRequeriment = 30000;
        int monthsWorking = 24;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your salary:");
        int usersSalary = scanner.nextInt();

    }
}
