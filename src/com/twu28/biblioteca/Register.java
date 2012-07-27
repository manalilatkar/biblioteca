package com.twu28.biblioteca;

import java.util.ArrayList;

public class Register {
    private ArrayList<User> register = new ArrayList<User>();

    Register() {
        register.add(new User("111-1111", "pwd1"));
        register.add(new User("111-1112", "pwd2"));
        register.add(new User("111-1113", "pwd3"));
        register.add(new User("111-1114", "pwd4"));
    }


    public String login(Console console) {
        console.println("Enter your library number");
        String libraryNo = console.getLine(1);
        console.println("Enter your password");
        String password = console.getLine(2);

        for (User user : register) {
            User inputUser = new User(libraryNo, password);
            if (user.equalForLogin(inputUser)) {
                user.logIn();
                console.println("You have logged in successfully !");
                if (libraryNo.equals("111-1111"))
                    console.println("Welcome Librarian alias Aman ");
                return libraryNo;
            }
        }
        return "Incorrect username/password";
    }

    public boolean IsLoggedIn(String libraryNo) {
        for (User user : register)
            if (user.equalByLibraryNo(libraryNo)) return user.isLoggedIn();
        throw new RuntimeException("You are not logged in");


    }
}
