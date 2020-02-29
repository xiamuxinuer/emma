package InterfacePracticeDay54;

public class AnimalShow {

    public static void main(String[] args) {

        Dog d1=new Dog();
        Animal a1=new Dog();
        IndoorPet p1=new Dog();
        Object o1=new Dog();

   // it can only access reference type class,
   // we only have one object (d1),but we have 3 leash for it .
        Animal a2=d1;
        Object o2=d1;
        IndoorPet p2=d1;










    }
}
