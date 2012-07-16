/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/14/12
 * Time: 1:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {


    public void start(Console console) {

        Menu menu=new Menu();
        Library library=new Library();
        BookRepo bookRepo=new BookRepo();
        int choice=0;
        console.println("Welcome to the Bangalore Public library");
        while(choice!=4){

            menu.printTo(console);
            choice=console.getNumberFromConsole();
            if(choice<0||choice>5)
            console.println("Please enter a valid menu option");
            Controller controller=new Controller(choice);
            bookRepo=controller.actionBasedOnOption(bookRepo,console);


        }
    }
}
