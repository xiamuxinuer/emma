public class Day32returnmethod {
    public static void main(String[] args) {
        String name=myname();
        System.out.println(name);
        //or
        System.out.println(myname());


        System.out.println(doubleIt(10));
        System.out.println(doubleIt(20));
        System.out.println(sumIt(10,20));
        System.out.println(sumIt(20,45));
     // or:
      int sum=sumIt(10,50);
        System.out.println(sum);
        System.out.println(sum+50);

        System.out.println(divide(10,0));
        System.out.println(divide(20,4));

//  task:spellName
        System.out.println(spellName("emma"));//    e-m-m-a

//task:getThesumOf1toX
        System.out.println(getThesumOf1toX(10));

//task:buildEmail
        System.out.println(buildEmail("Emma","snow"));

        //or
        String fullName="John Snow";
        String firstName=fullName.split(" ")[0];
        String lastName=fullName.split(" ")[1];
        System.out.println(buildEmail(firstName,lastName));




    }

   public static String myname(){

       return "emma";

   }

public static int doubleIt(int num ) {
     return num*2;
}

public static int sumIt(int num1,int num2){

        return num1+num2;
}

public static double divide(double num3,double num4){

        if (num4==0){
            return 0;
        }
        else {
            return num3/num4;
        }
}

public static String spellName(String name){
        String result="";
        for (int x=0;x<name.length();x++){
            result+=name.charAt(x);
            if (x!=name.length()-1){
                result +="-";
            }
        }
       return result;
}

public static int getThesumOf1toX(int x){
        int sum=0;
        for (int i=1;i<=x;i++){
            sum+=i;
        }
        return sum;
}

public static String buildEmail(String firstName,String lastName){
        String email=firstName.charAt(0)+lastName+"@NightWatch.com";
        return email;


}









}
