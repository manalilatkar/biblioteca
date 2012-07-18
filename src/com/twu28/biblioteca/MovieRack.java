package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: manalil
 * Date: 7/17/12
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieRack {
    public ArrayList<Movie> movieList=new ArrayList<Movie>(15);

    MovieRack(){
        movieList.add(new Movie("The Shawshank Redemption","Frank Darabont",9));
        movieList.add(new Movie("The Godfather","Francis Ford Coppola",9));
        movieList.add(new Movie("Schindler's List","Steven Spielberg",9));
        movieList.add(new Movie("The Dark Knight","Christopher Nolan",9));
        movieList.add(new Movie("Fight Club","David Fincher",8));
        movieList.add(new Movie("Devil Wears Prada","David Frankel",7));
        movieList.add(new Movie("The Princess Diaries","Garry Marshall",7));
        movieList.add(new Movie("Psycho","Alfred Hitchcock",8));
        movieList.add(new Movie("Casablanca","Michael Curtiz",8));
        movieList.add(new Movie("Raiders of the Lost Ark","Steven Spielberg",9));
        movieList.add(new Movie("Nosferatu","F.W.Murnau",7));
        movieList.add(new Movie("The Dark Knight Rises","christopher Nolan",-1));
        movieList.add(new Movie("The Lion King","Roger Allers",7));
        movieList.add(new Movie("The Diary of Anne Frank","George Stevens",8));
        movieList.add(new Movie("Step-up Revolution 3","Scott Speer",-1));
      }

    public void displayList(Console console) {
        console.println("Movie name Director Rating");
        for(Movie movie:movieList)
            console.println(movie.display());

    }
}
