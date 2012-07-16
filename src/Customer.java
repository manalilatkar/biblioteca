/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/12/12
 * Time: 11:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    private int customerID;
    private String name;
    private int noOfBooksIssued;
    private int bookCollection[]= new int[3];
    


    Customer(int customerID,String name,int noOfBooksIssued,int bookCollection[]){
        this.customerID=customerID;
        this.name=name;
        this.noOfBooksIssued=noOfBooksIssued;
        this.bookCollection=bookCollection;

    }
    @Override
    public boolean equals(Object obj){
        if (obj==null) return false;
        if (!(obj instanceof Customer) ) return false;
        return(customerID==((Customer)obj).customerID);

    }

    public String displayDetails() {
        String details=customerID+"."+name+"  "+noOfBooksIssued+" books reserved";
        return details;
    }

    public boolean sameName(String otherName) {
        if (name.equals(otherName))
            return true;
        return false;
    }
    public void addBook(int bookID){
        this.bookCollection[noOfBooksIssued]=bookID;
        this.noOfBooksIssued++;

    }
}





//AddToCollection