package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static void movieApp() {
        boolean willRun = true;
        Movie[] movieArray = MoviesArray.findAll();
        Input sc = new Input();
        while (willRun){
            System.out.println("\nWhat would you like to do?\n");
            System.out.println("0 - Exit");
            System.out.println("1 - View all movies");
            System.out.println("2 - View movies in the animated category");
            System.out.println("3 - View movies in the drama category");
            System.out.println("4 - View movies in the horror category");
            System.out.println("5 - View movies in the musical category");
            System.out.println("6 - View movies in the scifi category");
            System.out.println("7 - Add a movie to the list\n");
            int num = sc.getIntegerSecret(0, 8);
            switch (num) {
                case (0):
                    System.out.println("Are you sure you want to quit?");
                    sc.clear();
                    boolean confirm = sc.yesNo();
                    if (confirm) {
                        System.out.println("\nClosing program...");
                        willRun = false;
                        break;
                    } else {
                        System.out.println("\nRestarting...\n");
                        break;
                    }
                case (1):
                    for (Movie movie : movieArray) {
                        System.out.println(movie.getName() + " --- " + movie.getCategory());
                    }
                    break;
                case (2):
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case (3):
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case (4):
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case (5):
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("musical")) {
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case (6):
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case(7):
                    sc.clear();
                    System.out.println("Input movie title...");
                    String title = sc.getString();
                    System.out.println("Input movie genre");
                    String genre = sc.getString().toLowerCase();
                    Movie addMe = new Movie(title,genre);
                    movieArray = addMovie(movieArray, addMe);
                    System.out.println("Movie added... Would you like to confirm?");
                    boolean answer = sc.yesNo();
                    if (answer) {
                        for (Movie movie : movieArray) {
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                        break;
                    } else {
                        System.out.println("Restarting...");
                        break;
                    }
                case(8):
                    System.out.println("@                                                                                              \n" +
                            "                                                     *****    %***                             \n" +
                            "                                                     (****    ******                           \n" +
                            "                                                      ***    ******                            \n" +
                            "                                                      ***    *****                             \n" +
                            "                                                      ***   *****    ***                       \n" +
                            "            ***                                       **(   ****   ******                      \n" +
                            "   ******# ****                                       **   ***   *****                         \n" +
                            "    ***********                                            **  ****                            \n" +
                            "****************                                 (((          **                               \n" +
                            "   **************                           (((((((((((                                        \n" +
                            "  ****************                           (((((((((((                                       \n" +
                            "    ****************                      #*((((((                                             \n" +
                            "      ***************                #//**...*********/    ((((((((                            \n" +
                            "       **************/             ///...****************&    (((((((                          \n" +
                            "       *************////         ///.,(((/****((((((********   ((((                            \n" +
                            "        ************/////      /////**(***/(,...   ..(*******    ((                            \n" +
                            "        ***/*******///////#   /////((***/(...        .(********                       ***      \n" +
                            "         **//******///////// ////(((***/(...   /      (...,*****                    %*****     \n" +
                            "          ////****//////////////((((***/(....(/%/.  ..(    ./****                /********     \n" +
                            "          /////***////////////(((/(****/(,..........,((    ./****            ///*****/*******  \n" +
                            "           /////*////////////(((..,(****//(,,,...,((**#.....(*****        /////****************\n" +
                            "           //////////////////((((.((*****//////////***(....//**((*     ///////************** **\n" +
                            "            ////////////////(((((,.((******************/////******  /////////******************\n" +
                            "             ///////////////(((((...((**/**********************/**//////////*******/******  ***\n" +
                            "             */////////////((((((...(((***************/***/****(**/////////******/***   ***    \n" +
                            "              //////////////.,(((((((..((*********************(***////////*****//***           \n" +
                            "               ////////////(.((((((((....((******************(****///////****///**/            \n" +
                            "                ////////////(...((((((((((.,(((***********((******//////**////***              \n" +
                            "                *///////////(..(((((((((((.....,((((((((/.(*****/////////////***               \n" +
                            "                 ////////////((...((((((((....(.....((...(*/////////////////**                 \n" +
                            "                  ////////////(...*/////((((((((...((((((//////////////////*                   \n" +
                            "                   /////////////(..../////////..//(((((((/////////////////                     \n" +
                            "                  (///////////////(./....////////,//((,.((//////////////                       \n" +
                            "                  //////////////////((..//.....//...((...(////////////                         \n" +
                            "                 ///////////////////////((.....//....((/////////////                           \n" +
                            "                 ////////////////////////////////////////////////                              \n" +
                            "                ///////////////////////////,,,,,,,/////////////                                \n" +
                            "               //////////////////////////(//////////((////////(                                \n" +
                            "              ///////////////////////////////(((//////////////                                 \n" +
                            "             /////////////////////////////////////////////////                                 \n" +
                            "            #////////////////////////////////////////((//////                                  \n" +
                            "           %////////////////////////////////////////((///////                                  \n" +
                            "           /////////////////////////////////////////////////                                   \n" +
                            "         #/////////////////////////////////////////(((//////                                   \n" +
                            "        /////////////////////////////////////////((((//////                                    \n" +
                            "       //////////////////////////////////////((/(((////////                                    \n" +
                            "      /////////////////////////////////////(((////////////                                     \n" +
                            "     ////////////////////////////////////////////////////(                                     \n" +
                            "   //////////////////////////////////////////////////////                                      \n" +
                            "\n SECRET OPTION");
                    break;
                default:
                    System.out.println("working on it...");
                    break;
            }
        }
    }

    private static Movie[] addMovie(Movie[] movies, Movie movie){
        movies = Arrays.copyOf(movies, movies.length + 1);
        movies[movies.length - 1] = movie;
        return movies;
    }

    public static void main(String[] args) {
        movieApp();
    }
}