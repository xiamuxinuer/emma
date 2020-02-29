import java.util.Arrays;
import java.util.Scanner;

public class methodpracticeB11__viod {
    public static void main(String[] args) {

      printName("emma" );
      String name="dilida";
      printName(name);
      myname();
      sayHelloTo(" queen");
      printDoubledNumber(5);
      ageChecker(20);
      ageChecker(15);
      ageChecker((int) 12.95);//it will cast into int .
        printSum(12.5,10.9);
        printSum(10,20);
        yourName("Jon","Snow");
        count1To10();
        count1Ton(5);
        countStartToEnd(5,10);
        countDown(0,5);
        repeatJava5Times();
        repeatString("i love java",3);
        login("emma","123",false);


        //to call print array method ,declare parameter in here then call the method
        int[] intArray={1,2,3,4,5};
        printintArray(intArray);
       //or call it directly:
        printintArray(new int[]{5,7,9,11,15});

// compare size of to arrays:
        int[] array1={1,2,3,4};
        int[] array2={1,5};
        reportBiggerArray(array1,array2);
        //calculator:


    }


    public static void printName(String name){

        System.out.println(name);
    }

public  static void myname(){
    System.out.println("akbar");

}

public static void sayHelloTo(String name){

        System.out.println("say hello to " + name);
}


public static void printDoubledNumber(int num){

        System.out.println(num*2);
}
public static void ageChecker(int age){
        if (age>=18){
            System.out.println("you are adult ");
        }
        else {
            System.out.println("you are not adult");
        }
}
public static void printSum(double num1,double num2){
        double sum=num1+num2;
    System.out.println("sum is : "+sum);
}
public static void yourName(String firstName,String lastName){
    System.out.println("length of first name : "+firstName.length());
    System.out.println("lenth of lastnmae = " +lastName.length() );
    System.out.println(firstName.charAt(0));
    System.out.println(lastName.charAt(0));

    String fullName=firstName+" "+lastName;

    System.out.println(fullName);
    System.out.println(fullName.charAt(0)+fullName.substring(fullName.indexOf(" ")+1));

    for (int i = fullName.length()-1; i>=0; i--) {
        System.out.print(fullName.charAt(i));
    }
    System.out.println();
}

public static void count1To10(){
    for (int i = 1; i <=10 ; i++) {
        System.out.print(i+" ");
    }
    System.out.println();
}

public static void count1Ton(int n){
    for (int i = 1; i <=n; i++) {
        System.out.print(i+" ");
    }
    System.out.println();
}

public static void countStartToEnd(int start, int end){
    for (int i = start; i <=end; i++) {
        System.out.print(i+" ");
    }
    System.out.println();
}

public static void countDown(int start,int end){
    for (int i = end; i>=start; i--) {
        System.out.print(i+" ");
    }
    System.out.println();
}

public static void repeatJava5Times(){
    for (int i = 0; i <5; i++) {
        System.out.print("Java"+" ");
    }
    System.out.println();
}

public static void repeatString(String word,int n){
    for (int i = 0; i <n; i++) {
        System.out.print(word+",");
    }
    System.out.println();
}

public static void login(String userName,String passWord,boolean rememberMe){

    System.out.println("your user name is : "+ userName);
    System.out.println("your pass word is : "+ passWord);
    if (rememberMe){
        System.out.println("you have checked remember me check box");
    }
else {
        System.out.println("you did not checked remember me check box");
    }
}

public static void printintArray(int[] intArray){
        int sum=0;
    for (int i = 0; i <intArray.length; i++) {
        if (!(i == intArray.length - 1)) {
            System.out.print(intArray[i] + "-");
        }
        else {
            System.out.print(intArray[i]);
        }
        sum+=intArray[i];
    }
    System.out.println();
    System.out.println("sum of the numbers in int array is :"+ sum);
}

public static void reportBiggerArray(int[] array1,int[] array2){
        if (array1.length>array2.length){
            System.out.println("first array is bigger");
            System.out.println(Arrays.toString(array1));
        }
        else if (array1.length==array2.length){
        System.out.println("they have same size.");
    }
        else {
            System.out.println("second array is bigger");
            System.out.println(Arrays.toString(array2));
        }
}



}




















