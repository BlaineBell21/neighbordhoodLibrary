package com.pluralsight;

import static com.pluralsight.InputScanner.userInputInt;
import static com.pluralsight.InputScanner.userInputString;


public class Main {
    public static void main(String[] args){
        Book[] books = BookRepository.allLibraryBooks();

        MainMenuOptions.libraryMenuOptions(books);

    }


    public static void showAvailableBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (!books[i].isCheckedOut()) { //checks if the book at the current index is checked out or not
                System.out.println(books[i].displayBookInformation()); //if book at current index isn't checked out, prints book information
            }
        }
    }

    public static Book findBook(Book[] books, int userBookId){
        for(Book book : books){
            if (book.getId() == userBookId){
                return book;
            }
        }
        return null;
    }

    public static void goodbyeMessage(){
        System.out.println("Thank you for supporting your community library. \nHave a good day!");
    }
}
