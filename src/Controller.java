/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/14/12
 * Time: 4:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class Controller {
    private int choice;
    Controller(int choice){
    this.choice=choice;
    }

    public BookRepo actionBasedOnOption(BookRepo bookRepo,Console console){

        Library library=new Library();
        switch (choice)
        {   case 1: bookRepo.displayList(console);
                    break;
            case 2: bookRepo=library.reserveBook(bookRepo,console);
                    break;
            case 3:library.checkLibraryNumber(console);
                    break;



        }
        return bookRepo;

    }
}
