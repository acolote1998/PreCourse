package chapter13;

/*

Write the following statement and excute:

int c = 30 / 0;

Update program to handle exception.

Print a statement after division to say "Division is fun".
This statement should be outputted no matter what.

 */

public class DividingByZero {
    public static void main(String[] args) {

        try {

            int c = 30 / 0;

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Division is fun");
        }

    }
}
