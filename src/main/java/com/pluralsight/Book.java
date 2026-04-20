package com.pluralsight;

import java.time.LocalDate;


public class Book {
    private int id;
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private int publicationYear;
    private boolean isCheckedOut;
    private String checkedOutTo;
    private LocalDate dateBookWasCheckedOut;
    private LocalDate dateBookIsDue;

    public Book(int id, String isbn, String title, String author, String genre, int publicationYear, boolean isCheckedOut, String checkedOutTo, LocalDate dateBookWasCheckedOut,LocalDate dateBookIsDue) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
        this.dateBookWasCheckedOut = dateBookWasCheckedOut;
        this.dateBookIsDue = dateBookIsDue;
    }

    public String displayBookInformation(){
        String bookDetails;
        bookDetails = "------------------\n" +
            "ID: " + this.id +"\n" +
            "ISBN: "+ this.isbn + "\n" +
            "Title: "+ this.title + "\n" +
            "Author: "+ this.author + "\n" +
            "Genre: "+ this.genre + "\n" +
            "Year: " + this.publicationYear + "\n" +
            "Checked out: "+ this.isCheckedOut + "\n"+
            "Borrower: "+ this.checkedOutTo +"\n" +
            "Borrowed Date: " + this.dateBookWasCheckedOut +"\n"+
            "Due Date: " + this.dateBookIsDue +
                "\n------------------";
        return bookDetails;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isCheckedOut() {
        return this.isCheckedOut;
    }

    public String getCheckedOutTo() {
        return this.checkedOutTo;
    }

    public LocalDate getDateBookWasCheckedOut() {
        return this.dateBookWasCheckedOut;
    }

    public LocalDate getDateBookIsDue() {
        return this.dateBookIsDue;
    }


    public void setCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }

    public String setCheckedOutTo(String checkedOutTo) {
        return this.checkedOutTo = checkedOutTo;
    }

    public void setDateBookWasCheckedOut(LocalDate dateBookWasCheckedOut) {
        this.dateBookWasCheckedOut = dateBookWasCheckedOut;
    }

    public void setDateBookIsDue(LocalDate dateBookIsDue) {
        this.dateBookIsDue = dateBookIsDue;
    }

  }
