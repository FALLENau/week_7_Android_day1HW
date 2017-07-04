package com.example.whitepaw.moviecollection;

/**
 * Created by Whitepaw on 03/07/2017.
 */

public class Ranking {
    private Movie[] moviesArray;

    public Ranking() {
        this.moviesArray = new Movie[10];
    }

    public void setUp(){
        Movie movie1 = new Movie("Birds", "Si-fi", 1);
        Movie movie2 = new Movie("Dodgeball", "Comedy", 2);
        Movie movie3 = new Movie("Starwars: Return of the Jedi", "Si-fi", 3);
        Movie movie4 = new Movie("Howl's Moving Castle", "Anime", 4);
        Movie movie5 = new Movie("Blade Runner", "Si-fi", 5);
        Movie movie6 = new Movie("Interstellar", "Si-fi", 6);
        Movie movie7 = new Movie("Serenity", "Si-fi", 7);
        Movie movie8 = new Movie("The Notebook", "Si-fi", 8);
        Movie movie9 = new Movie("Airplane!", "Si-fi", 9);
        Movie movie10 = new Movie("When Harry meet Sally", "Si-fi", 10);
        Movie[] allMovies = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        for (Movie movie: allMovies) {
            this.addMovie(movie);
        }
    }



    public void addMovie(Movie movie) {
        moviesArray[movie.getRanking() - 1] = movie;
    }

    public void setAndGetRanking(int index, int newRank) {
        moviesArray[index].setRanking(newRank);
        Movie tempPlacement = moviesArray[newRank];
        Movie placement = moviesArray[index];
        moviesArray[newRank] = placement;
        moviesArray[index] = tempPlacement;
    }

    public Movie getAMovieAtIndex(int index) {
        return moviesArray[index];
    }


//    assertEquals(5, ranking.getRank);
}
