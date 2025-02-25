package chapter12;

/*

Students were given a pop quiz, and collectively, the did not do so well.
As a result, the instructor decided to give them a make up exam to allow
them to improve their scores.

Given two maps of test scores, update the student's grades only if
they did better on the make up exam.

Print the final grades.

 */

import java.util.HashMap;
import java.util.Map;

public class TestResults {
    public static void main(String[] args) {

    }

    public static Map<String, Integer> initialGrades() {
        Map<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Aki", 35);
        studentGrades.put("Ben", 80);
        studentGrades.put("Clara", 92);
        studentGrades.put("Diego", 67);
        studentGrades.put("Elena", 74);
        studentGrades.put("Felix", 89);
        studentGrades.put("Grace", 58);
        studentGrades.put("Hugo", 90);
        studentGrades.put("Isla", 77);
        studentGrades.put("Jack", 63);

        return studentGrades;
    }

}
