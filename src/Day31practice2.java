import javax.xml.namespace.QName;

public class Day31practice2 {

    public static void main(String[] args) {
           sayhelloto("kids");
           sayhelloto("emma");
           sayhelloto("akbar");
        eligibility(15);
        eligibility(35);

        seasonchecker("winter");
     //declare here before use it:
        String season="summer";
        seasonchecker(season);

       calculator(5,10);
       calculator(20,50);

    }

   public static void sayhelloto(String name){

       System.out.println("hello  "+ name);
   }

    public static void eligibility(int age){
    System.out.println(" your age : "+ age);
    if (age>18){
        System.out.println("you are eligible ");
    }
    else {
        System.out.println(" you are not eligible ");
    }
}

public static void seasonchecker(String season){

    System.out.println("season is : "+season);
    switch (season){
        case "spring":
            System.out.println("hiking");
            break;
        case "summer":
            System.out.println("swimming");
            break;
        case "fall":
            System.out.println("halloween ");
            break;
        case "winter":
            System.out.println("snowball fight");
            break;
        default:
            System.out.println("coding ");
    }

}
public static void calculator(int num1,int num2){
    System.out.println(" your number : "+num1 +" and "+num2 );

    System.out.println("addition result is : "+(num1+num2));
}






}
