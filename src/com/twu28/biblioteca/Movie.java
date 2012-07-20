package com.twu28.biblioteca;


public class Movie {
    private String name;
    private String director;
    private int rating;


    public Movie(String name, String director, int rating) {
        this.name=name;
        this.director=director;
        this.rating=rating;

    }

    public String  display() {
        if (rating==-1)
        return (name+"  "+director+"  N/A");
        return (name+"  "+director+"  "+rating);

    }
}
