package scanneroractice;

import java.util.Scanner;

public class scanneroractice {
    public static void main(String[] args) {
    //i want to save users input after asking some question
    //and i want to save this input so i can do do something with it
    //step 1  use Scanner class to create scanner object
        Scanner scan = new Scanner(System.in);
        //ask user to enter name
        System.out.println("your name is:");
        //capture what user typed on keyboard in console
        String firstName = scan.next();        // scan.next();  capture single word

        //print the result of what we saved from user input

      //  System.out.println("nice to meet you " + firstName );
        //ask question let user type
       // System.out.println("how old are you");
       // int age = scan.nextInt();              // scan.nextInt(); capture single number
        //System.out.println("your age is "+ age );

        System.out.println("how many min you spent on your way ?" );
        int min=scan.nextInt();
        scan.nextLine();  // capture the next information we enter.
        int hours=min/60;
        int remainder=min%60;

        System.out.println(min +"equals to" +hours+"and"+remainder+"mins");
        System.out.println("what is your order?");
        String myorder=scan.nextLine();
        String yourorder=myorder;
               yourorder="123";
        System.out.println(yourorder+"\n"+myorder);

        int choice = scan.nextInt();


        //your code here

        if(choice==1){
            System.out.println("user selected 1");
        }
        if (choice==2){
            System.out.println("user selected 2");
        }

        if(choice==3){
            System.out.println("user selected 3");

        }
















    }
}
