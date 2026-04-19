package com.pluralsight;

import static com.pluralsight.CheckInBooks.checkBookIn;
import static com.pluralsight.CheckOutBooks.chooseBookToCheckOut;
import static com.pluralsight.CheckOutBooks.showCheckedOutBooks;
import static com.pluralsight.InputScanner.userInputInt;
import static com.pluralsight.Main.*;

//Display options on the main menu

public class MainMenuOptions {
    public static void libraryMenuOptions(Book[] books) {
        boolean isRunning = true;
        while (isRunning) {
            int userOption = userInputInt();
            if (userOption == 4){
                goodbyeMessage();
                isRunning = false;
            }
            switch (userOption) {
                case 1: //displays all available books
                    showAvailableBooks(books);
                    chooseBookToCheckOut(books);
                    break;
                case 2: //displays all checked out books
                    showCheckedOutBooks(books);
                    libraryHomeScreen();
                    libraryMenuOptions(books);
                    break;
                case 3: //allows user to check a book in
                    checkBookIn(books);
                    break;
                default:
                    return;
            }
        }
    }
}
