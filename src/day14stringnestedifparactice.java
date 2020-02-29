import java.util.Scanner;

public class day14stringnestedifparactice {
    public static void main(String[] args) {


     /*   Scanner input = new Scanner(System.in);

        System.out.println("enter your potion");

        String mainOption = input.next();  //123

        if (mainOption.equalsIgnoreCase("123")) {
            System.out.println("you select 123");


            String secondOption = input.next();//abc

            if (secondOption.equalsIgnoreCase("abc")) {
                System.out.println("here is your abc");
            } else if (secondOption.equalsIgnoreCase("polo")) {
                System.out.println("here is your polo");
            }
        } else {
            System.out.println("you are not hungry");
*/

//task1:
            String myName = "emmA";
            String myName2 = myName.substring(0, 1).toUpperCase() + myName.substring(1).toLowerCase();

            System.out.println(myName2);//--->>  Emma

//task2:
            String fullName = "aYra sTark";
            String firstName = fullName.substring(0, 4);//aYra
            System.out.println(firstName);

            String lastName = fullName.substring(5);// sTark
            System.out.println(lastName);

            String fixFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
            System.out.println(fixFirstName);

            String fixLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
            System.out.println(fixLastName);
            System.out.println(fixFirstName + " " + fixLastName);


        }
    }
