import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/12/12
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestMenu {
    @Test
    public void testsMenuDisplay(){
        Menu menu=new Menu();
        ConsoleStub console= new ConsoleStub();
        menu.printTo(console);
        Assert.assertTrue((console.getLine(1)).equals("1.View list of books"));
        Assert.assertTrue((console.getLine(2)).equals("2.Reserve a book"));
        Assert.assertTrue((console.getLine(3)).equals("3.Check your library number"));
        Assert.assertTrue((console.getLine(4)).equals("4.Exit"));


    }
    @Test
    public void testsSelectOptionOne(){

    }
}
 /* FooBar foobar = new FooBar(1, 100);
        ConsoleStub console = new ConsoleStub();

        foobar.printTo(console);

        assertThat(console.getLine(3)).isEqualTo("Foo");*/