package MainPackage.DataBase.Interfeises;

import MainPackage.DataBase.Models.Movie;

import java.util.List;

public interface Sortable {
    void sortByMovieName(List<Movie> movies);
    void sortByYear(List<Movie>movies);
    void sortByDirector(List<Movie>movies);

}
