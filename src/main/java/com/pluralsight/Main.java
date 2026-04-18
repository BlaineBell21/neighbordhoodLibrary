package com.pluralsight;
import java.time.LocalDate;
import java.util.Scanner;
import static com.pluralsight.BookRepository.allLibraryBooks;

import static com.pluralsight.MainMenuOptions.libraryMenuOptions; //imports options for main menu

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
        libraryMenuOptions();
    }

    public static void showAvailableBooks(Book[] arrayOfBooks) {
        for (int i = 0; i < arrayOfBooks.length; i++) {
            if (!arrayOfBooks[i].isCheckedOut()) { //checks if the book at the current index is checked out or not
                System.out.println(arrayOfBooks[i].displayBookInformation()); //if book at current index isn't checked out, prints book information
            }
        }
    }

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

    public static int findBookId(Book[] books){
        int userBook = userInputInt();
        for (Book book : books) {
            if (book.getId() == userBook) {

            }
        }
    }

    public static void checkBookOut(Book[] books){//allows user to check out book


        boolean isCheckingBookOut = true;

        while(isCheckingBookOut) {
            LocalDate checkOutTime = LocalDate.now();
            LocalDate dateBookIsDue = checkOutTime.plusDays(30);
            System.out.println("Enter in the ID number of the book you'd like to check out: ");
            findBookId(allLibraryBooks());
            inputUserName();
            findBookId(allLibraryBooks()).setCheckedOutTo(name); //sets borrower name to user's inputted name
            book.setDateBookWasCheckedOut(checkOutTime);
            book.setDateBookIsDue(dateBookIsDue);
            System.out.println(book.displayBookInformation());
            book.setCheckedOut(true); //sets isCheckedOut to true

            System.out.println("Would you like to check out another book? Enter in yes/no: ");
            String userInput = userInputString();
            if (userInput.equals("no")){
                isCheckingBookOut = false;

            }
        }
        libraryHomeScreen();
    }
public static String inputUserName(){
    System.out.println("Enter in your name: ");
    String name = userInputString();
    return name;
}
    public static void showCheckedOutBooks(Book arrayOfBooks[]){//shows checked out books
        for (int i = 0; i < arrayOfBooks.length; i++){
            if (arrayOfBooks[i].isCheckedOut()){ //checks if the book at the current index is checked out or not
                System.out.println("------------------\n" +
                        "Book Id: " + arrayOfBooks[i].getId() + "\n" +
                        "Book title: " + arrayOfBooks[i].getTitle() +
                        "\nChecked Out by: " + arrayOfBooks[i].getCheckedOutTo() +
                        "\nDate checked out on: " + arrayOfBooks[i].getDateBookWasCheckedOut() +
                        "\nDate book is due: " + arrayOfBooks[i].getDateBookIsDue() +
                        "\n------------------");
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
