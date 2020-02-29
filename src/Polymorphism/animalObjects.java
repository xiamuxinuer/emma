package Polymorphism;

public class animalObjects {
    public static void main(String[] args) {

        Animal a1=new Dog();
        a1.makeNoise();
         a1=new Horse();//  so we reassigned the value of a1.now it is pointing the horse.we lost dog object.
        a1.makeNoise();
        Animal a2=new Horse();
        a2.makeNoise();

         Dog d1=new Dog();

         Animal a3=d1;
         a3.makeNoise();






    }
}
