package Repls;

public class DogObject {
    public static void main(String[] args) {

        Dog d1=new Dog("queen",2,"local");
        Dog d2=new Dog("moka",5,"outdoor");

        System.out.println(d1.toString());
        System.out.println(d1.getAgeInHumanYears());

    }
}
