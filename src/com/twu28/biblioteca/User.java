package com.twu28.biblioteca;


public class User {
    private String libraryNo;
    private String password;
    private boolean loggedIn;
   
    User(String libraryNo, String password){
        this.libraryNo=libraryNo;
        this.password=password;
        loggedIn=false;
        
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void logIn() {
        this.loggedIn=true;
    }
    public boolean equalForLogin(User user){
        return (this.libraryNo.equals((user).libraryNo)) && (this.password.equals((user).password));

    }

    public boolean equalByLibraryNo(String libraryNo) {
        return (this.libraryNo.equals(libraryNo));
    }
}
