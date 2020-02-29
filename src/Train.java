public class Train extends Vehicle {

    int wagonCount;
    public void makeSound(){
        System.out.println("make sound:choo choooo");
    }


    public static void main(String[] args) {
        Train t1=new Train();
        t1.makeSound();
        t1.make="thomas";
        t1.setYear(1999);
        t1.getYear();
        t1.start();
        t1.goForward();


    }
}
