package Polymorphism;

public class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        this.area=length*width;
    }

    @Override
    public void draw() {
        System.out.println("drawing rectangle ");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
