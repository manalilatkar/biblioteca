package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;


public class TestRegister {
    @Test
    public void testsLogIn(){
        Register register=new Register();
        ConsoleStub consoleStub=new ConsoleStub();
        consoleStub.giveStringToConsole("111-1111");
        consoleStub.giveStringToConsole("pwd1");
        register.login(consoleStub);
        Assert.assertTrue(register.IsLoggedIn("111-1111"));
    }

     @Test  (expected = RuntimeException.class)
     public void testsIsLoggedInWithIncorrectUserName(){
         Register register=new Register();
         ConsoleStub consoleStub=new ConsoleStub();
         consoleStub.giveStringToConsole("111-1111");
         consoleStub.giveStringToConsole("pwd1");
         register.login(consoleStub);
         Assert.assertTrue(register.IsLoggedIn("111-111"));
     }
         @Test
     public void testsLogInWithIncorrectUserName(){
             Register register=new Register();
             ConsoleStub consoleStub=new ConsoleStub();
             consoleStub.giveStringToConsole("111-111");
             consoleStub.giveStringToConsole("pwd1");
             String libraryNo=register.login(consoleStub);
             Assert.assertEquals(libraryNo,"Incorrect username/password");

}
    @Test
        public void testsLogInWhenNotLoggedInWithIncorrectPassword(){
        Register register=new Register();
        ConsoleStub consoleStub=new ConsoleStub();
        consoleStub.giveStringToConsole("111-1112");
        consoleStub.giveStringToConsole("pwd1");
        String libraryNo=register.login(consoleStub);
        Assert.assertEquals(libraryNo,"Incorrect username/password");
    }
    @Test
    public void testsLogInLibrarian(){
        Register register=new Register();
        ConsoleStub consoleStub=new ConsoleStub();
        consoleStub.giveStringToConsole("111-1111");
        consoleStub.giveStringToConsole("pwd1");
        register.login(consoleStub);
        Assert.assertTrue(register.IsLoggedIn("111-1111"));
        Assert.assertEquals("You have logged in successfully !",consoleStub.getLine(5));
        Assert.assertEquals("Welcome Librarian alias Aman ",consoleStub.getLine(6));
    }

    @Test
    public void testsLogInArbitraryUser(){
        Register register=new Register();
        ConsoleStub consoleStub=new ConsoleStub();
        consoleStub.giveStringToConsole("111-1112");
        consoleStub.giveStringToConsole("pwd2");
        register.login(consoleStub);
        Assert.assertTrue(register.IsLoggedIn("111-1112"));
        Assert.assertEquals("You have logged in successfully !",consoleStub.getLine(5));

    }
}