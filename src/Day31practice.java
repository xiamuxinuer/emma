public class Day31practice {
    public static void main(String[] args) {

//class name. method name:(call the method from other class|)
        Day31voidmethod.printoddnumber();
        Day31voidmethod.saymyname();
        Day31voidmethod.sayhello();

        //call the method form this class:
           dailyactivities();
           //Day31practice.dailyactivities();
        learningjava();

        //calling a method inside a method:
       study();
        Day31practice2.sayhelloto("world");
        Day31practice2.eligibility(25);
        Day31practice2.calculator(10,20);
        Day31practice2.seasonchecker("winter");

    }

public static void dailyactivities()  {
    System.out.println("wake up");
}


public static void learningjava()  {
    System.out.println("learn java");
}

public static void study()  {
        dailyactivities();
        learningjava();
}







}







