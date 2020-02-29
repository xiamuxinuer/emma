package Polymorphism;

public class Circle extends Shape {
    int radius;

    public Circle(String name ,int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }

    @Override
    public void calculateArea() {
        this.area = Math.PI * radius * radius;//3.14*r*r

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
// Cirlce
//                    field : radius
//                    instance methods : (implement all abstract methods)
//                    toString method