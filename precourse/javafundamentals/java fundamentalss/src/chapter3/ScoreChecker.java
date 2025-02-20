package chapter3;

import java.util.Scanner;

public class ScoreChecker {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        char grade;
        int score;
        String message="";

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

        switch (grade){
            case 'A':
                message="Great job!";
                break;
            case 'B':
                message="Nice one! It is important that we value your effort.";
                break;
            case 'C':
                message="You barely passed it, please try harder next time!";
                break;
            case 'D':
                message="Sadly, this is a no pass. Better effort for the upcoming tests please.";
                break;
            default:
                message="Error in your grade. Please check again.";
                break;
        }

        System.out.println(message);



    }
}
