package com.twu28.biblioteca;


public class BookReserve implements Command{
    public void execute(BookRepo bookRepo, Console console, MovieRack movieRack){
        bookRepo.reserveBook(console);
    }
}
