package com.twu28.biblioteca;

public class Driver {

    public static String userLoggedIn;
    public static Boolean isUserLoggedIn =false;
    public void start(Console console) {

        BookRepo bookRepo=new BookRepo();
        int choice=0;
        console.println("Welcome to the Bangalore Public library");
        while(choice!=6){

            new Menu(isUserLoggedIn).printTo(console);
            choice=console.getNumberFromConsole(1);
            if(choice<0||choice>7)
                console.println("Please enter a valid menu option");
            Controller controller=new Controller(choice);
            bookRepo=controller.actionBasedOnOption(bookRepo,console);
        }
    }
}
