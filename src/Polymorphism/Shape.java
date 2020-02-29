package Polymorphism;

public abstract class Shape implements Drawable  {
   String name;
   double area;

    public Shape(String name) {
        this.name = name;
    }


    public abstract void calculateArea();


@Override
    public abstract void draw();


}





//Create an abstract class called Shape
//        it implements Drawable interface
//        it has 2 fields :  String name , double area
//        abstract method calculateArea();