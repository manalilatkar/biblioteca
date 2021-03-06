package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class TestBook {


    @Test
    public void testForBook1EqualsBook1(){
        Book bookInstance1=new Book("The Da Vinci Code",1,"Dan Brown");
        Book bookInstance2=new Book("The Da Vinci Code",1,"Dan Brown");
        Assert.assertTrue(bookInstance1.equals(bookInstance2));
        
    }

    @Test
    public void testForBook1DoesNotEqualNull(){
        Book bookInstance1=new Book("The Da Vinci Code",1,"Dan Brown");
        Assert.assertFalse(bookInstance1.equals(null));
    }
    @Test
    public void testForBookDisplayMethod(){
        Book bookInstance1=new Book("The Da Vinci Code",1,"Dan Brown");
        Assert.assertEquals(bookInstance1.displayBook(),"1 .  The Da Vinci Code by Dan Brown");
    }
}
