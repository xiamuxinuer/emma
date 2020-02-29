import java.util.Arrays;

public class Day34methodoverloading {
    public static void main(String[] args) {

        System.out.println("emma");
        System.out.println(12);
        String name="over loading";
        System.out.println(name);
        System.out.println(name.substring(0,4));
        System.out.println(name.substring(5));
        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));

sayhello();
sayhello("emma");
sayhello(15);
        System.out.println(sayhello("john","snow"));
   add(100);
   add(100,200);
   add(100,200,300);
   add(500,700);


   // return String Array:
        System.out.println(Arrays.toString(boysVSGirls()));



    }

//method overloading:
//reusing the same method name with different parameter type
//we can not have two method name with method name and same method parameters list(data type).
public static void sayhello(){
    System.out.println("hello, world");
}
public  static void sayhello(String yourname){
    System.out.println("hello, "+yourname);
}
public static void sayhello(int num){
    System.out.println("hello, "+ num);
}


public static String sayhello(String firstName,String lastName){
        return "hello, "+firstName+" "+lastName;
}

public static void add(int number){
    System.out.println(number+100);
}
public static void add(int num1,int num2){
    System.out.println(num1+num2);
}
public static void add(int num1,int num2,int num3){
    System.out.println(num1+num2+num3);
}
public static void add(long x,long y){
    System.out.println(x+y);
}


public static int[] boysVSGirls(){
        int[] boysGirlsCount= {56,52};
        return boysGirlsCount;
}







}
