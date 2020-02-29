public class Day34methodpractice {

    public static void main(String[] args) {
// call the method from same or different class
        System.out.println(build3DigitalNumber(6,50,2));
        System.out.println(Day33returnmethod.ageCheker(2002));
        Day32voidemethodpractice.skipCount();

        //call the method that already exist:store them first then call them. (java.lang package)

     int sum= Math.addExact(2,3);

        System.out.println("sum = " + sum);

      int max= Math.max(10,20);
        System.out.println("max = " + max);

     //task name:
        name("user","abc123");// void method ,call it directly .

        System.out.println(logIn("user","abc123"));//return value, we need to print it.


    }

    public static int build3DigitalNumber(int digit1,int digit2,int digit3){
        if (digit1<0||digit1>9){
           digit1=0;
        }
        if (digit2<0||digit2>9){
          digit2=0;

        }
        if (digit3<0||digit3>9){
            digit3=0 ;
        }

            return digit1*100+digit2*10+digit3;

    }


public static void name(String userName,String password){
        if (userName.equalsIgnoreCase("user")&&password.equalsIgnoreCase("abc123")){
            System.out.println("log in successful.");
        }
        else {
            System.out.println("log in failed.");
        }
}

public static boolean logIn(String userName,String password){
    if (userName.equalsIgnoreCase("user")&&password.equalsIgnoreCase("abc123")){
       return true;
    }
    else {
        return false;
    }
}






}
