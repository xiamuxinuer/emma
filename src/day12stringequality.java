public class day12stringequality {
    public static void main(String[] args) {
        //Sting equality:do not ever use "=="to check string equality.
   // never use "=="between two string,use(.equals)
        String name="emma";  //  called String literal
        String name1=new String("emma") ;
        String name3="emma";

        System.out.println(name);
        System.out.println(name1);

        System.out.println(name==name1);
        System.out.println(name==name3);
        System.out.println(name.equals(name1));

 //  string equality:

        String myString="lama";
        String yourString=new String("java");
        System.out.println(myString.equals(yourString));

//practice:
        if (myString.equals("java")){
            System.out.println("correct word");
        }
        else if (myString.equals("kawa")){
            System.out.println(" say pumpkin");
        }

       else {
            System.out.println("say java");
        }

//

String weather="rainy";


 if (weather.equals("sunny")){
     System.out.println("go to the park.");
 }
 else if (weather.equals("cold")){
     System.out.println("stay home and coding.");
 }
 else  if (weather.equals("snowy")){
     System.out.println("watch tv.");
 }
 else {
     System.out.println("go to sleep.");
 }


int month=9;                 //we can use like this(x>=  or x<=)
        if (month<1||month>12){
            System.out.println("invalid month.");
        }
        else if (month>=3&&month<=5){
            System.out.println("spring");
        }
        else if (month>=6&&month<=8){
            System.out.println("summer");
        }
        else if (month>8&&month<12){
            System.out.println("fall");
        }
        else if (month==12||month==1||month==2){   //  or we can just say else{sout{""} for this last part.
            System.out.println("winter");
        }



        String userName="use124";
        String password="pass123";

        if (userName.equals("use123")&&password.equals("pass123")){
            System.out.println("login successful");

        }
       else  if (password!="pass123"||userName!="use123"){   //  we can do if(!username.equals(use123))
       System.out.println("pass word or user name is wrong");}

        else if(!password.equals("pass123")||!userName.equals("use123")){
            System.out.println("wrong user name or pass word");
        }
        //  task: case sensitive( ignoreCase only use for string)

        String myName="emma";
        System.out.println(myName.equals("emma"));   // will not ignore uppercase or lowercase
        System.out.println(myName.equalsIgnoreCase("Emma"));//   will ignore uppercase or lowercase ,
                                                                        // just care about what is really inside it.

    }
}

