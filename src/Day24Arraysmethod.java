import javax.swing.*;
import java.util.Arrays;

public class Day24Arraysmethod {
    public static void main(String[] args) {
// Arrays method
        //1. Arrays.to String();
        String[] movie = {"Wonder Women", "Die Heart", "Batman", "Superhero", "Flash", "Aquaman"};
        System.out.println(Arrays.toString(movie));// get all the item in array.

        System.out.println(Arrays.toString(movie).charAt(0));//get first single character in array.
        Arrays.sort(movie);
        System.out.println(Arrays.toString(movie));

        int[] numbers = {10, 44, 55, 3, 78};
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {   //got evey single item in the array:10,44,55,78

            System.out.print(numbers[i] + ",");
        }
        System.out.println("");
        System.out.println("----------");

        for (int i = 0; i < Arrays.toString(numbers).length(); i++) {
            System.out.println(Arrays.toString(numbers).charAt(i));    //got evey single character  in array
        }

        //    get first item value:
        System.out.println(numbers[0]);// get first item.

//2.Arrays.sort
        int[] score = {99, 81, 95, 70, 45, 75, 88, 55, 20, 65};
        System.out.println(score[0]);
        System.out.println(Arrays.toString(score));
        Arrays.sort(score);            //original order is gone,can't get it back,index has changed.
        System.out.println(Arrays.toString(score));
//get first item value:
        System.out.println(score[0]);


        char[] nameChar = {'a', 'k', 'b', '7', 'r'};
        System.out.println(Arrays.toString(nameChar));
        Arrays.sort(nameChar);
        System.out.println(Arrays.toString(nameChar));


//3.Arrays equality:
        int[] age1 = {0, 19, 6, 15, 10, 13, 1};
        int[] age2 = {22, 45, 18, 46, 70, 9, 12};
        int[] age3 = {2, 34, 56, 7, 32};
        System.out.println(Arrays.equals(age1, age2));
        System.out.println(Arrays.equals(age1, age3));


//4. copy an Array:
        int[] num = {13, 30, 81, 2,};
        int numSize = num.length;
        int[] numCopy = new int[numSize];

//        numCopy[0]=num[0];
//        numCopy[1]=num[1];
//        numCopy[2]=num[2];
//        numCopy[3]=num[3];
        for (int n = 0; n < numSize; n++) {
            numCopy[n] = num[n];
        }
        System.out.println(Arrays.toString(numCopy));
        Arrays.sort(numCopy);
        System.out.println(Arrays.toString(numCopy));

        System.out.println(Arrays.equals(num, numCopy));// we got result: "false" ,because we sorted the numCopy .
//5.check if an Array is already sorted or not:
       // boolean issorted=true;
        for (int n = 0; n < numSize - 1; n++) {
            if (!(num[n] < num[n + 1])) {
                System.out.println(" not sorted");
               //issorted=false;
                break;
            }
        }
        //system.out.println(issorted);   // false -->> because it is not sorted.

//6.String to  charArray:
        String name ="emma";
        char[] nameChar2=name.toCharArray();
        System.out.println(Arrays.toString(nameChar2));
// or:
        System.out.println(Arrays.toString(name.toCharArray()));
        // use for each loop:
        for (char item:nameChar2){
            System.out.println(item);
        }

//7. sting split method:what ever we use to split a string ,it will be gone, not appear in result.
       String sentence="i love java";
       String[] allWords=sentence.split(" ");//split by space.

        System.out.println(Arrays.toString(allWords));
        System.out.println(allWords.length); // give you how many word we have in array.or how many pieces we have after split.

//8.swap:swap value in array

        int[] num0={5,10,15,20,25};

        System.out.println(Arrays.toString(num0));

        for (int i = 0; i <num0.length/2; i++) {
            System.out.println(num0[i]+"---"+num0[(num0.length-1)-i]);
            int temp=num0[i];
            num0[i]=num0[(num0.length-1)-i];
            num0[(num0.length-1)-i]=temp;
        }

        System.out.println("after complete swap:"+Arrays.toString(num0));






    }
    }