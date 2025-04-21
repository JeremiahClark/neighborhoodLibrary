package com.pluralsight;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructor
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Methods
    public void checkOut(String name) {
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println("Book \"" + title + "\" checked out to " + name + ".");
        } else {
            System.out.println("Book \"" + title + "\" is already checked out to " + checkedOutTo + ".");
        }
    }

    public void checkIn() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Book \"" + title + "\" checked in from " + checkedOutTo + ".");
            checkedOutTo = "";
        } else {
            System.out.println("Book \"" + title + "\" is not checked out.");
        }
    }


    @Override
    public String toString() {
        return id + " | " + title + " | ISBN: " + isbn +
                (isCheckedOut ? " | Checked out to: " + checkedOutTo : " | Available");
    }
}









