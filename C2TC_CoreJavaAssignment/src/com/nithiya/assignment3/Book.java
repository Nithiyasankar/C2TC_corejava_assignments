package com.nithiya.assignment3;

import assignment_3.Item;

public class Book extends Item {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: [ID: " + super.toString() + ", Title: " + getTitle() + ", Author: " + author + "]");
    }

    @Override
    public String toString() {
        return getTitle() + " by " + author;
    }
}