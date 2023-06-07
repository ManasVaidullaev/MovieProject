package MainPackage.DataBase.Models;

import java.util.LinkedList;

public class Movie {
    private String name;

    private int year;

    private String genre;

    private Director director;

    private LinkedList<Cast> cast;

    public Movie(String name, int year, String genre, Director director, LinkedList<Cast> cast) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public LinkedList<Cast> getCast() {
        return cast;
    }

    public void setCast(LinkedList<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "\nMovie{" +
                "\nname='" + name + '\'' +
                "\nyear=" + year +
                "\ngenre='" + genre + '\'' +
                "\ndirector=" + director +
                "\ncast=" + cast +"\n======================================"+
                '}';
    }
}
