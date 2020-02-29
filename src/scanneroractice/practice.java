package scanneroractice;

import javax.swing.*;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            System.out.println("what is your age?");
        int age=input.nextInt();//  capture single whole number
        System.out.println("what is your height ?");
        float height=input.nextFloat();   //  capture number (fractional number)or input.nextdouble();
        System.out.println("what is your name?");String name=input.next();    //capture single word,or string

       System.out.println("your name is "+name +",you are "+age +"years old,"+"you are "+height +"feet tall.");
//   always ask question first
        System.out.println("what is your birth year?");
        int birthYear=input.nextInt();
        int myage=2019-birthYear;
        System.out.println("your age is"+myage);









    }
}
