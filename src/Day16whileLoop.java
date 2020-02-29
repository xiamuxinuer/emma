import javax.swing.*;

public class Day16whileLoop {
    public static void main(String[] args) {

        int x = 100;
        while (x <= 105) {
            System.out.println("hello world");//   repeat 6 times.
            ++x;
        }
        int count = 0;
        while (count < 11) {

            System.out.println("java:" + count);
            count++;
        }


        int sum = 10;
        while (sum > 0) {
            System.out.println("love :" + sum); // we can also use while(sum!=0)
            --sum;
        }
        int age = 10;
        while (age <= 20) {
            System.out.println(age++);
        }
        int age1 = 15;
        while (++age1 < 20) {
            System.out.println(age1);

        }
        int apples = 1;
        while (apples <= 10) {
            System.out.print(apples + ",");
            apples++;
        }
        System.out.println();
//loop task: count 1 to 5 then 5to 1
        int counter = 1;
        while (counter <= 5) {
            System.out.print(counter + " ");
            ++counter;

        }
        System.out.println();
        while (counter > 1) {

            --counter;
            System.out.print(counter + " ");

        }

        System.out.println();


        //task: skip count by 3,from 0 to 30
        int n=0;
        while (n<30){
            System.out.print((n+=3)+",");
        }
        System.out.println();
//task:write out even number from0 to 50
        int n0=0;
        while (n0<50){
            System.out.print((n0+=2)+",");
        }
        System.out.println();
//   write out odd number:
        int n1=1;
        while (n1<50){
            System.out.print(n1+",");
            n1+=2;
        }

        System.out.println();

//task:
        int y=0;
        while (y<=50) {
            if (y % 2 == 1) {
                System.out.println(y + " is odd number");


            }
        else if (y%2==0){
                System.out.println(y+" is even number, ");

            }
            y++;
        }






    }
}
