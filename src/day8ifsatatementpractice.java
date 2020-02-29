import javax.crypto.spec.PSource;
import javax.swing.*;
import java.util.Scanner;

public class day8ifsatatementpractice {
    public static void main(String[] args) {



   Scanner input=new Scanner(System.in);

//        int speedlimit=60;
//        int yourcurrentspeed=input.nextInt();
//        boolean iAmspeeding=yourcurrentspeed>speedlimit;
//        if (iAmspeeding){ System.out.println("speeding");}
//       else { System.out.print("be careful,");System.out.println("go shopping");}


//        System.out.println("what is your current speed?");
//       int speed=input.nextInt();
//        if (speed>60){ System.out.println("you are speeding");}
//        else{ System.out.println("you are fine");}

        //   multiple statement practice


   int currentSpeed=input.nextInt();
   if (currentSpeed>80){ System.out.println("go to jail.");}
   else if (currentSpeed>70){ System.out.println("point taken");}
   else if (currentSpeed>60){ System.out.println("slow down");}
    else { System.out.println("keep driving.");}


//    int score=input.nextInt();
//    if (score>=90){ System.out.println("A");}
//    else if (score>=80){ System.out.println("B");}
//    else if (score>=70){ System.out.println("C");}
//    else if (score>=60){ System.out.println("D");}
//    else { System.out.println("failed");}




        System.out.println("The End");











    }
}
