package com.newfeatures.java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Movie {
    String name;
    String hero;
    String heroine;

    Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }
}

public class DisplayMovieInformation {

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        populate(movies);
        Consumer<Movie> movieConsumer = movie -> {
            System.out.println("Movie name : " + movie.name);
            System.out.println("Movie hero : " +movie.hero);
            System.out.println("Movie heroine : " +movie.heroine);
        };
        for (Movie movie : movies) {
            movieConsumer.accept(movie);
        }
    }

    private static void populate(List<Movie> movies) {
        movies.add(new Movie("Bahubali", "prabhas", "anuskha"));
        movies.add(new Movie("Baby", "Akshay", "Kareena"));
        movies.add(new Movie("Sarak 2 ", "Sanjay", "Alia"));
        movies.add(new Movie("Namaste London", "Akahay", "Deepika"));
    }
}
