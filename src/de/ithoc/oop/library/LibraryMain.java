package de.ithoc.oop.library;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

import de.ithoc.oop.library.model.Book;
import de.ithoc.oop.library.model.Shelf;

public class LibraryMain {
    
    private static final int SHELF_CAPACITY_IN_LIBRARY = 300;
    private static final int BOOK_CAPACITY_ON_SHELF = 100;

    private static ArrayList<Shelf> shelves = new ArrayList<>();

    public static void main(String[] args) {
        
        // Create a bunch of shelves.
        for(int index = 0; index < SHELF_CAPACITY_IN_LIBRARY; index++) {

            Shelf shelf = new Shelf(BOOK_CAPACITY_ON_SHELF);

            // Create a bunch of books.
            for(int bookIndex = 0; bookIndex < shelf.getCapacity(); bookIndex++) {
                
                String uuid = UUID.randomUUID().toString(); // Create unique book id.
                Book book = new Book(uuid);                 // Instantiate a book object from class.
                book.setTitle("Book '" + uuid + "'");       // Generate any title and set it.

                if(index % 2 == 0) {                        // Every other book is lent out by modulo
                    book.lendOut();
                }

                shelf.putOn(book); // Put the book on the shelf.
            }
            
            shelves.add(shelf); // Place the shelf into the library.
        }

        System.out.println("Number of shelves in library: " + shelves.size());
        printOut(shelves);        
    }


    /*
     * Print out every available and len book.
     */
    private static void printOut(ArrayList<Shelf> shelves) {
        
        for(Shelf shelf : shelves) {
            for(Book book : shelf.viewBooks()) {
                if(!book.isLent()) {
                    System.out.println("Available -> " + book.toString());
                } else {
                    System.out.println("Lent      -> " + book.toString());
                }
            }
        }
    }

}
