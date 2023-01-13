package de.ithoc.oop.library.model;

public class Book {

    private String title;
    private boolean lent = false;


    public void lendOut() {
        lent = true;
    }

    public void giveBack() {
        lent = false;
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
