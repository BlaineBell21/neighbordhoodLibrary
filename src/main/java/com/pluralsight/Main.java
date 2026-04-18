package com.pluralsight;
import java.util.Scanner;

import static com.pluralsight.BookRepository.allLibraryBooks; //import for all stored books

public class Main {
    public static void main(String[] args){
        libraryHomeScreen();

    }
    public static void libraryHomeScreen(){
        System.out.println("Welcome to the Neighborhood Library Book Application Main Menu.");
        System.out.println("What would you like to do?");

        System.out.println("1. Show Available Books");
        System.out.println("2. Show Checked Out Books");
        System.out.println("3. Check In Books");
        System.out.println("4. Exit Application");
        libraryMenuOptions(userInputInt());
    }
    public static String libraryMenuOptions(int userOption){
        switch (userOption) {
            case 1: //displays all available books
                showAvailableBooks(allLibraryBooks());
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


    public static void showAvailableBooks(Book[] arrayOfBooks) {
        for (int i = 0; i < arrayOfBooks.length; i++) {
            if (!arrayOfBooks[i].isCheckedOut()) { //checks if the book at the current index is checked out or not
                System.out.println(arrayOfBooks[i].displayBookInformation()); //if book at current index isn't checked out, prints book information
            }
        }
        System.out.println("What book would you like to checkout? Enter in the ID number: ");
    }

    public static void checkBookIn(Book[] books){
        int userBook = userInputInt();
        for (int i = 0; i < books.length; i++){
            if(books[i].getId() == userBook){
                books[i].setCheckedOut(false);
                System.out.println("Enter in your name: ");
                String name = "";
                books[i].setCheckedOutTo(name);
                System.out.println(books[i].displayBookInformation());
            }
        }
    }

    public static void checkBookOut(Book[] books){//allows user to check out book
        int userBook = userInputInt();
        for (int i = 0; i < books.length; i++){
            if(books[i].getId() == userBook){
                books[i].setCheckedOut(true); //sets isCheckedOut to true

                System.out.println("Enter in your name: ");
                String name = userInputString();
                books[i].setCheckedOutTo(name); //sets borrower name to user's inputted name
                System.out.println(books[i].displayBookInformation());
            }
        }
    }

    public static void showCheckedOutBooks(Book arrayOfBooks[]){//shows checked out books
        for (int i = 0; i < arrayOfBooks.length; i++){
            if (arrayOfBooks[i].isCheckedOut()){ //checks if the book at the current index is checked out or not
                System.out.println("------------------\nBook Id: " + arrayOfBooks[i].getId() + "\n" + "Book title: " + arrayOfBooks[i].getTitle() + "\nDate checked out on: " +
                        arrayOfBooks[i].getDateBookWasCheckedOut() + "\nDate book is due: " + arrayOfBooks[i].getDateBookIsDue() + "\n------------------");
            }
        }
    }

    public static void goodbyeMessage(){
        System.out.println("Thank you for supporting your community library. \nHave a good day!");
    }

    public static String userInputString(){//takes in user input for string values
        Scanner read = new Scanner(System.in);
        return read.nextLine();
    }

    public static int userInputInt(){ //takes in user input for int values
        Scanner read = new Scanner(System.in);
        return read.nextInt();
    }
}
