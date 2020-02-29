package Polymorphism;

public class Square extends Shape {
    int length;

    public Square(String name,int length) {
        super(name);
        this.length=length;
    }

    @Override
    public void draw() {
        System.out.println("drawing square");
    }


    @Override
    public void calculateArea() {
        this.area= length*length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
// Square
//                    field : length
//                    instance methods : (implement all abstract methods)
//                    toString method