package DataBase;

import Models.Cast;
import Models.Director;
import Models.Movie;

import java.util.LinkedList;
import java.util.List;

public class DataBase {
    private LinkedList<Cast>casts;
    private LinkedList<Director>directors;
    private LinkedList<Movie>movies;

    public DataBase(LinkedList<Cast> casts, LinkedList<Director> directors, LinkedList<Movie> movies) {
        this.casts = casts;
        this.directors = directors;
        this.movies = movies;
    }

    public LinkedList<Cast> getCasts() {
        return casts;
    }

    public void setCasts(LinkedList<Cast> casts) {
        this.casts = casts;
    }

    public LinkedList<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(LinkedList<Director> directors) {
        this.directors = directors;
    }

    public LinkedList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(LinkedList<Movie> movies) {
        this.movies = movies;
    }
}
