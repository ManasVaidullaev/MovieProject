package MainPackage.DataBase.ServiceImpl;

import MainPackage.DataBase.DataBase;
import MainPackage.DataBase.Interfeises.Findable;
import MainPackage.DataBase.Interfeises.Sortable;
import MainPackage.DataBase.Models.Director;
import MainPackage.DataBase.Models.Movie;

import java.util.*;

public class MovieImpl implements Findable, Sortable {
    private DataBase dataBase;
    public MovieImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    public DataBase getDataBase() {
        return dataBase;
    }
    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        System.out.println("КАТАЛОГ ФИЛЬМОВ");
        return dataBase.getMovies();
    }

    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите полное или частичное название фильма: ");
        String movieName = scanner.nextLine();
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
           if (dataBase.getMovies().get(i).getName().contains(movieName)){
               System.out.println(dataBase.getMovies().get(i));}
            }}
    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("*****Мои актеры*****");
        System.out.println("Kira Naitly,Johnny Depp,Djai Courtny,Tom Cruise,Djohn Sina,\n" +
                "Margo Robby,Brad Pitt,Rebecca Fergusson,Robert Pattinson\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя актера/актрисы: ");
        String actorName = scanner.nextLine();
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            for (int j = 0; j < dataBase.getMovies().get(i).getCast().size(); j++) {
                if (dataBase.getMovies().get(i).getCast().get(j).getActorFullName().contains(actorName)){
                    System.out.println(dataBase.getMovies().get(i));}
            }}}
    @Override
    public void findMovieByYear(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год выпуска кино: ");
        int movieYear = scanner.nextInt();
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            if (movieYear != dataBase.getMovies().get(i).getYear()) {
                System.out.println("bul jyly chykkan kino jok");
                break;
            }else {
                System.out.println(dataBase.getMovies().get(i));
                break;
            }
        }
    }
    @Override
    public void findMovieByDirector(List<Movie> movies, Director director) {
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            if (director.equals(dataBase.getMovies().get(i).getDirector())) {
                System.out.println(dataBase.getMovies().get(i));
            }}}
    @Override
    public void findMovieByGenre(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите жанр фильма который желаете посмотреть:");
        String genre = scanner.nextLine();
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            if (genre.equalsIgnoreCase(dataBase.getMovies().get(i).getGenre())) {
                System.out.println(dataBase.getMovies().get(i));}
        }}
    @Override
    public void findMovieByRole(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название роли: ");
        String roleName = scanner.nextLine();
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            for (int j = 0; j < dataBase.getMovies().get(i).getCast().size(); j++) {
                if (roleName.equalsIgnoreCase(dataBase.getMovies().get(i).getCast().get(j).getRole())){
                    System.out.println(dataBase.getMovies().get(i));}
            }}}
    @Override
    public void sortByMovieName(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Click 1 to sort A-Z\nClick 2 to sort Z-A");
        int x = scanner.nextInt();
        switch (x){
            case 1:
        movies.sort(sortMovieNameAZ);
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            System.out.println(dataBase.getMovies().get(i).getName());
        }break;
            case 2:
        System.out.println("----------------------------------------");
        movies.sort(sortMovieNameZA);
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            System.out.println(dataBase.getMovies().get(i).getName());

        }break;
        }}

    @Override
    public void sortByYear(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Click 1 to sort year by Ascending \nClick 2 to sort year by Descending ");
        int x = scanner.nextInt();
        switch (x){
            case 1:
        movies.sort(sortMovieYear09);
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            System.out.println(dataBase.getMovies().get(i).getYear()+" "+
                    dataBase.getMovies().get(i).getName());}
        break;
            case 2:
        System.out.println("--------------------------------------");
        movies.sort(sortMovieYear90);
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            System.out.println(dataBase.getMovies().get(i).getYear()+" "+
                    dataBase.getMovies().get(i).getName());
        }break;
        }}

    @Override
    public void sortByDirector(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Click 1 to sort A-Z\nClick 2 to sort Z-A");
        int x = scanner.nextInt();
        switch (x){
            case 1:
        movies.sort(sortByDirectorAZ);
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            System.out.println(dataBase.getMovies().get(i).getDirector()+" "+
                    dataBase.getMovies().get(i));}
        break;
            case 2:
        System.out.println("************************************************************");
        movies.sort(sortByDirectorZA);
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            System.out.println(dataBase.getMovies().get(i).getDirector()+" "+
                    dataBase.getMovies().get(i));}
        break;
        }}



    public static Comparator<Movie>sortMovieNameZA=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());}
    };
    public static Comparator<Movie>sortMovieNameAZ=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());}
    };
    public static Comparator<Movie>sortMovieYear09=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()-o2.getYear();}
    };
    public static Comparator<Movie>sortMovieYear90= Comparator.comparingInt(Movie::getYear).reversed();
    public static Comparator<Movie>sortByDirectorAZ=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());}
    };
    public static Comparator<Movie>sortByDirectorZA=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getDirector().getName().compareTo(o1.getDirector().getName());}
    };
}
