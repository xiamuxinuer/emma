package inheritancepractice;

public class Rectangle extends Shape {
int width;
int height;

    public Rectangle(int width, int height) {
        super("rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area=width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    public static void main(String[] args) {

        Rectangle r=new Rectangle(2,4);

        r.calculateArea();
        System.out.println(r);

    }




}
