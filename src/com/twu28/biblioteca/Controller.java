package com.twu28.biblioteca;


import static com.twu28.biblioteca.Driver.isUserLoggedIn;

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
            case 3: if(Driver.isUserLoggedIn){
                    console.println("Your library number is "+Driver.userLoggedIn);
                    return bookRepo;}
                     bookRepo.checkLibraryNumber(console);
                    break;
            case 4: movieRack.displayList(console);
                    break;
            case 5: if(!isUserLoggedIn){
                    Driver.userLoggedIn=new Register().Login(console);
                    Driver.isUserLoggedIn =true;
                    if(Driver.userLoggedIn.equals("Incorrect username/password")) {
                        console.println("Incorrect username/password");
                       Driver.isUserLoggedIn =false;}
                    return bookRepo;
                    }

                    Driver.isUserLoggedIn =false;
                    Driver.userLoggedIn=null;
                    console.println("You have successfully logged out");

        }
        return bookRepo;

    }
}