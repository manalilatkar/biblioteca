package com.twu28.biblioteca;

/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/17/12
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */
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
