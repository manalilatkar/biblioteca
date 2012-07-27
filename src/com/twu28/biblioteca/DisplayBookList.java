package com.twu28.biblioteca;

public class DisplayBookList implements Command{
    public void execute(BookRepo bookRepo, Console console, MovieRack movieRack){
        bookRepo.displayList(console);
    }
}
