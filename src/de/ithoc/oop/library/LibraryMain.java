package de.ithoc.oop.library;

import java.util.ArrayList;
import java.util.UUID;

import de.ithoc.oop.library.model.Book;

public class LibraryMain {
    
    private static ArrayList<Book> stock = new ArrayList<>();

    public static void main(String[] args) {
        
        // Create a bunch of randomly generated books.
        for(int index = 0; index < 17; index++) {
            Book book = new Book();
            book.setTitle(generateAnyTitle(index + 1));

            stock.add(book);
        }

        System.out.println("Number of books in stock: " + stock.size());
        
        // Print out every title.
        for(Book book : stock) {
            System.out.println(book.getTitle());
        }

    }


    /*
     * Generate any title for test purposes.
     */
    private static String generateAnyTitle(int anyNumber) {
        String anyTitle = "Book " + anyNumber;

        return anyTitle;
    }

}
