package InterfacePracticeDay54;

public class Dog extends Animal implements IndoorPet {




    @Override
    public void speak() {
        System.out.println("dog barks.");
    }


    @Override
    public void play() {
        System.out.println("dog chase the ball");


    }




}
