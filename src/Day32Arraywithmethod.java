import java.util.Arrays;

public class Day32Arraywithmethod {
    public static void main(String[] args) {

      // save it as variable then call it:
        int[] num={1,2,3,4};
        arrayPrinter(num);

        //or we can call it directly:
       arrayPrinter(new int[]{1,2,3,4});
       findMax(new int[] {5,10,15,20,25});


       String[] arr1={"akbar","dida"};
       String[] arr2={"emma"};
       compareArray(arr1,arr2);




    }

    public static void arrayPrinter(int[] num){
        System.out.println(Arrays.toString(num));

        for (int i = 0; i <num.length; i++) {
            System.out.print(num[i]+"-");
        }
        System.out.println();
    }

public static void findMax(int[] numbers){
        int max=numbers[0];
        int min=numbers[0];
        int sum=0;
    for (int i = 0; i <numbers.length; i++) {
        sum+=numbers[i];
        if (numbers[i]>max){
            max=numbers[i];
        }
        if (numbers[i]<min){
            min=numbers[i];
        }
    }
    System.out.println("sum = " + sum);
    System.out.println("max = " + max);
    System.out.println("min = " + min);
}

public static void compareArray(String[] arr1,String[] arr2){
        if (arr1.length>arr2.length){
            System.out.println("arr1 has more item");
        }
        else if (arr2.length>arr2.length){
            System.out.println("arr2 has more item");
        }
        else {
            System.out.println("has same item");
        }
}











}
