package com.twu28.biblioteca;


import java.util.ArrayList;

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
        for (Book book : originalBookList) {
            String string = book.displayBook();
            console.println(string);
        }

    }


    public boolean bookIssued(int i) {

        return originalBookList.size() >= i && booksIssued[i] == 0;
    }

    public void issueBook(int bookID){
        booksIssued[bookID]=0;

    }

    public void reserveBook(Console console) {
        System.out.println("Enter the serial no. of book :");
        int bookID=console.getNumberFromConsole();
        if((!(bookIssued(bookID)))&&bookID<originalBookList.size()&&bookID!=0) {
            issueBook(bookID);
            console.println("Thank You! Enjoy the book");
            return;
        }
        if(bookID!=0)console.println("Sorry we don't have that book yet.");



    }

    public void checkLibraryNumber(Console console) {
        console.println("Please talk to Librarian. Thank you.");
    }
}
