import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/13/12
 * Time: 1:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookRepo {
    private ArrayList<Book> originalBookList=new ArrayList<Book>();
    private int[] noOfCopies=new int[100];
    private int[] noOfCopiesIssued=new int[100];

    BookRepo(){

       originalBookList.add(new Book("The Da Vinci Code",1,"Dan Brown"));
       originalBookList.add(new Book("The Digital Fortress",2,"Dan Brown")); 
       originalBookList.add(new Book("The Immortals of Meluha",3,"Amish Tripathi"));
       originalBookList.add(new Book("Harry Potter and the Sorcerer's Stone",4,"J.K.Rowling"));
       originalBookList.add(new Book("The Complete Reference JAVA2",5,"Herbert Schildt"));
       noOfCopies={5,5,5,5,5,5};
        

    }
    public void displayList() {
        
        
    }
    //add method searchForBookByIDNo.
    //add method decrease noOfCopiesAfterReservation
}
