package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;


public class TestUser {
    @Test
    public void testsIsLoggedInWhenNotLoggedIn(){
        User librarian=new User("111-1111","pwd1");
        Assert.assertFalse(librarian.isLoggedIn());
    }

    @Test
    public void testsLogIn(){
        User librarian=new User("111-1111","pwd1");
        librarian.logIn();
        Assert.assertTrue(librarian.isLoggedIn());
    }
    
    @Test
    public void testsEqual(){
        User user1=new User("111-1111","pwd1");
        User sameAsUser1=new User("111-1111","pwd1");
        Assert.assertTrue(user1.equalForLogin(sameAsUser1));

    }
    @Test
    public void equalByLibraryNo(){
        User user1=new User("111-1111","pwd1");
        Assert.assertTrue(user1.equalByLibraryNo("111-1111"));
    }
    @Test
    public void checkUnequalLibraryNo(){
        User user1=new User("111-1111","pwd1");
        Assert.assertFalse(user1.equalByLibraryNo("111-1112"));
    }
}
