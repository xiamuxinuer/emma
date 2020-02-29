public class day14switchpractice {
    public static void main(String[] args) {


        String season="";

       //practice with "switch":
        switch (season) {

            case "summer":

            case "spring":

            case "fall":

                System.out.println("duck play");
                break;
            case "winter":
                System.out.println("duck sleep");
                break;
            default:
                System.out.println("no duck");

        }

           //task:password validator
        // min 8 char,max 16 char,must contains_or $,not contains space,must start with Ab
        //if any above condition not match,say invalid.else good password.

     String password="Ab12340$";
        boolean length=password.length()>=8&&password.length()<=16;
        boolean containvalue=password.contains("_")||password.contains("$");
        boolean notcontain=!password.contains(" ");

        boolean startwith=password.startsWith("Ab");


        System.out.println(length);
        System.out.println(containvalue);
        System.out.println(notcontain);
        System.out.println(startwith);

        if (length&&containvalue&&notcontain&&startwith){
            System.out.println("good password");
        }

else{
            System.out.println("invalid password");
        }



//   task:email check
     String email="emmaxiaogiti@gmail.com";
     boolean character=!email.contains("@");
     boolean space=email.contains(" ");
     boolean endwithg=email.endsWith("@gmail.com");
        boolean endwithy=email.endsWith("@yahoo.com");
        boolean endwithr=email.endsWith("@mail.ru");
if (character||space){

    System.out.println("invalid email");
}
else if (endwithg){
    System.out.println("gmail");
}
else  if (endwithy){
    System.out.println("yahoo mail");
}

else {
    System.out.println("russian mail");
}

// Task 1 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        If the sum of the numbers are more than 100 print you have won
//        if not print sum of 3 numbers are not more than 100

int num1=30;
int num2=50;
int num3=18;
int sum=num1+num2+num3;
       if (sum>100){
           System.out.println("you have von");
       }
        else if (sum<=100){
            System.out.println("sum is:"+ sum);
       }

//  task2:  google search test
        String keyWord="java";
        String tabTitle=keyWord+"-google search";
        if (tabTitle.startsWith(keyWord)&&tabTitle.endsWith("-google search")){
            System.out.println("test passed");
        }

        else {
            System.out.println("test failed");
        }



       // Task 3 :
       // given 3 whole numbers variable num1, num2 , num3 with value already set .
       // Write a program to
       // find out the largest number and print the result

if (num2>num1&&num1>num3){
    System.out.println("largest number is:"+num2);
}
//ask 4 :
//        it should print true if all the individual numbers are more than 100
//        if not print not all numbers are more than 100

if (num1>100&&num2>100&&num3>100){
    System.out.println("true");
}
        else {
    System.out.println("not all numbers are more than 100");
        }

        //task 5 : if multiplication result of num1 and num2 greater than sum of all the numbers
        //        print excellent result
        // else
        //        not the numbers combination I am looking for

        if (num1*num2>(num1+num2+num3)){
            System.out.println("excellent result.");
        }
        else {
            System.out.println("not the number combination i am looking for.");
        }


    }
}
