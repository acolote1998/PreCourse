package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String args[]){
        // To qualify for a loan, a person must take at least
        // 30 000 and have been working at their current job
        // for at least 2 years.

        int salaryRequeriment = 30000;
        int monthsWorking = 24;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your salary:");
        int usersSalary = scanner.nextInt();

        System.out.println("For how many months have you been working at the company?");
        int usersWorkedMonths = scanner.nextInt();

        scanner.close();

        System.out.println("Thank you. We will proceed to calculate your chances of a loan.");

        if (usersSalary>=salaryRequeriment){
            if (usersWorkedMonths>=monthsWorking){
                System.out.println("We see that you meet the requirements for the loan. Would you be available for a meeting tomorrow at 09:15?");
            }else{
                System.out.println("Sorry, you must work "+ (monthsWorking-usersWorkedMonths) +" more month/s to qualify for this loan.");
            }
        }else {
            System.out.println("Sorry, you must earn at least 30 000 SEK to qualify for this loan.");
        }
    }
}
