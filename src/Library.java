import java.util.ArrayList;                         

public class Library {
    private ArrayList<Customer> customerList=new ArrayList<Customer>();
    Library(){
        int zeroBooks[]=new int[3];
        customerList.add(new Customer(1,"Sheena Raj",0,zeroBooks));
        customerList.add(new Customer(2,"Riya Khanna",0,zeroBooks));
        customerList.add(new Customer(3,"Asif Khan",0,zeroBooks));
        customerList.add(new Customer(4,"Rahul Roy",0,zeroBooks));


    }

    public int searchIDByName(String name) {

        Library library=new Library();
        for(int i=0;i<customerList.size();i++){
            System.out.println(i);
            if((customerList.get(i)).sameName(name))
                return i+1;


        }
        return 0;
    }

    public void checkLibraryNumber(Console console) {
        console.println("Enter your name");

        //Library library=new Library();
        int IDNumber;
        String name=console.getLine(2);
        IDNumber=this.searchIDByName(name);
        System.out.println(name+"  "+IDNumber);
        if(IDNumber==0)
        console.println("Sorry,You are not registered with our library.Please talk to the Librarian.ThankYou");
        if(!(IDNumber==0))
         console.println("Your library number is "+IDNumber+" Please talk to the Librarian.ThankYou");
    }

    public BookRepo reserveBook(BookRepo bookRepo,Console console) {
        console.println("Enter the book ID no.");
        int bookID=console.getNumberFromConsole();
        console.println("Enter your Library  no.");
        int libraryNo=console.getNumberFromConsole();
        if(!(bookRepo.BookIssued(bookID))) {
        (customerList.get(libraryNo-1)).addBook( bookID);
         bookRepo.issueBook(bookID);
        console.println("Thank You. Enjoy the book");}
        else console.println("Sorry we don't have that book yet.");
         return bookRepo;


    }
}

