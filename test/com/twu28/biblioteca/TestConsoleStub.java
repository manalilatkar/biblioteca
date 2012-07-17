package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/13/12
 * Time: 12:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestConsoleStub {

    @Test
    public void testsIfIntIsPassedProperly(){
      ConsoleStub dummyConsole=new ConsoleStub();
      dummyConsole.giveNoToConsole(3);
      Assert.assertEquals(3,dummyConsole.getNumberFromConsole());
    }
    
    @Test            
    public void testsIfStringIsPassedProperly(){
        ConsoleStub dummyConsole=new ConsoleStub();
        dummyConsole.giveStringToConsole("Harry Potter");
        Assert.assertEquals("Harry Potter",dummyConsole.getLine(1));
    }
}
