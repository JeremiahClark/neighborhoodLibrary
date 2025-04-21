package com.pluralsight;

public class BookInventory {

    public static void main(String[] args) {
        // Create an inventory of 20 books
        Book[] inventory = new Book[20];

        for (int i = 0; i < inventory.length; i++) {
            inventory[i] = new Book(i + 1, "ISBN" + (1000 + i), "Sample Book Title " + (i + 1));
        }

        // Display all books
        System.out.println("Initial Book Inventory:");
        for (Book book : inventory) {
            System.out.println(book);
        }

        // Check out book 3
        inventory[2].checkOut("Jeremiah");

        // Try checking it out again
        inventory[2].checkOut("Jaiden");

        // Check in book 3
        inventory[2].checkIn();

        // Try checking in again
        inventory[2].checkIn();
    }
}



















