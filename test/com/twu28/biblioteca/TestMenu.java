package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class TestMenu {
    @Test
      public void testsMenuDisplayFalse(){
        Menu menu=new Menu(false);
        ConsoleStub console= new ConsoleStub();
        menu.printTo(console);
        Assert.assertTrue((console.getLine(2)).equals("1. View list of books"));
        Assert.assertTrue((console.getLine(3)).equals("2. Reserve a book"));
        Assert.assertTrue((console.getLine(4)).equals("3. Check your library number"));
        Assert.assertTrue((console.getLine(5)).equals("4. View movie name, director and rating"));
        Assert.assertTrue((console.getLine(6)).equals("5. Login"));
        Assert.assertTrue((console.getLine(7)).equals("6. Exit"));


    }
    @Test
    public void testsMenuDisplayTrue(){
        Menu menu=new Menu(true);
        ConsoleStub console= new ConsoleStub();
        menu.printTo(console);
        Assert.assertTrue((console.getLine(2)).equals("1. View list of books"));
        Assert.assertTrue((console.getLine(3)).equals("2. Reserve a book"));
        Assert.assertTrue((console.getLine(4)).equals("3. Check your library number"));
        Assert.assertTrue((console.getLine(5)).equals("4. View movie name, director and rating"));
        Assert.assertTrue((console.getLine(6)).equals("5. Logout"));
        Assert.assertTrue((console.getLine(7)).equals("6. Exit"));


    }
}
