package linkedList;

import java.util.*;

public class Linked_List_Demo {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<>();
        books.add("Java Basics");
        books.add("Data Structures");
        books.add("Operating Systems");

        System.out.println("Book List:");
        for (String book : books) {
            System.out.println(book);
        }

        books.addFirst("C Programming");
        books.addLast("DBMS");

        System.out.println("Updated List: " + books);
    }
}
