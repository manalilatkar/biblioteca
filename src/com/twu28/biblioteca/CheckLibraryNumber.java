package com.twu28.biblioteca;


public class CheckLibraryNumber implements Command{
    public void execute(BookRepo bookRepo, Console console, MovieRack movieRack){
        if(Driver.isUserLoggedIn){
            console.println("Your library number is "+Driver.userLoggedIn);
            return;
        }
        bookRepo.checkLibraryNumber(console);

    }
}
