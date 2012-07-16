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
    private int[] booksIssued={1,1,1,1,1};

    BookRepo(){

       originalBookList.add(new Book("The Da Vinci Code",1,"Dan Brown"));
       originalBookList.add(new Book("The Digital Fortress",2,"Dan Brown")); 
       originalBookList.add(new Book("The Immortals of Meluha",3,"Aamish Tripathi"));
       originalBookList.add(new Book("Harry Potter and the Sorcerer's Stone",4,"J.K. Rowling"));
       originalBookList.add(new Book("The Complete Reference JAVA2",5,"Herbert Schildt"));

        

    }
    public void displayList(Console console) {
        console.println("The library has following books :");
        console.println("S.no        Book      Author");
        for(int i=0;i<originalBookList.size();i++){
           Book book= originalBookList.get(i);
            String string=book.displayBook();
            console.println(string);
        }


        
        
    }
    //add method searchForBookByIDNo.
    //add method decrease noOfCopiesAfterReservation

    public boolean BookIssued(int i) {

        if(originalBookList.size()<i)return false;
        if (booksIssued[i]==0)
            return  true;
        return false;
    }

    public void issueBook(int bookID){
        booksIssued[bookID]=0;

    }
}
