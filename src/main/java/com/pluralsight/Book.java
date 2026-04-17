package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;


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

    public int getId() {
        return id;
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
            "Borrower: "+ this.checkedOutTo +"\n" +
            "Borrowed Date: " + this.dateBookWasCheckedOut +"\n"+
            "Due Date: " + this.dateBookIsDue +
                "\n------------------";
        return bookDetails;
    }


    public String getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getPublicationYear() {
        return this.publicationYear;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void setDateBookWasCheckedOut(LocalDate dateBookWasCheckedOut) {
        this.dateBookWasCheckedOut = dateBookWasCheckedOut;
    }

    public void setDateBookIsDue(LocalDate dateBookIsDue) {
        this.dateBookIsDue = dateBookIsDue;
    }

  }
