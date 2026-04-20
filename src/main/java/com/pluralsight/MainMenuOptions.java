package com.pluralsight;

import java.util.Scanner;

import static com.pluralsight.CheckInBooks.checkBookIn;
import static com.pluralsight.CheckOutBooks.chooseBookToCheckOut;
import static com.pluralsight.CheckOutBooks.showCheckedOutBooks;
//import static com.pluralsight.InputScanner.userInputInt;
import static com.pluralsight.Main.*;

//Display options on the main menu

public class MainMenuOptions {

    public static void libraryHomeScreen(){
        System.out.println("Welcome to the Neighborhood Library Book Application Main Menu.");
        System.out.println("What would you like to do?");
        System.out.println("1. Show Available Books");
        System.out.println("2. Show Checked Out Books");
        System.out.println("3. Check In Books");
        System.out.println("4. Exit Application");
    }


    public static void libraryMenuOptions(Book[] books) {


       Scanner reader = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            libraryHomeScreen();
            int userOption = reader.nextInt();

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
                case 4:
                    goodbyeMessage();

                    isRunning = false;
                default:
                    return;
            }
        }
        reader.close();
    }
}
