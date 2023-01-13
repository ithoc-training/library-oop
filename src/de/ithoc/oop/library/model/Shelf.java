package de.ithoc.oop.library.model;

import java.util.ArrayList;

public class Shelf {
    
    private int capacity; // mandatory field
    private ArrayList<Book> books = new ArrayList<>();


    public Shelf() {
        capacity = 200;
    }

    public Shelf(int capacity) {
        this.capacity = capacity;
    }


    public void putOn(Book book) {
        if(books.size() <= capacity) {
            books.add(book);
        } else {
            System.out.println("Shelf is full and book must be put somewhere else.");
        }
    }

    public Book takeOut(String bookId) {
        for(Book book : books) {
            if(book.getId() == bookId) {
                books.remove(book);
                return book;
            }
        }

        return null; // no book with given number has been found
    }

    public ArrayList<Book> viewBooks() { // attention this book list is still mutable
        return books;
    }


    public int getCapacity() {
        return capacity;
    }

}
