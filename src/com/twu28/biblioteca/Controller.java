package com.twu28.biblioteca;


public class Controller {
    private int choice;
    Controller(int choice){
        this.choice=choice;
    }

    public BookRepo actionBasedOnOption(BookRepo bookRepo,Console console){

        MovieRack movieRack=new MovieRack();
        switch (choice)
        {   case 1: bookRepo.displayList(console);
            break;
            case 2: bookRepo.reserveBook(console);
                break;
            case 3: bookRepo.checkLibraryNumber(console);
                break;
            case 4: movieRack.displayList(console);



        }
        return bookRepo;

    }
}