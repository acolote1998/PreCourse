package chapter12;

import java.util.List;

public class ListOfTest {
    public static void main(String[] args) {
        List unchangableList = List.of("apple", "lemon", "banana");
        unchangableList.add("test"); //this gives this error

        /*

        Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
	at chapter12.ListOfTest.main(ListOfTest.java:8)

        since we cannot change a list that was created with List.of
         */

    }
}
