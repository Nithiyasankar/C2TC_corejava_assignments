package com.nithiya.assignment3;

import com.nithiya.assignment3.*;
import com.nithiya.assignment3.Library;

public class Main {
    public static void main(String[] args) {
        // Part A – Inheritance (is-a)
        Book book1 = new Book(101, "Java Basics", "James Gosling");
        Magazine mag1 = new Magazine(201, "Tech Today", 45);

        book1.displayInfo();
        mag1.displayInfo();

        // Part B – Composition (has-a)
        Library lib = new Library();
        lib.addItem(book1);
        lib.addItem(mag1);

        lib.showAllItems();
    }
}