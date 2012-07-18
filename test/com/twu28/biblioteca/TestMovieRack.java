package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class TestMovieRack {
    @Test
    public void testDisplay(){
        ConsoleStub consoleStub=new ConsoleStub();
        MovieRack movieRack=new MovieRack();
        movieRack.displayList(consoleStub);
        Assert.assertEquals(consoleStub.getLine(1),"Movie name Director Rating");
        Assert.assertEquals(consoleStub.getLine(2),"The Shawshank Redemption  Frank Darabont  9");

    }
}
