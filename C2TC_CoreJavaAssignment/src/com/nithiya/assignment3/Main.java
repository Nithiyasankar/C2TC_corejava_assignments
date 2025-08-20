package com.nithiya.assignment3;

import assignment_3.Book;
import assignment_3.Library;
import assignment_3.Magazine;

public class Main {
    public static void main(String[] args) {
        // Inheritance demonstration
        Book book = new Book(101, "Java Basics", "James Gosling");
        Magazine magazine = new Magazine(201, "Tech Today", 45);

        book.displayInfo();
        magazine.displayInfo();

        // Composition demonstration
        Library library = new Library();
        library.addItem(book);
        library.addItem(magazine);

        library.showAllItems();
    }
}