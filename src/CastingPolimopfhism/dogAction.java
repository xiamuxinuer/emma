package CastingPolimopfhism;

public class dogAction {

    public static void main(String[] args) {

       Dog d1=new Dog("out door");

       d1.bark();

       Object o1= new Dog("indoor");

       ((Dog) o1).bark();

       Object o2=d1;   // up casting
       Dog d2= (Dog) o1;// down casting

d2.bark();
((Dog) o2).bark();




    }
}
