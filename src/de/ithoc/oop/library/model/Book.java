package de.ithoc.oop.library.model;

public class Book {

    private String id; // mandatory field
    private String title;
    private boolean lent = false;

    public Book(String id) {
        this.id = id;
    }

    public void lendOut() {
        lent = true;
    }

    public void giveBack() {
        lent = false;
    }


    public String toString() {
        return id + ": " + title;
    }


    public String getId() {
        return id;
    }

    public boolean isLent() {
        return lent;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}
