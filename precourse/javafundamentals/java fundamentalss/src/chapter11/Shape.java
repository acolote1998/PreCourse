package chapter11;

/*
Learning Abstraction
 */
public abstract class Shape {

    abstract double calculateArea();

    public void print() {
        System.out.println("I am a shape");
    }
}
