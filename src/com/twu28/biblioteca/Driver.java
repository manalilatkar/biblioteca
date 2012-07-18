package com.twu28.biblioteca;

public class Driver {


    public void start(Console console) {

        Menu menu=new Menu();
        BookRepo bookRepo=new BookRepo();
        int choice=0;
        console.println("Welcome to the Bangalore Public library");
        while(choice!=5){

            menu.printTo(console);
            choice=console.getNumberFromConsole(1);
            if(choice<0||choice>6)
                console.println("Please enter a valid menu option");
            Controller controller=new Controller(choice);
            bookRepo=controller.actionBasedOnOption(bookRepo,console);




        }
    }
}
