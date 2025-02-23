package chapter9;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    public void print() {
        System.out.println("I a square");
    }

    public void print(String texto) {
        System.out.println("I am a square," + texto);
    }
}
