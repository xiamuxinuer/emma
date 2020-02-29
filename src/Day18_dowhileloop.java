import java.util.Scanner;

public class Day18_dowhileloop {
    public static void main(String[] args) {

//      // do while loop:
//      int x=1;
//      do {
//          System.out.print(x);
//        x++;
//      }
//           while(x<=5);
//
//
//        System.out.println("---------------------");
//
//      int y=10;
//      do {
//          System.out.print(y);
//         --y;
//      }
//     while (y>0);

        Scanner input=new Scanner(System.in);
        String password="";

        do {
            System.out.println("enter password:");
            password=input.next();
        }
        while (!password.equalsIgnoreCase("B15"));

        System.out.println("door is open.");


//
//          while(!password.equalsIgnoreCase("b15")){
//    System.out.println("enter password");
//            password=input.next();
//
//        }
//        System.out.println("door open");

    }
}
