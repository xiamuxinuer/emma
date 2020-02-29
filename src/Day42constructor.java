import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day42constructor {
    public static void main(String[] args) {
        Movie m1=new Movie();
        System.out.println("m1 = " + m1);

        Movie m2=new Movie("die heart",1.5,"action");
        System.out.println("m2 = " + m2);

     String  movieName=m2.getName();
        System.out.println("movieName = " + movieName);
        System.out.println("m2.getLength() = " + m2.getLength());
        System.out.println("m2.getType() = " + m2.getType());

//Create List<Movie> yourFavoriteMovieLst  add 10 Movie Objects
        Movie film1 = new Movie("Children of Heaven", 1.39, "Family");
        Movie film2 = new Movie("Frozen2", 1.20, "kids");
        Movie film3 = new Movie("Family Guy", 2.39, "Family");
        Movie film4 = new Movie("Troy", 1.39, "Historical");
        Movie film5 = new Movie("Die heart", 2.5, "Action");
        Movie film6 = new Movie("Taken", 2.0, "Action");
        Movie film7 = new Movie("wonder women", 1.75, "Action");
        Movie film8 = new Movie("Ice Age", 1.5, "kids");
        Movie film9 = new Movie("Alien", 2.3, "scientific");
        Movie film10 = new Movie("Sound Of Music", 2.1, "Family");

        List<Movie> myFavoriteMovieLst = new ArrayList<>(Arrays.asList( film1,film2, film3, film4, film5, film6, film7, film8, film9,film10));

//Print the name of the movies less than 2 hours

  for (Movie  each:myFavoriteMovieLst){
    if (each.getLength()>2.0){
        System.out.println(each);
    }
}

//Print all the Action movies
        for (Movie  each:myFavoriteMovieLst){
            if (each.getType().equalsIgnoreCase("action")){
                System.out.println(each);
            }
        }

//Find out longest Movie name:
 String longestMovie=myFavoriteMovieLst.get(0).getName();
for (Movie each:myFavoriteMovieLst){
    if (each.getName().length()>longestMovie.length()){
    longestMovie=each.getName();
    }
}
        System.out.println("longestMovie = " + longestMovie);;




//If any Movie is longer than 2 hours Update the movie type to  Long(MovieType)
        for (Movie  each:myFavoriteMovieLst){
            if (each.getLength()>2.0){
                each.setType(" Long "+each.getType());//   confuse about this part
                System.out.println(each);
            }
        }

        //printMovieNameCharacters(m2); ---->>>        expected to print F-R-O-Z-E-N-2

        for (int i = 0; i <film2.getName().length(); i++) {
            if (!(i==film2.getName().length()-1)){
                System.out.print(film2.getName().toUpperCase().charAt(i)+"-");
            }
            else System.out.print(film2.getName().toUpperCase().charAt(i));
        }
        System.out.println("----------------------------");

//        printShorterMovieName

        String minMovieName=myFavoriteMovieLst.get(0).getName();
        for (Movie each:myFavoriteMovieLst){
            if (each.getName().length()<minMovieName.length()){
                minMovieName=each.getName();
            }
        }
        System.out.println(minMovieName);
//print your movie list:
        System.out.println(myFavoriteMovieLst);

                                   // calling the method from outside of main method :

//1.calling this method inside of main method :
        printmovieinfo(m2);
        System.out.println("-------------------------------");
// 2.Your Movie List after the method call
printarraylist(myFavoriteMovieLst);
        System.out.println("-------------------------------");
//3.sum of length of your movie list:
getsum(myFavoriteMovieLst);
        System.out.println("-------------------------------");

//4. printMovieNameCharacters

        printMovieNameCharacters(m2);

        System.out.println("-------------------------------");

 //5.   call the  method that check whether the length of movie is more than 2 hours

        System.out.println(isMovieLengthMoreThan2Hours(m2));
        System.out.println("-------------------------------");

//6.isFamilyMovie  :
        System.out.println(isFamilyMovie(m2));

        System.out.println("-------------------------------");

//7.  getCombinedMovieInfo:
        System.out.println(getCombinedMovieInfo(m2));

        System.out.println("-------------------------------");

//8.createMovie
        System.out.println(createMovie("Firends",3.5,"family"));
        System.out.println("-------------------------------");




        }

                       //  this is outside of main method:

//1.create a  static method outside of main method:
    /**
     //     * A void method that accept any movie object
     //     * and print out it's information in below format
     //     * The movie <name> is <length> hour long and it's genre is <type>
     //     * @param m is  the movie object to get information from
     //     */

        public static void printmovieinfo(Movie m){
            System.out.println("movie name:" +m.getName());
            System.out.println("movie length: "+m.getLength());
            System.out.println("movie type:"+ m.getType());
    }


 // 2.create a method that take Arraylist as parameter,data type is Movie,
public static void  printarraylist(List<Movie> m){
    for (int i = 0; i <m.size(); i++) {
        if (m.get(i).getLength()>2.0){
            System.out.println(m.get(i).getName()+" is long movie.");
        }
    }
}

    // 3.Sum of your movie hour totals
//        double totalHours = getTotalHoursOfAllMovies(myMovieList) ;
//        System.out.println("Total Hours = " + totalHours);
//​
public static void getsum(List<Movie> m){
            double sum=0;
    for (int i = 0; i <m.size(); i++) {
        sum+=m.get(i).getLength();
    }
    System.out.println("sum:"+ sum);
}

// 4.   /**
//     * A void method that accept any movie object
//     * and print out it's name in below format
//     * If the movie name is Joker then print J-O-K-E-R (all uppercase)
//     * @param movieObj the movie object to get information from
//     */
   public static void printMovieNameCharacters(Movie m) {
       for (int i = 0; i <m.getName().length(); i++) {
           if (!(i==m.getName().length()-1)){
               System.out.print(m.getName().toUpperCase().charAt(i)+"-");
           }
           else System.out.print(m.getName().toUpperCase().charAt(i));
       }
 }

//// 5.   /**
////     * A method that check whether the length of movie is more than 2 hours
////     * @param movieObj the movie object to check
////     * @return true if movieObj length is more than 2 hours
////     */
    public static boolean isMovieLengthMoreThan2Hours(Movie m) {

            if (m.getLength()>2.0){
                return true;
            }
        return false;
   }

    //  6.  /**
//     * A method that check the type of movie is Family or not
//     * @param movieObj the movie object to check
//     * @return true if movieObj type is Family (regardless of uppercase lowercase)

    public static boolean isFamilyMovie(Movie m) {
        if (m.getType().equalsIgnoreCase("family")){
            return true;
        }
        return false;
    }


 //7.   /**
     //     * A method to return combined movie info as String in below format"
     //     * for example if the movie is {"Joker", 2.2, "Drama"}
     //     *      It should return Joker-2.2-Drama
     //     * @param movieObj the movie object to check
     //     * @return the combined movie info as String
     //     */
    public static String getCombinedMovieInfo(Movie m) {

       String combinedResult = "";
       combinedResult+=m.getName()+"-"+m.getLength()+"-"+m.getType();
        return combinedResult;
   }
//​
// 8.   /**
//     * A method to return newly created Movie object with provided arguments
//     * @param aName the movie name you want the object to have
//     * @param aLength  the movie length you want the object to have
//     * @param aType the movie type you want the object to have
//     * @return Movie object with above information
//     */
    public static Movie createMovie(String aName, double aLength, String aType) {

        Movie newMovie = new Movie(aName,aLength,aType);
        return newMovie;
    }

}











