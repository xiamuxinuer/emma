public class day9ifstatemen {

    public static void main(String[] args) {

 int score=50;
if (score>60) { System.out.println("paseed"); }
 else { System.out.println("failed");}

        int num = 50;   //remainder=num%2 ;  (remainder%)
        if (num % 2 == 0) { System.out.println("even number"); }
        else { System.out.println("odd number"); }

        String citizenType = "";
        int age = 80;
        if (age > 65) { citizenType = "senior"; }   //declare the string inside of the "if"statement.we can assign different value
        else { citizenType = "non-senior"; }
        System.out.println(citizenType);
//   day name
        int dayCode=5;   //always give initial value before use a variable.
        String dayname="";
        if (dayCode == 5) { dayname = "friday";
            System.out.println("go to movie"); }
        else if (dayCode == 2) { dayname = "tuesday";    //always have condition.
            System.out.println("go to work"); }
        else { dayname = "unvalid"; }   // no condition
        System.out.println(dayname);


        //task
        int number=1;
        String language;
        if (number==1){language="marhaba";}
        else if (number==2){language="hello"; }
        else if (number==3){language="hola";}
        else {language="bonjour";}
             language=language+"  ,SDET";
        System.out.println(language);










        System.out.println("the end");


    }
}