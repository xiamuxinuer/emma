import java.util.Scanner;

public class forlooppractice {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
//        System.out.println("enter your number");
//        int start=input.nextInt();
//        int end=input.nextInt();
//          int sum=0;
//        for (int i=start;  start<= end; start ++) {
//            sum+=start;
//        }
//
//        System.out.println(sum);
//

//        System.out.println("enter 2 words with single character:");
//        char start=input.next().charAt(0);
//        char end=input.next().charAt(0);
//        for (char i = start; i<=end ; i++) {  //we can do it like below:
//                                           // for(char start;start<=end; start++){system.out.print(start+",");}
//            System.out.print(i+",");
//        }

        String word="abcdef";
        int length=word.length();
        if (length==1){
            System.out.println(word+word+word);
        }
        else if (length==2){
            System.out.println(word+word);
        } else if (length > 2) {

            if (length%2==1){
                System.out.println(word.charAt(length/2));
            }
            else {
                System.out.println(word.charAt(length/2-1)+""+word.charAt(length/2));
            }
        }
        
        
        // give me sum of odd number from 10 to 100:

        int sum=0;    //sum  has to be declared outside if loop body.

        for (int i =10; i <100 ; i++) {

            if (i%2==1){                                   //  (i%2!=0)
                sum=sum+i;
                System.out.println("odd numbers: "+i);}
        }
        System.out.println("sum of odd numbers :"+sum);   //===>>  2475

        // sum of odd numbers and sum of even numbers between 10 to 100:
        int sumOFodds=0;
        int sumOfeven=0;
        for (int i = 10; i <100; i++)
        {if (i%2==0){
            sumOfeven+=i;

        }
          else{
              sumOFodds+=i;
        }

        }
        System.out.println("sum of even numbers :"+sumOfeven);
        System.out.println("sum of odd numbers: "+sumOFodds);







        
        
        
        
        
        
        
        
        
        
    }
}
