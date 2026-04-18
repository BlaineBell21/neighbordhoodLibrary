package com.pluralsight;

import static com.pluralsight.BookRepository.allLibraryBooks;
import static com.pluralsight.Main.*;



public class MainMenuOptions {
    public static String libraryMenuOptions() {
        int userOption = userInputInt();
        switch (userOption) {
            case 1: //displays all available books
                showAvailableBooks(allLibraryBooks());
                System.out.println("What book would you like to checkout?");
                Book[] arrayOfBooks = allLibraryBooks();
                checkBookOut(arrayOfBooks);
                break;
            case 2: //displays all checked out books
                showCheckedOutBooks(allLibraryBooks());
                break;
            case 3: //allows user to check a book in

                checkBookIn(allLibraryBooks());
                break;
            case 4:
                goodbyeMessage();
                break;
        }
        return "Invalid option, please try again.";
    }
}
