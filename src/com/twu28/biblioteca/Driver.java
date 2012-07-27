package com.twu28.biblioteca;

import java.util.ArrayList;

public class Driver {
    public ArrayList<Command> choices = new ArrayList<Command>();
    public static String userLoggedIn;
    public static Boolean isUserLoggedIn = false;

    public void start(Console console) {

        BookRepo bookRepo = new BookRepo();
        MovieRack movieRack = new MovieRack();
        int option = 0;
        this.addChoicesFromMenu();
        console.println("Welcome to the Bangalore Public library");
        while (option != 6) {

            new Menu(isUserLoggedIn).printTo(console);
            option = console.getNumberFromConsole(1);
            if (option < 0 || option > 6)
                console.println("Select a valid option!!");
            if (option > 0 && option < 6)
                choices.get(option-1).execute(bookRepo, console, movieRack);

        }
    }

    public void addChoicesFromMenu() {

        choices.add(new DisplayBookList());
        choices.add(new BookReserve());
        choices.add(new CheckLibraryNumber());
        choices.add(new DisplayMovieList());
        choices.add(new Login());
    }
}
