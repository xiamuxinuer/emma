package Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeObjects {
    public static void main(String[] args) {


//        Square s=new Square("square",5);
//
//        s.draw();
//        s.calculateArea();
//        System.out.println(s.area);
//
//        Shape s0= new Circle("circle",3);
//
//        s0.draw();
//        s0.calculateArea();
//        System.out.println(s0.area);
//
//
//
//
//        Drawable d=new Circle("circle",7);
//        Drawable d0=new Square("square",10);
//        d.draw();
//        d0.draw();
//
//        System.out.println("____________--------------------------------------------------------");
//
//
//
//        List<Shape> shapeList= new ArrayList<>(Arrays.asList(s,s0));
//        for (Shape eachShape:shapeList){
//            eachShape.draw();
//        }
        System.out.println("____________--------------------------------------------------------");

     //   Circle  s1 = new Circle("penny",5);
        Shape s1 = new Circle("penny", 5);
        printAnyShapeArea(s1);
        Shape s2 = new Rectangle("Book", 10, 5);
        printAnyShapeArea(s2);
        // here we are directly passing the sub class object
        // to a method that have Shape as parameter type
        printAnyShapeArea(new Square("Bob", 6));

        System.out.println("____________--------------------------------------------------------");


        drawShape3Times(s2);
        drawShape3Times(s1);
        drawShape3Times(new Square("Bob", 6));
    }
    // Create a static method called drawShape3Times
    // it has Shape as parameter
    // return nothing
    // it will draw the shape 3 times
    public static void drawShape3Times(Shape anyShape) {
        anyShape.draw();
        anyShape.draw();
        anyShape.draw();
    }
    // create a method that accept any Shape and print out the calculated area
    public static void printAnyShapeArea(Shape anyShape) {
//
        anyShape.calculateArea();
        System.out.println(anyShape.name + "'s area is = " + anyShape.area);
    }










    }

