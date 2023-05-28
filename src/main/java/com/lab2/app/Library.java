package com.lab2.app;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN) && !book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.println("Book with ISBN " + ISBN + " has been borrowed.");
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " is not available for borrowing.");
    }

    public void returnBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN) && book.isBorrowed()) {
                book.setBorrowed(false);
                System.out.println("Book with ISBN " + ISBN + " has been returned.");
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " is not borrowed.");
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void printAvailableBooks() {
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }
}
