package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;


public class TestMovie {
    @Test
    public void testDisplay(){
        Movie movie=new Movie("Sholay","Ramesh Sippy",10);
        ConsoleStub console=new ConsoleStub();
        Assert.assertEquals(movie.display(), "Sholay  Ramesh Sippy  10");

    }

    @Test
    public  void testDisplayNewMovie(){
        Movie movie=new Movie("Sholay","Ramesh Sippy",-1);
        ConsoleStub console=new ConsoleStub();
        Assert.assertEquals(movie.display(), "Sholay  Ramesh Sippy  N/A");
    }
}
