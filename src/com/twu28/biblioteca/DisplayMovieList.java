package com.twu28.biblioteca;


public class DisplayMovieList implements Command{
    public void execute(BookRepo bookRepo,Console console,MovieRack movieRack){
        movieRack.displayList(console);
    }
}
