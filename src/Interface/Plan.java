package Interface;

public class Plan implements Flyable {

String name;
int speed;
int capacity;


    @Override
    public void fly() {
        System.out.println("plan is flying");
    }

    public static void main(String[] args) {
        Plan p=new Plan();
        p.fly();
        System.out.println(Flyable.HaveWing);
    }







}
