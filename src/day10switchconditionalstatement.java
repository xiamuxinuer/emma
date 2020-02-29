import javax.swing.*;

public class day10switchconditionalstatement {
    public static void main(String[] args) {
        //if,else statement  practice:

        String myAnswer = "";
        int myNumber = 93;
        if (myNumber % 5 == 0) {
            myAnswer = "Fuzz Number";
        } else {
            myAnswer = "not a Fuzz Number";
        }
        System.out.println(myAnswer);

        // same output below:
        System.out.println(myNumber % 5);
        System.out.println(myNumber %= 5);

        //if ,else if statement practice:
        String order;
        int option = 11;
        if (option == 1) {
            order = ("cheese burger");
        } else if (option == 2) {
            order = ("french fries");
        } else {
            order = "coffee";
        }
        System.out.println(order);
        System.out.println("enjoy your meal!");

//switch statement practice:
                     // switch is for only == (equality) statement
                     // but "if else" can be used for all statements such as <, >, >=, etc.

        String myorder = "";
        char ordernumber = 'A';
        //   we can use in switch() : byte,short,int,char,string
        switch (ordernumber) {
            case 'a':
                myorder = ("cheese burger");
                break;

            case 'b':
                myorder = ("french fries");
                break;
            case 'c':
                myorder = "coffee";
                break;
            default:
                myorder = "ice cream";
        }
        System.out.println(myorder);
        System.out.println("enjoy your meal!");


        // switch practice:
        char operator = '*';
        //we can create a string assign value of what we want a print.
        switch (operator) {
            case '+':
                System.out.println("you are about to add number");
                break;
            case '-':
                System.out.println("you are about to subtract number");
                break;
            case '*':
                System.out.println("you are about to multiply number");
                break;
            case '/':
                System.out.println("you are about to divide number");
                break;
            default:
                System.out.println("you are doing nothing ");
        }


        //switch practice
        double price;    // double can not put inside of switch(),double can be printing statement(like string).
                        // only can use "byte,short,int,char,string"inside of switch().

        String itemName="tomato";
        switch (itemName){
            case "apple":price=0.99;
            break;
            case "pear":price=1.29;
            break;
            default:price=0.00;
        }
        System.out.println(price);


      //switch practice

        String season="java";
        String activities;
        switch (season){
            case "summer":activities="swimming";
            break;
            case "winter":activities="skating";
            break;
            case "fall":activities="climbing";
            break;
            case "spring":activities="go to Florida";
            break;
            default:activities="stay home and study java";
        }
        System.out.println(activities);


        int num1=20;
        int num2=10;
        char operator1='+';   //we can use if else if
        switch (operator1){
            case '-':
                System.out.println(num1-num2);
                break;
            default:
                System.out.println("invalid");


                //switch statement practice:

              String roomType;
              char lightwstch='C';
              switch (lightwstch){
                  case'B':   roomType="badroom light";
                   break;
                  case 'K':  roomType="kitchen light";
                    break;
                  case 'L':  roomType="living room light";
                  break;
                  default:    roomType="hallway light"; }

                System.out.println("turn on the   "+ roomType);


              if (lightwstch=='b'){
                  roomType="badroom light";}
                  else if (lightwstch=='k'){
                      roomType="kitchen light"; }
                  else {roomType="hallway light";}

                System.out.println("turn on "+roomType); }

        System.out.println("The End");

    }
}
