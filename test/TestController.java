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
        controller.actionBasedOnOption( bookRepo,consoleStub);
        Assert.assertEquals(consoleStub.getLine(1),"The library has following books :");

    }

    @Test
    public void testsSecondOptionOfController(){
        Controller controller=new Controller(2);
        ConsoleStub consoleStub=new ConsoleStub();
        BookRepo bookRepo=new BookRepo();
        controller.actionBasedOnOption(bookRepo,consoleStub);

    }

    @Test
    public void testsThirdOptionofController(){
        Controller controller=new Controller(3);
        ConsoleStub consoleStub=new ConsoleStub();
        BookRepo bookRepo=new BookRepo();
        controller.actionBasedOnOption(bookRepo,consoleStub);


    }


}

