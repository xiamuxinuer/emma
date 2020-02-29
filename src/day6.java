import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("hwo much is this TV? ");
//        int regularPrice = input.nextInt();
//        System.out.println("what is the discount percentage?");
//        float discount = input.nextFloat();
//        System.out.println("price after discount is " + (regularPrice - regularPrice * discount));

//        System.out.println("what is your name?");
//        String lastName = input.next();
//        String firstName = input.next();
//        int age=input.nextInt();
//        System.out.println("your name is " + firstName + lastName);
//        System.out.println("your age is "+ age);


//        System.out.println(" what is your name ?");
//        String name=input.nextLine();
//        System.out.println("your name is "+ name);
//        System.out.println("what is your name?" + "how old are you ?" + "where do you live?");
//        String name = input.nextLine();
//        System.out.println("you have enter" + name);

        System.out.println("what is your name?");
        String name=input.nextLine();
        System.out.println("your name is "+ name );
        System.out.println("what is your age?");
        int age=input.nextInt();// we can put a space after age then keep entering the address,or add this :
        input.nextLine();    //to capture next line we enter  address.
        System.out.println("your age is "+age);
        System.out.println("what is your address?");
        String address=input.nextLine();
        System.out.println("your address is"+address);







    }
}
