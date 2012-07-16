import junit.framework.Assert;
import junit.framework.Assert.*;
import org.junit.Test;


/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/14/12
 * Time: 1:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestDriver {
    ConsoleStub console=new ConsoleStub();
    Driver driver=new Driver();
    @Test
    public void testsWelcomeMessage(){
        
        driver.start(console);
        Assert.assertTrue((console.getLine(1)).equals("Welcome to the Bangalore Public library"));

    }
    
    @Test
    public void testsMenuDisplay(){
      driver.start(console);
        Assert.assertTrue(console.getLine(2).equals("Enter a number based on your choice of operation"));
        Assert.assertTrue(console.getLine(3).equals("1.View list of books"));
        Assert.assertTrue(console.getLine(4).equals("2.Reserve a book"));
        Assert.assertTrue(console.getLine(5).equals("3.Check your library number"));
        Assert.assertTrue(console.getLine(6).equals("4.Exit"));
    }
    @Test
    public void testsGetInput(){
        driver.start(console);
        console.giveNoToConsole(3);
        Assert.assertEquals(3,console.getNumberFromConsole());

    }
    @Test
    public void testsValidityOfChoice(){
        console.giveNoToConsole(3);
        driver.start(console);


    }


}