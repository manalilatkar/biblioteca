import org.junit.*;/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/12/12
 * Time: 12:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    private String Name;
    private int bookID;
    private String author;

    Book(String name,int bookID,String Author){
        this.Name=name;
        this.bookID=bookID;
        this.author=Author;


    }

   @Override
    public boolean equals(Object obj){
       if (obj==null) return false;
       if (!(obj instanceof Book) ) return false;
       return(bookID==((Book)obj).bookID);
   }


    public String displayBook() {
        return (bookID+" . "+Name+"   "+author);
    }
}
