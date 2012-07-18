package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;


import javax.sound.midi.ControllerEventListener;

/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/14/12
 * Time: 4:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestController {
    
    @Test
    public void testsFirstOptionOfController(){
        Controller controller=new Controller(1);
        ConsoleStub consoleStub=new ConsoleStub();
        BookRepo bookRepo=new BookRepo();
        controller.actionBasedOnOption(bookRepo,consoleStub);
        Assert.assertEquals(consoleStub.getLine(1),"The library has following books :");

    }

    @Test
    public void testsSecondOptionOfController(){
        Controller controller=new Controller(2);
        ConsoleStub consoleStub=new ConsoleStub();
        BookRepo bookRepo=new BookRepo();
        consoleStub.giveNoToConsole(2);
        controller.actionBasedOnOption(bookRepo,consoleStub);
        Assert.assertEquals("Thank You. Enjoy the book", consoleStub.getLine(2));
        consoleStub.giveNoToConsole(2);
        controller.actionBasedOnOption(bookRepo,consoleStub);
        Assert.assertEquals("Sorry we don't have that book yet.", consoleStub.getLine(4));

    }

    @Test
    public void testsThirdOptionofController(){
        Controller controller=new Controller(3);
        ConsoleStub consoleStub=new ConsoleStub();
        MovieRack movieRack=new MovieRack();
        BookRepo bookRepo=new BookRepo();
        controller.actionBasedOnOption(bookRepo,consoleStub);
        Assert.assertEquals("Please talk to Librarian. Thank you.",consoleStub.getLine(1));


    }

    @Test
    public void testsFourthOptionOfController(){
        Controller controller=new Controller(4);
        ConsoleStub consoleStub=new ConsoleStub();
        BookRepo bookRepo=new BookRepo();
        controller.actionBasedOnOption(bookRepo,consoleStub);
        Assert.assertEquals("Movie name Director Rating",consoleStub.getLine(1));

    }


}

