package inheritancepractice;

public abstract class Shape {

    String name;
    int area;

    public Shape(String name) {
        this.name = name;
    }

public abstract void calculateArea();


    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
