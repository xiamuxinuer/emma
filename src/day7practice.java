import java.util.Scanner;

public class day7practice
{
    public static void main(String[] args) {

       Scanner input=new Scanner (System.in);
//        System.out.println("what is your name ? ");
//        String name=input.nextLine();
//        System.out.println("how old are you ? ");
//        int age=input.nextInt();
//        input.nextLine();
//        System.out.println("your age is "+age);
//        System.out.println("what is your address?");
//        String address=input.nextLine();
//        System.out.println("your address is "+address);

//        int hour,minute,second;
//        String amorPm;
//        hour=input.nextInt();
//        minute=input.nextInt();
//        second=input.nextInt();
//        amorPm=input.next();
//        System.out.println(hour+":"+minute+":"+second+" "+amorPm);
       //   String firstName="emma";
     //     String lastName="snow";
        //  String compeny="paycom";


        String firstName,lastName,company,email;
        int age;
//       firstName="akbar";
//       lastName="Adel";
//       company="verizon";
//       email=firstName+"_"+lastName+ "@"+company+".com";
//
//        System.out.println("my name is  "+ firstName +lastName +"  and i work for  "
//                +company+"  and my email address is "+email);


        firstName=input.next();
        lastName=input.next();
         company=input.next();
         age=input.nextInt();
         input.nextLine();
         email=input.next();
        System.out.println("my name is "+firstName +lastName+ ","+ "i work at "
                + company + "  i am "+ age+" years old, " + " my email address is "+email);












    }
}
