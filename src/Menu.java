import java.util.*;
import java.util.ArrayList;
import java.lang.String.*;

/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/12/12
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {
    ArrayList<String> menu=new ArrayList<String>();
    Menu(){
        menu.add("Enter a number based on your choice of operation");
        menu.add("1.View list of books");
        menu.add("2.Reserve a book");
        menu.add("3.Check your library number");
        menu.add("4.Exit");
    }

    public void printTo(Console console) {
        console.println(menu.get(0));
        console.println(menu.get(1));
        console.println(menu.get(2));
        console.println(menu.get(3));
        console.println(menu.get(4));

    }
}
  /*
 import java.util.ArrayList;

public class Menu {
   ArrayList<String> menu=new ArrayList<String>();
   Menu(){
   menu.add("1.View list of books");
   }
}
    */