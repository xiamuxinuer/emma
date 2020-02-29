public class day15stringmethodpractice {
    public static void main(String[] args) {

        String name = "emma";
        int lengthOFName = name.length();   // always store a length as int ,so we can use logical operators.in if condition.
        if (lengthOFName <= 4) {
            System.out.println("short name");

        } else if (lengthOFName > 4 && lengthOFName < 11) {
            System.out.println("medium name");
        } else if (lengthOFName >= 11) {
            System.out.println("long name");
        } else {
            System.out.println("no name");
        }

        System.out.println(name.contains("a") && name.contains("b"));
        if (name.contains("a") || name.contains("b")) {
            System.out.println("you have (a) or (e) in your name");
        } else {
            System.out.println("you don't have it in your name");
        }
        //   reversing a string:
        System.out.print(name.charAt(0));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(2));
        System.out.println(name.charAt(3));

        System.out.println(name.lastIndexOf("a"));


        String movieName = "Lord Of The Ring";
        System.out.println(movieName.substring(12) + " " + movieName.substring(5, 11) + " "
                + movieName.substring(0, 5));


        //task:

//print last character or the string:  last charAt=(length-1)
        int length=movieName.length();//  -->16
        System.out.println(length);
        System.out.println(movieName.charAt(15));// g

//task:
       String word1="Java";
       char c0=word1.charAt(0);
       char c1=word1.charAt(1);
       char c2=word1.charAt(2);
       char c3=word1.charAt(3);
        String word2=(c3+""+c2+""+c1+""+c0);//word2=""+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        System.out.println(word2);  //---->>avaJ

// task:find second word in sentence
        String sentence="i love java";
        String secondWord;
       int firstSpaceIndex=sentence.indexOf(" ");
       int lastSpceIndex=sentence.lastIndexOf(" ");
        System.out.println("first space index="+firstSpaceIndex);//-->>1
        System.out.println("last space index="+lastSpceIndex);// --->>6
        System.out.println(sentence.substring(2,6));//---->>love
        secondWord=sentence.substring(firstSpaceIndex+1,lastSpceIndex);
        System.out.println(secondWord);//----->>love
//get first word:
        String firstWord=sentence.substring(0,firstSpaceIndex);
        System.out.println(firstWord);//--->>i

        System.out.println(sentence.substring(0,firstSpaceIndex));//  same result above
// gert last word:
        String lastWord=sentence.substring(lastSpceIndex+1);// --->>java
        System.out.println(lastWord);
        System.out.println(sentence.substring(lastSpceIndex+1));//--->>java(same above)

//  get second space:
       int secondspace=sentence.indexOf(" ",firstSpaceIndex+1) ;

        System.out.println(secondspace);//    --->>6(second space at 6 location)





        //indexOfWith 2 parameters:
        String name0="i love java java java java";
        int firstJavaLocantion=name0.indexOf("java");
        System.out.println(firstJavaLocantion);//-->7
        System.out.println(name0.indexOf("java"));// -->> 7 (first java showed up at location 7.)
        int secondJavaLocation=firstJavaLocantion+1;
        System.out.println(name0.indexOf("java",secondJavaLocation));// ---->>second java at 12 location
        System.out.println(name0.indexOf("java",8));// second java(at 12th location)
        System.out.println(name0.indexOf("java",9));//  second java
        System.out.println(name0.indexOf("java",13));//third java(at 17 location)
        System.out.println(name0.indexOf("java",18));// fourth java(at22 location)









    }
}
