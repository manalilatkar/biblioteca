package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;


public class TestDriver {
    ConsoleStub console=new ConsoleStub();
    Driver driver=new Driver();
    @Test
    public void testsWelcomeMessage(){
        console.giveNoToConsole(6);
        driver.start(console);
        Assert.assertTrue((console.getLine(2)).equals("Welcome to the Bangalore Public library"));

    }
    
    @Test
    public void testsMenuDisplay(){
        console.giveNoToConsole(6);
        driver.start(console);
        Assert.assertTrue(console.getLine(3).equals("\nEnter a number based on your choice of operation"));
        Assert.assertTrue(console.getLine(4).equals("1. View list of books"));
        Assert.assertTrue(console.getLine(5).equals("2. Reserve a book"));
        Assert.assertTrue(console.getLine(6).equals("3. Check your library number"));
        Assert.assertTrue(console.getLine(7).equals("4. View movie name, director and rating"));
        if(Driver.isUserLoggedIn)
        Assert.assertTrue(console.getLine(8).equals("5. Logout"));
        else Assert.assertTrue(console.getLine(8).equals("5. Login"));
        Assert.assertTrue(console.getLine(9).equals("6. Exit"));
    }



}