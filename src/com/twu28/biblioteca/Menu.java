package com.twu28.biblioteca;

import java.util.*;
import java.util.ArrayList;
import java.lang.String.*;

public class Menu {
    ArrayList<String> menu=new ArrayList<String>();
    Menu(boolean loggedIn){
        if(loggedIn==false){
        menu.add("Enter a number based on your choice of operation");
        menu.add("1.View list of books");
        menu.add("2.Reserve a book");
        menu.add("3.Check your library number");
        menu.add("4.View movie name, director, rating");
        menu.add("5.Log In");
        menu.add("6.Exit");
        }
        else{
        menu.add("Enter a number based on your choice of operation");
        menu.add("1.View list of books");
        menu.add("2.Reserve a book");
        menu.add("3.Check your library number");
        menu.add("4.View movie name, director, rating");
        menu.add("5.Log Out");
        menu.add("6.Exit");
        }
    }

    public void printTo(Console console) {
        console.println(menu.get(0));
        console.println(menu.get(1));
        console.println(menu.get(2));
        console.println(menu.get(3));
        console.println(menu.get(4));
        console.println(menu.get(5));
        console.println(menu.get(6));

    }
}
