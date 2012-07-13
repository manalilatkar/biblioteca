import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/12/12
 * Time: 12:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest {


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
        Assert.assertEquals(bookInstance1.displayBook(),"1 . The Da Vinci Code   Dan Brown");
    }
}
