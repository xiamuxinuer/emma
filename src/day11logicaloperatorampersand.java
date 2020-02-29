import javax.swing.*;

public class day11logicaloperatorampersand {
    public void main(String[] args) {
    // logical operator (combining multiple condition together:&,  && (ampersand)
        //check both conditions are true at the same time

   int x=70; //     x>60 && x<100;   true

   int y=10; //    x>60  && x<100;   false

   int i=20;//     i>30  && i>100;   false

    int number=60;
    if (number<30 &&  number>100){
        System.out.println("good work");}

else if (number>50&& number<100){
        System.out.println("go home"); }
else {
        System.out.println("work");}
     // log in example (use name and password )
        System.out.println(true&&true);//-->true
        System.out.println(true&&false);// -->false
        System.out.println(false&&false);//-->false


//  "or" statement  use "|"   and "||" (pipe)
        // as long as one side of the sentence is true all sentence will true-->output is true
        System.out.println(true||true);//-->true
        System.out.println(true||false);// -->true
        System.out.println(false||false);//-->false

int age=90;
if (age<16||age>80){
    System.out.println("cant drive");
}
else {
    System.out.println("can drive");}


int speedLimit=65;
if (speedLimit<60||speedLimit>100){
    System.out.println("hello");
}
else {
    System.out.println("bye");
}

//practice:

int price=55;
if (price>50&&price!=52||price==55){
    System.out.println(true);
}
else {
    System.out.println(false);}



int score=95;
if (score==100){
    System.out.println("perfect score!");
}
else if (score<0||score>100){
    System.out.println("invalid score");
}
else if (score>70&&score<100){
    System.out.println("you have passed");
}
else {
    System.out.println("you have failed");
}
;






    }
}




