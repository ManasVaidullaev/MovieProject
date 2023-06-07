package MainPackage.DataBase;

import MainPackage.DataBase.DataBase;
import MainPackage.DataBase.Models.Cast;
import MainPackage.DataBase.Models.Director;
import MainPackage.DataBase.Models.Movie;
import MainPackage.DataBase.ServiceImpl.MovieImpl;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cast cast1=new Cast("Kira Naitly","Elizabet Suonn");//piraty karibs morya
        Cast cast2=new Cast("Johnny Depp","Captain Djack");
        Cast cast3=new Cast("Djai Courtny","Charly"); //djack richer
        Cast cast4=new Cast("Tom Cruise","Djack Richer");
        Cast cast5=new Cast("Djohn Sina","Mirotvorec");//otryad samoubiyc
        Cast cast6=new Cast("Margo Robby","Harly Kvinn");
        Cast cast7=new Cast("Margo Robby","Nelly Laroy");// Vavilon
        Cast cast8=new Cast("Brad Pitt","Jack Conrad");
        Cast cast9=new Cast("Tom Cruise","Itan Hant");//missiya nevyl
        Cast cast10=new Cast("Rebecca Fergusson","Ilza");
        Cast cast11=new Cast("Robert Pattinson","Batman");//batman
        LinkedList<Cast>casts=new LinkedList<>(List.of(cast1,cast2,cast3,cast4,cast5,cast6,cast7,cast8,cast9,cast10));
        LinkedList<Cast>casts1=new LinkedList<>(List.of(cast1,cast2));
        LinkedList<Cast>casts2=new LinkedList<>(List.of(cast3,cast4));
        LinkedList<Cast>casts3=new LinkedList<>(List.of(cast5,cast6));
        LinkedList<Cast>casts4=new LinkedList<>(List.of(cast7,cast8));
        LinkedList<Cast>casts5=new LinkedList<>(List.of(cast9,cast10));
        LinkedList<Cast>casts6=new LinkedList<>(List.of(cast11));


        Director director1=new Director("Gor","Verbinskiy");//piraty
        Director director2=new Director("Cristopher","Maccuory");//djack
        Director director3=new Director("Djaims","Gun");//otryad
        Director director4=new Director("Demyen","Shazel");//babylon
        Director director5=new Director("Cristopher","Maccuory");//missiya
        Director director6=new Director("Mett","Rivz");//batman
        LinkedList<Director>directors=new LinkedList<>(List.of(director1,director2,director3,director4,director5,director6));


        Movie movie1=new Movie("Piraty Karibskogo Morya",2003,"istoricheskiy",director1,casts1);//2003
        Movie movie2=new Movie("Djack Richard",2012,"Boevik",director2,casts2);//2012
        Movie movie3=new Movie("Otryad Samoubiyc",2021,"Boevik",director3,casts3);//2021
        Movie movie4=new Movie("Babylon",2022,"Drama",director4,casts4);
        Movie movie5=new Movie("Missiya Nevypolnima",2015,"Triller",director5,casts5);
        Movie movie6=new Movie("Batman",2022,"Priklucheniya",director6,casts6);
        LinkedList<Movie>movies=new LinkedList<>(List.of(movie1,movie2,movie3,movie4,movie5,movie6));

        DataBase dataBase=new DataBase(casts,directors,movies);

        MovieImpl movieImpl=new MovieImpl(dataBase);
        mainInfo();
        Scanner scanner=new Scanner(System.in);
        while (true){
            int x= scanner.nextInt();
            switch (x) {
                case 1:
                    System.out.println(movieImpl.getAllMovies(movies));
                getInfo();
                break;
                case 2:  movieImpl.findMovieByFullNameOrPartName(movies);
                getInfo();
                break;
                case 3: movieImpl.findMovieByActorName(movies);
                getInfo();
                break;
                case 4: movieImpl.findMovieByYear(movies);
                getInfo();
                break;
                case 5: movieImpl.findMovieByGenre(movies);
                getInfo();
                break;
                case 6: movieImpl.findMovieByRole(movies);
                getInfo();
                break;
                case 7: movieImpl.findMovieByDirector(movies,director2);
                getInfo();
                break;
                case 8: movieImpl.sortByMovieName(movies);
                getInfo();
                break;
                case 9: movieImpl.sortByYear(movies);
                getInfo();
                break;
                case 10: movieImpl.sortByDirector(movies);
                getInfo();
                break;
            }}






    }































    public static void getInfo(){
        System.out.println("Click 1 to get all movies...............");
        System.out.println("Click 2 to search movie by name.........");
        System.out.println("Click 3 to find movies by actor name....");
        System.out.println("Click 4 to find movies by year..........");
        System.out.println("Click 5 to find movies by genre.........");
        System.out.println("Click 6 to find movies by role..........");
        System.out.println("Click 7 to find movies by his director..");
        System.out.println("Click 8 to sort movies by name..........");
        System.out.println("Click 9 to sort movies by year..........");
        System.out.println("Cllick 10 to sort movies by director....");

    }
    public static void mainInfo(){
        System.out.println("*********WELCOME*********");
        System.out.println("Click 1 to get all movies...............");
        System.out.println("Click 2 to search movie by name.........");
        System.out.println("Click 3 to find movies by actor name....");
        System.out.println("Click 4 to find movies by year..........");
        System.out.println("Click 5 to find movies by genre.........");
        System.out.println("Click 6 to find movies by role..........");
        System.out.println("Click 7 to find movies by his director..");
        System.out.println("Click 8 to sort movies by name..........");
        System.out.println("Click 9 to sort movies by year..........");
        System.out.println("Cllick 10 to sort movies by director....");
    }
}