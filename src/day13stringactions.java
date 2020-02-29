public class day13stringactions {
    public static void main(String[] args) {

     String s1="Hello";
        //  .equals
     System.out.println(s1.equals("hello"));
        // .equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("hello"));
       //toUppercase
        System.out.println(s1.toUpperCase());
        //toLowercase
        System.out.println(s1.toLowerCase());

        String name="Emma snow";
        System.out.println("my name is:"+name.toUpperCase());
        System.out.println("my name is:"+name.toLowerCase());

        //length :to know how many character in your string,giving you a result as a number.length care about space
        System.out.println(name.length());//-->9 (it counts space or any other character)

        int lengthOfString=name.length();
        System.out.println(lengthOfString);

         if (lengthOfString>5){
             System.out.println("more than 4 character");
         }

         else {
             System.out.println("less than 4 character");
         }

         //re-assigned the string value:

         String myName="Akbar";
        System.out.println(myName);
        myName="Dida";
        System.out.println(myName);


        String jobName="Teller";
        jobName.toUpperCase();// but we didn't print it.object didn't change.

        //System.out.println(jobName);//-->Teller
       // System.out.println(jobName.toUpperCase());//-->TELLER
       jobName=jobName.toUpperCase();//--> create a new object: jobName==>TELLER(we need to assigned to new value on object to change value)
        System.out.println(jobName);//  -->TELLER



        //  to check start with or end with another string(check single ro multiple character)
      String yourName="Muge";
      //to check if string start with another string
        System.out.println(yourName.startsWith("m"));//  --> it is case sensitive
      // to check if string end with another string
        System.out.println(yourName.endsWith("ge"));//-->true

       //contains:checks whether a string exist in another string
  String str="pumpkin1";
        System.out.println(str.contains("pumpkin"));//  true
        boolean gotPumpkin=str.contains("pumpkin");
        System.out.println(gotPumpkin);  // -->true

        System.out.println("gotPumpkin = " + gotPumpkin);  //  short cut to print variable value :soutv+enter

        boolean startedWith=str.startsWith("i");
        System.out.println("startedWith = " + startedWith);
        boolean endWith=str.endsWith("n");
        System.out.println("endWith = " + endWith);

        System.out.println(str.contains("u"));
        System.out.println(str.contains("$"));
        System.out.println(!str.contains("$"));

//    charAt(index): it will return a character at certain location specified.(you give the location,it give you the char)
        String bookName="java";
        System.out.println(bookName.charAt(0));//  start with0,1,2,3(has limit,can not give location that out of location range)
        char c0=bookName.charAt(0);
        char c1=bookName.charAt(1);
        char c2=bookName.charAt(2);
        char c3=bookName.charAt(3);
        System.out.println(c0+""+c1+""+c2+""+c3);// always give space between char

// indexOf: look for location from 0 location to end;
// you give the string or char ,it give you the location.(opposite of charAt),always give you fist appearance.
      //if the location not found , it gives you (-1).

        String movieName="game of java";//     length=12,but chat index start  count from 0,1,2....
        System.out.println(movieName.indexOf("java"));//  ==>>8(java start at number 8 th location)
        System.out.println(movieName.indexOf("o"));//  at number (5)th place
        System.out.println(movieName.indexOf("O"));  // minus number:you don't have it .(case sensitive)

        System.out.println(movieName.indexOf(" "));// (give you first space ) not empty string ,give an space,,first space appears at 4th place.

     // last indexOf: give you last location
        System.out.println(movieName.lastIndexOf("a"));//---11
        System.out.println(movieName.lastIndexOf(" "));//--7
        System.out.println(movieName.lastIndexOf("ga"));//  --0
        System.out.println(movieName.lastIndexOf("kawa"));//-->(-1) -->i don't see it .


         //check if you have a string in another string  -- use if (>-1)condition .
        if (movieName.indexOf("of")>-1){
            System.out.println("found kawa ");
        }

else {
            System.out.println("no kawa");
        }


  //   trim method:
        String myBook="     i love java   ";//  only take out the space on two side of the  string.
                                               //doesn't take out the space that between the string.
                                             //if want to remove space" " between the string,
                                             // use replace method ,replace " " with empty string""
        System.out.println(myBook);
        System.out.println(myBook.length());
        myBook=myBook.trim();
        System.out.println(myBook);
        System.out.println(myBook.length());

  // isEmpty: check whether the string is empty or not.
        System.out.println(myBook.isEmpty());  // false,cos myBook=i love java ,not an empty string.

// substring:returns substring from given begin index till right before end index.
        String tool="java";
        System.out.println(tool.substring(0,4));// --> java
        System.out.println(tool.substring(0));//  -->java// get string from beginning to end.

        System.out.println(tool.substring(0,3));// -->jav

        System.out.println(tool.substring(1,4));// -->ava

        System.out.println(tool.substring(1,3));// -->av


// replace:replace all occurrences of the specified string value.

        System.out.println(tool.replace("ja","oo"));
        System.out.println(tool.replace("a","e"));
        System.out.println(tool.replace("j","k"));
                //if want to remove space" " between the string,use replace method ,
                                                // replace space " " with empty string""
        String tool0="l a m a ";
        System.out.println(tool0.replace(" ",""));
// concat: adding a string
        System.out.println(tool.concat("  dao dao"));


        // method chaining: combine multiple method calls.

        System.out.println(tool.toLowerCase().contains("j"));// true

// loop:repeating
int count=1
        ;
while (count<=5){
    System.out.println("java");
    System.out.println("count is "+count);
    ++count;         //increase count by one,it will stop repeating when count=6
}











    }
}
