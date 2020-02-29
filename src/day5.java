import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        //creating a scanner object
        Scanner input = new Scanner(System.in);
//        System.out.println("what is your name");
//        String name=input.next();    // capture single word
//        System.out.println("you are "+name);
//        System.out.println("how old are you?");
//        int age=input.nextInt();     // capture single number
//        System.out.println("you are"+age +"old");

        //    int birthYear=2001;
        //    int currentYear=2019;
        //   int myAge=currentYear-birthYear;
        //   System.out.println("i am "+ myAge+ "year old.");
        //  System.out.println("what is speed limit?");
        //   int speedLimit = input.nextInt();
        //  System.out.println("what is your current speed?");
        //  int currentSpeed = input.nextInt();
        //  int speeding = currentSpeed - speedLimit;
//        System.out.println("here is your speeding ticket");

        //  System.out.println("what is the temperature?");
        //   double farenheit=input.nextDouble();
        //  double celcius= (5.0/9)*(farenheit-32);
        //  System.out.println(farenheit+"F"+"  is  "+celcius+"C.");

        //System.out.println("how many hours we have in a day?");
        // int hours=input.nextInt();
        // int mins=hours*60;
        //  int seconds=mins*60;
        // System.out.println("we have  "+mins + "mins in a day,"+"it equals to  "+seconds+"seconds.");

        //System.out.println("what is your yearly salary?");
       // int yearlysalary = input.nextInt();
       // int monthlysalary = (yearlysalary / 12);

       // System.out.println("my monthly income is " + monthlysalary);


        System.out.println("what is the price of potato?");
        float potatoprice=input.nextFloat();
        System.out.println("how many do you want to buy?");
        int potatocount=input.nextInt();
        System.out.println("your total is :"+(potatocount*potatoprice));




    }
}
