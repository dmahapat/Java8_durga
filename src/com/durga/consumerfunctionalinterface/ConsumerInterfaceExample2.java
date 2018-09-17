package com.durga.consumerfunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Movie {
    String name;
    String hero;
    String heroine;

    Movie(String name,String hero,String heroine) {
        this.hero = hero;
        this.name = name;
        this.heroine = heroine;
    }
}

public class ConsumerInterfaceExample2 {

    static public void main(String[] args) {
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Bahubali","Prabhas","Anuska"));
        movies.add(new Movie("Raees","Shahrukh","Sunny"));
        movies.add(new Movie("Dangal","Amir","XYZ"));
        movies.add(new Movie("Sultan","Salman","Anuska"));


        Consumer<Movie> movieConsumer = movie -> {
          System.out.println("Movie Name: "+movie.name);
          System.out.println("Movie Hero: "+movie.hero);
          System.out.println("Movie Heroine: "+movie.heroine);
        };

        for (Movie movie : movies) {
            movieConsumer.accept(movie);
            System.out.println("*********");
        }
    }
}
