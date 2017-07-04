package com.example.whitepaw.moviecollection;
import java.lang.reflect.Array;

/**
 * Created by Whitepaw on 03/07/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int ranking;

    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;

    }

    public String getTitle() {
        return title;
    }

    public int getRanking() {
        return ranking;
    }

    public String getGenre() {
        return genre;
    }

    public String setTitle(String title) {
        return this.title = title;
    }

    public String setGenre(String genre) {
        return this.genre = genre;
    }

    public int setRanking(int ranking) {
        return this.ranking = ranking;
    }
}
