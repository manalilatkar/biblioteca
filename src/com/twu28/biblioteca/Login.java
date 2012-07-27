package com.twu28.biblioteca;






public class Login implements Command {
    public void execute(BookRepo bookRepo,Console console,MovieRack movieRack){
        if(!Driver.isUserLoggedIn){
            Driver.userLoggedIn=new Register().login(console);
            Driver.isUserLoggedIn =true;
            if(Driver.userLoggedIn.equals("Incorrect username/password")) {
               console.println("Incorrect username/password");
                Driver.isUserLoggedIn =false;}
           return;
        }

      Driver.isUserLoggedIn =false;
      Driver.userLoggedIn=null;
      console.println("You have successfully logged out");
    }
}
