import java.util.ArrayList;
import java.util.List;
// this task in Day42 constructor class:
public class Movie {
//instance variable:
    private String name;
    private double length;
    private String type;


    public  Movie(){

    }

    //write a constructor to set all the value:

    public Movie(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }


    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {

        return name;
    }

    public double getLength() {

        return length;
    }

    public String getType()
    {
        return type;
    }



    //Add Setters to Movie Class

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {

        this.length = length;
    }

    public void setType(String type) {

        this.type = type;
    }










}




