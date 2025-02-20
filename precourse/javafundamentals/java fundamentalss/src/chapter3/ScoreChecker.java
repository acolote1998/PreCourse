package chapter3;

import java.util.Scanner;

public class ScoreChecker {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        char grade;
        int score;

        System.out.println("Please enter your score and we will calculate your grade accordingly.");
        score = scanner.nextInt();

        if (score>90){
            grade = 'A';
        } else if(score>80){

                grade ='B';
            } else if(score>70){
            grade = 'C';
        }else{
            grade = 'D';
        }

        System.out.println("Based on your score, your grade is "+grade+".");


    }
}
