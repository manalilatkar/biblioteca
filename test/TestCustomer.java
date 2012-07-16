import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/12/12
 * Time: 10:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestCustomer {

    @Test
    public void checkCustomerEqual(){
        Customer customer1=new Customer(1,"Manali",0,null);
        Customer customer2=new Customer(1,"Manali",0,null);
        Assert.assertTrue(customer1.equals(customer2));

    }

    @Test
    public void testsDisplayCustomerDetails(){
        int booksIssued[]={1,2,0};
        Customer customer1=new Customer(1,"Manali",2,booksIssued);
        String output="1.Manali  2 books reserved";
        Assert.assertEquals(output,customer1.displayDetails());


    }

    @Test
    public  void testsSameName(){
        int booksIssued[]={1,2,0};
        Customer customer1=new Customer(1,"Manali",2,booksIssued);
        Assert.assertTrue(customer1.sameName("Manali"));

    }


}
