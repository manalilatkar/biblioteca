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
        if((this.libraryNo.equals((user).libraryNo))&&(this.password.equals((user).password)))
            return true;
        return false;

    }

    public boolean equalByLibraryNo(String libraryNo) {
        return (this.libraryNo==libraryNo);  //To change body of created methods use File | Settings | File Templates.
    }
}
