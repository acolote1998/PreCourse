package chapter4;

import java.util.Scanner;

public class nestedLoops {
    public static void main(String args[]){
// Find the average test score for each student in the class.
        // There are 24 students and 4 tests

        int numberOfStudents = 24;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);

    for (int i=0;i<numberOfStudents;i++){
        System.out.println("Data for Student "+(i+1));
        int total=0;
        for(int j=0;j<numberOfTests;j++){
            System.out.println("Result of test "+(j+1));
            int resultTest = scanner.nextInt();
            total = total+resultTest;
        }

        System.out.println("The average score of student "+(i+1)+" is "+(total/numberOfTests));

    }

    scanner.close();


    }
}
