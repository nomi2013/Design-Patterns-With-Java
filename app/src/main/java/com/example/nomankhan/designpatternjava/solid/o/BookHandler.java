package com.example.nomankhan.designpatternjava.solid.o;

/**
 * Created by Noman Khan on 08/06/17.
 */

public class BookHandler {
    //Composition
    BookPrinting bookPrinting;

    public BookHandler(BookPrinting bookPrinting) {
        this.bookPrinting = bookPrinting;
    }

    public void printBook() {
        bookPrinting.bookPrinting();
    }
}
