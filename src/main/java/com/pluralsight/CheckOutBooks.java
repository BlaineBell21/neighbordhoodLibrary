package com.pluralsight;

import java.time.LocalDate;
import static com.pluralsight.InputScanner.inputUserName;
import static com.pluralsight.InputScanner.userInputString;
import static com.pluralsight.Main.*;


public class CheckOutBooks {
    public static void chooseBookToCheckOut(Book[] books){//allows user to check out book
        boolean isCheckingBookOut = true;
        while(isCheckingBookOut) {
            System.out.println("Enter in the ID number of the book you'd like to check out: ");
            int userBookId = InputScanner.userInputInt();
            Book foundBook = findBook(books, userBookId);
            checkBookOut(foundBook);
            System.out.println("Would you like to check out another book? Enter in yes/no: ");
            String userInput = userInputString();

            if (userInput.equals("yes")) {
                showAvailableBooks(books);
            } else if (userInput.equals("no")) {
                isCheckingBookOut = false;
            } else {
                System.out.println("Inputted incorrect option.");
            }
        }
    }
    public static void checkBookOut(Book book){
        LocalDate checkOutTime = LocalDate.now();
        LocalDate dateBookIsDue = checkOutTime.plusDays(30);
        String borrowerName = inputUserName();

        book.setCheckedOutTo(borrowerName);
        book.setCheckedOut(true);
        book.setDateBookWasCheckedOut(checkOutTime);
        book.setDateBookIsDue(dateBookIsDue);
        System.out.println(book.displayBookInformation());
    }
    public static void showCheckedOutBooks(Book[] books){
        for (int i = 0; i < books.length; i++){
            if (books[i].isCheckedOut()){
                System.out.println("------------------\n" +
                        "Book Id: " + books[i].getId() + "\n" +
                        "Book title: " + books[i].getTitle() +
                        "\nChecked Out by: " + books[i].getCheckedOutTo() +
                        "\nDate checked out on: " + books[i].getDateBookWasCheckedOut() +
                        "\nDate book is due: " + books[i].getDateBookIsDue() +
                        "\n------------------");
            }
        }
    }
}
