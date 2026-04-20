package com.pluralsight;

import static com.pluralsight.CheckOutBooks.showCheckedOutBooks;
import static com.pluralsight.InputScanner.userInputInt;

//allows user to check in books
//changes all book properties to reflect no longer being checked out

public class CheckInBooks {
    public static void checkBookIn(Book[] books){
        showCheckedOutBooks(books);
        System.out.println("Enter in the ID number of the book you'd like to return: ");
        int userBook = userInputInt();
        for (Book book : books) {
            if (book.getId() == userBook) {
                book.setCheckedOut(false);
                String name = "";
                book.setDateBookIsDue(null);
                book.setDateBookWasCheckedOut(null);
                book.setCheckedOutTo(name);
                System.out.println(book.displayBookInformation());
                System.out.println("Book checked In.");
            }
        }
    }
}
