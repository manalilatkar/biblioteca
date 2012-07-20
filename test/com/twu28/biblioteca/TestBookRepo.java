package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;


public class TestBookRepo {
    @Test
    public void testsBookRepoDisplay(){
        BookRepo bookRepo=new BookRepo();
        ConsoleStub console =new ConsoleStub();
        bookRepo.displayList(console);
        Assert.assertEquals(console.getLine(1), "The library has following books :");
        Assert.assertEquals(console.getLine(2), "S.no        Book      Author");
        Assert.assertEquals(console.getLine(3), "1 .  The Da Vinci Code by Dan Brown");
        Assert.assertEquals(console.getLine(4), "2 .  The Digital Fortress by Dan Brown");
        Assert.assertEquals(console.getLine(5), "3 .  The Immortals of Meluha by Aamish Tripathi");
        Assert.assertEquals(console.getLine(6), "4 .  Harry Potter and the Sorcerer's Stone by J.K. Rowling");
        Assert.assertEquals(console.getLine(7), "5 .  The Complete Reference JAVA2 by Herbert Schildt" );
                                        
    }

    @Test
    public void testsBookIssued(){
        BookRepo bookRepo=new BookRepo();
        Assert.assertFalse(bookRepo.bookIssued(2));
    }

    @Test
    public void testsIssueBook(){
        BookRepo bookRepo=new BookRepo();
        bookRepo.issueBook(1);
        Assert.assertTrue(bookRepo.bookIssued(1));
    }

    @Test
    public void testsReserveBook(){
        ConsoleStub console =new ConsoleStub();
        BookRepo bookRepo=new BookRepo();
        console.giveNoToConsole(2);
        bookRepo.reserveBook(console);
        Assert.assertEquals("Thank You. Enjoy the book",console.getLine(2));
        console.giveNoToConsole(2);
        bookRepo.reserveBook(console);
        Assert.assertEquals("Sorry we don't have that book yet.",console.getLine(4));


    }

    @Test
    public void testsCheckLibraryNumber(){
        ConsoleStub console =new ConsoleStub();
        BookRepo bookRepo=new BookRepo();
        bookRepo.checkLibraryNumber(console);
        Assert.assertEquals(console.getLine(1),"Please talk to Librarian. Thank you.");
    }
    }
