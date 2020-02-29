public class Day20forlooppractice {
    public static void main(String[] args) {


        String name="kayak";
        String reverseName="";
        for (int i = name.length()-1; i>=0; i--) {
           reverseName+=name.charAt(i);
        }
        System.out.println("reversed name is: "+ reverseName);



        //  check if the name is palindrome:
   if (name.equalsIgnoreCase((reverseName))){


       System.out.println("test passed.");
   }
else {
       System.out.println(" test failed.");
   }


 //task: work with  2 char at a time  in string:

        String myName="xamsinur";

//        System.out.println(myName.substring(0,2));
//        System.out.println(myName.substring(2,4));
//        System.out.println(myName.substring(4,6));
//        System.out.println(myName.substring(6,8));

//        int x=0;
//        System.out.println(myName.substring(x,x+2));
//        x+=2;
//        System.out.println(myName.substring(x,x+2));
//        x+=2;
//        System.out.println(myName.substring(x,x+2));
//        x+=2;
//        System.out.println(myName.substring(x,x+2));
//        x+=2;

        // in for loop do this way below:                  //last char index=myname.length-1
        //                                             so we can do  i<=last char index-1 equals to i<=myname.length-2
        for (int i = 0; i<=myName.length()-2 ; i+=2) {

            System.out.println(myName.substring(i,i+2));
        }
        System.out.println("------------------------");

        //task:

        for (int y=0; y<myName.length()-2;y++){
            System.out.println(myName.substring(y,y+2));
        }


//task: get 3 character at a time from string
        for (int x=0; x<=myName.length()-3; x++){
            System.out.println(myName.substring(x,x+3));
        }



String msg=" i like dog, dongs are cute, dogs are friendly";
        int lastcharindex=msg.length()-1;
        for (int m=0;m<=lastcharindex-2;m++){
            String current3chars=msg.substring(m,m+3);
           // System.out.println(m+ ":"+ current3chars);
            if (current3chars.equals("dog")){
                System.out.println(" find the dog.");
            }
        }







    }
}
