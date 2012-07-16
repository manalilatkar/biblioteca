import junit.framework.Assert;
import org.junit.Test;

public class TestLibrary {
    Library library=new Library();

    @Test
    public void testsSearchIDByNAme(){
     ConsoleStub consoleStub=new ConsoleStub();
     consoleStub.giveStringToConsole("Riya Khanna");
     Assert.assertEquals(2,library.searchIDByName(consoleStub.getLine(1)));


    }



}
