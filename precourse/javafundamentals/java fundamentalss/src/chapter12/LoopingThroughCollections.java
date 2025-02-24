package chapter12;

import java.util.HashSet;
import java.util.Set;

public class LoopingThroughCollections {
    public static void main(String[] args) {

    }

    public static void setDemo() {
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
    }
}
