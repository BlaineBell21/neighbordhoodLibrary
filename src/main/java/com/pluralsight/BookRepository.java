package com.pluralsight;

import java.time.LocalDate;

//repository for all available books

public class BookRepository {
    public static Book[] allLibraryBooks(){
        Book book1 = new Book(1, "9780743273565","The Great Gatsby", "F. Scott Fitzgerald","Classic / Fiction",1925,false, "", null,null);
        Book book2 = new Book(2, "9780061120084","To Kill a Mockingbird", "Harper Lee","Classic / Fiction",1960,true, "Emily Carter", LocalDate.of(2026, 3, 25),LocalDate.of(2026, 4, 25));
        Book book3 = new Book(3, "9780451524935","1984", "George Orwell","Dystopian / Science Fiction",1949,false, "", null,null);
        Book book4 = new Book(4, "9780141439518","Pride and Prejudice", "Jane Austen","Romance / Classic",1813,true, "Daniel Kim", LocalDate.of(2026, 3, 20),LocalDate.of(2026, 4, 20));
        Book book5 = new Book(5, "9780307277671","The Road", "Cormac McCarthy","Post-Apocalyptic / Fiction",2006,false, "", null,null);
        Book book6 = new Book(6, "9780316769488","The Catcher in the Rye", "J.D. Salinger","Coming-of-Age / Fiction",1951,true, "Sarah Lopez", LocalDate.of(2026, 3, 22), LocalDate.of(2026, 4, 22));
        Book book7 = new Book(7, "9780618640157","The Hobbit", "J.R.R. Tolkien","Fantasy",1937,false, "", null, null);
        Book book8 = new Book(8, "9780544003415","The Lord of the Rings", "J.R.R. Tolkien","Fantasy",1954,true, "Michael Nguyen", LocalDate.of(2026, 4, 1), LocalDate.of(2026, 5, 1));
        Book book9 = new Book(9, "9780553386790","A Game of Thrones", "George R.R. Martin","Fantasy",1996,false, "", null, null);
        Book book10 = new Book(10, "9780060850524","Brave New World", "Aldous Huxley","Dystopian / Science Fiction",1932,true, "Olivia Brown", LocalDate.of(2026, 3, 28), LocalDate.of(2026, 4, 28));
        Book book11 = new Book(11, "9780307474278","he Girl with the Dragon Tattoo", "Stieg Larsson","Mystery / Thriller",2005,false, "", null, null);
        Book book12 = new Book(12, "9780385490818","The Alchemist", "Paulo Coelho","Adventure / Fiction",1988,true, "Ethan Wilson", LocalDate.of(2026, 3, 23), LocalDate.of(2026, 4, 23));
        Book book13 = new Book(13, "9781451673319","Fahrenheit 451", "Ray Bradbury","Dystopian / Science Fiction",1953,false, "", null, null);
        Book book14 = new Book(14, "9780062316097","The Handmaid's Tale", "Margaret Atwood","Dystopian / Fiction",1985,true, "Ava Patel", LocalDate.of(2026, 3, 20), LocalDate.of(2026, 4, 20));
        Book book15 = new Book(15, "9780140449136","The Odyssey", "Homer","Epic / Classic",800,false, "", null, null);
        Book book16 = new Book(16, "9780141182803","Animal Farm", "George Orwell","Political Satire / Fiction",1945,true, "Lucas Martinez", LocalDate.of(2026, 3, 21), LocalDate.of(2026, 4, 21));
        Book book17 = new Book(17, "9781594634024","The Kite Runner", "Khaled Hosseini","Historical Fiction",2003,false, "none", null, null);
        Book book18 = new Book(18, "9780307387899","The Book Thief", "Markus Zusak","Historical Fiction",2005,true, "Mia Johnson", LocalDate.of(2026, 3, 27), LocalDate.of(2026, 4, 27));
        Book book19 = new Book(19, "9780812981605","Gone Girl", "Gillian Flynn","Thriller / Mystery",2012,false, "", null, null);
        Book book20 = new Book(20, "9780936369471","Dog Jack Revised Edition", "Florence W. Biros","Historical Fiction / Civil War",1999,false, "none", null, null);
        Book book21 = new Book(21, "9780758260826","Such a Pretty Face", "Cathy Lamb","Fiction",2010,false, "", null, null);
        Book book22 = new Book(22, "9780143127741","The Martian", "Andy Weir","Science Fiction",2011,true, "Noah Davis", LocalDate.of(2026, 4, 15), LocalDate.of(2026, 5, 15));

        Book arrayOfBooks[] = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11,
                book12, book13, book14, book15, book16, book17, book18,book19, book20, book21, book22};
        return arrayOfBooks;

    }
}
