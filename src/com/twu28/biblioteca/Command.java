package com.twu28.biblioteca;

public interface Command {
    public void execute(BookRepo bookRepo, Console console, MovieRack movieRack);
}
