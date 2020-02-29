import java.util.Arrays;

public class Day36wrapperclassreview {
    public static void main(String[] args) {


//    3 ways to creating an object:
        String str = "123";
        Integer i = new Integer(str);
        Integer i1 = Integer.valueOf(str);
        Integer i2 = 123;

        System.out.println(i2);


        // turn string into primitive type:

        int num = Integer.parseInt(str);

        System.out.println(num);

// task 1:
        System.out.println(checkIfStringHasNumber("akbar-B-15"));


//  task 2 :
        long[] mylongs = {6L, 100L, 500L, 15000L};
        swap(mylongs);
        // or assign the value directly:
        swap(new long[]{6L, 100L, 500L, 15000L});

//  task 3 :
        reverseIntArray(new int[]{10, 20, 30, 40, 50});
     //or
        int[] myNumArray={20,30,50,10};
        reverseIntArray(myNumArray);

    }

    /**
     * 1.write a static method to accept a String and return Boolean(Yes Uppercase) .
     *
     * @param str
     * @return it should return true if the String contains at least one number.
     */
    public static Boolean checkIfStringHasNumber(String str) {
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                return true;
            }

        }
        return false;
    }

    /**
     * 2.write a static void method to accept a long array.
     *
     * @param numbers It should swamp first value with last value of the array
     */
    public static void swap(long[] numbers) {

        long temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;
        System.out.println(Arrays.toString(numbers));

    }

    /**
     * write a static void method to reverse an int array
     *
     * @param numbers
     */


    public static void reverseIntArray(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(numbers));
    }




}