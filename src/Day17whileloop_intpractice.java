import javax.swing.*;

public class Day17whileloop_intpractice {
    public static void main(String[] args) {

       // Fizz Buzz task:
       int num=1;
       while (num<=50){
           if (num%5==0&&num%3==0){
               System.out.println(num+" is Fizz Buzz number.");
           }
           else if (num%5==0){
               System.out.println(num+" is Fizz number. ");
           }
           else if (num%3==0){
               System.out.println(num+" is Buzz number.");
           }
           ++num;
       }
        System.out.println("---------------------");

     //task: print all the even number from100 to 0
        int n=100;
       while (n>=0) {
           if (n % 2 == 0) {
               System.out.println(n + " is even number.");
           }

            else if (n%2!=0){
               System.out.println(n+" is odd number.");
           }
             --n;

       }

        System.out.println("-----------------------");


       //task:print all the even number from 0 to 100

        int x=0;
        while (x<=100){
        if (x%2==0) {
            System.out.println(x + " is even number.");
        }

        else if (x%2!=0){
            System.out.println(x+" is odd number.");
        }
            x++;

        }

        System.out.println("-----------------------");







    }
}
