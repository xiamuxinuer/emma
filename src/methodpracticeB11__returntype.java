import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class methodpracticeB11__returntype {
    public static void main(String[] args) {

        System.out.println(giveMe5());
        System.out.println(myName());

        System.out.println(yourName("akbar"));
        System.out.println(number(10 ,20));
      //or save it as a variable then print it out:
      int result=number(5,10);
        System.out.println(result);

        System.out.println(twoYearsalary(60000));


        long firstYearSalary=salary(500000);
        long secondYearSalary= (long) (firstYearSalary*1.1);
        System.out.println(secondYearSalary);
        System.out.println(firstYearSalary+secondYearSalary);

        System.out.println(isAdoult(20));
        System.out.println(isAdoult(15));

        System.out.println(biggerNumber((byte)10, (byte) 20));


        System.out.println(meterToCentemeter(3));
//store it as a variable and then call it :
        int length=meterToCentemeter( 5);
        System.out.println("length of the sheet is : "+length+" cm");
     //we can store the result and change the data type then call the method:
        double length1=meterToCentemeter( 6);
        System.out.println(length1);


        System.out.println(lastCharacter("akbar"));
        char lastChar=lastCharacter("emma");
        System.out.println(lastChar+","+lastChar);
//reverse a name
        System.out.println(reverseIt("akbar jan"));
// is  palindrome:
        System.out.println(isPalindorme("han nah"));

        System.out.println(isPalindorme("akbar jan den"));


        System.out.println(isPalindorme2("emma"));
        //method with array:
        int[] intArray=getArray1ToX(5);
        System.out.println(Arrays.toString(intArray));

        System.out.println(Arrays.toString(getArray1ToX(10)));
    //two D printer:
    int[][] twoD={{1,2,3},{5,10}};
        twoDPrinter(twoD);


    }

public static int giveMe5(){
        return 5;
}
public static String myName(){
        return "emma";
}
public static String yourName(String name){
        return name;
}
public static int number(int n1,int n2){
        //int sum=n1+n2;
       // return sum;
    return n1+n2;//same result as above
}

public static long twoYearsalary(long number){
        return number*2;
}
public static long salary(long number){
        return number;
}

public static boolean isAdoult(int age){
        if (age>18){
            return true;
        }
        else
            return false;
}

public static byte biggerNumber(byte num1,byte num2){
        if (num1>num2){
            return num1;
        }
       else
           return num2;
}

public static int meterToCentemeter(int num){
        return num*100;
}

public static char lastCharacter (String name){

        return name.charAt(name.length()-1);

}
public static String reverseIt (String name){
        String reverse="";
        name=name.replace(" ","");
    for (int i =name.length()-1; i>=0; i--) {
        reverse+=name.charAt(i);
    }
    return reverse;
}


    public static boolean isPalindorme (String name) {
        String reverse = "";
        name = name.replace(" ", "");
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }

        return name.equals(reverse);
    }
// call ont method in another method:
    public static boolean isPalindorme2 (String name) {

        String reverse=reverseIt(name);
        return name.equals(reverse);
    }

//create a method with array :

  public static int[] getArray1ToX(int x){
      int[] intArray=new int[x];
      for (int i = 0; i <intArray.length; i++) {
        intArray[i]+=i+1;
      }

        return intArray;
  }

  public static void twoDPrinter(int[][] twoD){

      for (int[] each:twoD){
          for (int eachnum:each) {
              System.out.print(eachnum+" ");
          }
          System.out.println();
      }


  }





}
