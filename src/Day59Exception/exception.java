package Day59Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {

String name= "emma";
        Scanner s=new Scanner(System.in);
        System.out.println("enter your index: ");


            try {
                int index = s.nextInt();
                System.out.println(name.charAt(index));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println(" something unusual happen.");
            } catch (InputMismatchException e) {
                System.out.println("input mismatch .");
            } catch (Exception e) {
                System.out.println(" something wrong.");
            }finally {
                System.out.println("this code will run no matter what");
            }




        System.out.println("------------------------------------------------------");
int[] num={5,20,15,23};

try {
    System.out.println(num[5]);
}catch (Exception e){
    System.out.println(e.getMessage());
}finally {
    System.out.println("this code will always run no matter we have exception or not");
}












    }


}
