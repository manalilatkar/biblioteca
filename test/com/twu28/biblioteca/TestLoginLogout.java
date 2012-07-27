package com.twu28.biblioteca;


import org.junit.Assert;
import org.junit.Test;


public class TestLoginLogout {
 @Test
    public void testsLoginAndLogoutOption(){
        Driver.isUserLoggedIn=false;
        Driver.userLoggedIn=null;
        Driver driver=new Driver();
        ConsoleStub consoleStub=new ConsoleStub();
        MovieRack movieRack=new MovieRack();
        BookRepo bookRepo=new BookRepo();
        Login login=new Login();
        consoleStub.giveStringToConsole("111-1112");
        consoleStub.giveStringToConsole("pwd2");
        login.execute(bookRepo, consoleStub, movieRack);
        Assert.assertEquals("111-1112", Driver.userLoggedIn);
        login.execute(bookRepo, consoleStub, movieRack);
        Assert.assertFalse(Driver.isUserLoggedIn);

    }

    @Test
    public void testsIncorrectUsernameLogin(){
        Driver.isUserLoggedIn=false;
        Driver.userLoggedIn=null;
        Driver driver=new Driver();
        ConsoleStub consoleStub=new ConsoleStub();
        MovieRack movieRack=new MovieRack();
        BookRepo bookRepo=new BookRepo();
        Login login=new Login();
        consoleStub.giveStringToConsole("111-112");
        consoleStub.giveStringToConsole("pwd");
        login.execute(bookRepo, consoleStub, movieRack);
        Assert.assertEquals("Incorrect username/password",consoleStub.getLine(5));

    }
    @Test
    public void testsLibraryNumberAfterLoggingIn(){
        Driver.isUserLoggedIn=false;
        Driver.userLoggedIn=null;
        Driver driver=new Driver();
        ConsoleStub consoleStub=new ConsoleStub();
        CheckLibraryNumber checkLibraryNumber=new CheckLibraryNumber();
        MovieRack movieRack=new MovieRack();
        BookRepo bookRepo=new BookRepo();
        Login login=new Login();
        consoleStub.giveStringToConsole("111-1112");
        consoleStub.giveStringToConsole("pwd2");
        login.execute(bookRepo, consoleStub, movieRack);
        Assert.assertEquals("111-1112", Driver.userLoggedIn);
        checkLibraryNumber.execute(bookRepo, consoleStub, movieRack);
        Assert.assertEquals("Your library number is 111-1112",consoleStub.getLine(6));

    }
}
