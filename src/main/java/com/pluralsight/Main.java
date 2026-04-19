package com.pluralsight;

import static com.pluralsight.InputScanner.userInputInt;
import static com.pluralsight.InputScanner.userInputString;


public class Main {
    public static void main(String[] args){
        Book[] books = BookRepository.allLibraryBooks();
        libraryHomeScreen();
        MainMenuOptions.libraryMenuOptions(books);

    }

    public static void libraryHomeScreen(){
        System.out.println("Welcome to the Neighborhood Library Book Application Main Menu.");
        System.out.println("What would you like to do?");
        System.out.println("1. Show Available Books");
        System.out.println("2. Show Checked Out Books");
        System.out.println("3. Check In Books");
        System.out.println("4. Exit Application");
    }

    public static void showAvailableBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (!books[i].isCheckedOut()) { //checks if the book at the current index is checked out or not
                System.out.println(books[i].displayBookInformation()); //if book at current index isn't checked out, prints book information
            }
        }
    }

    public static int getUserBookId(){
        return userInputInt();
    }

    public static Book findBook(Book[] books, int userBookId){
        for(Book book : books){
            if (book.getId() == userBookId){
                return book;
            }
        }
        return null;
    }

public static String inputUserName(){
    System.out.println("Enter in your name: ");
    String name = userInputString();
    return name;
}

    public static void goodbyeMessage(){
        System.out.println("Thank you for supporting your community library. \nHave a good day!");
    }
}
