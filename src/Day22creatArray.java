public class Day22creatArray {
    public static void main(String[] args) {

//assign the value directly:
     int[] age=new int[]{1,3,5,7};
        for (int i = 0; i <age.length; i++) {
            System.out.println(age[i]);
        }
// or do this way ,same result(most easy way to assign value)
     int[] number={1,3,5,7};
        for (int x = 0; x <number.length; x++) {

            System.out.println(number[x]);
        }
        System.out.println("---------------------------");
//create an int array of 7 elements and ,print it reverse order,
// find out:
//average of the array
//sum of all elements
// max number in the array
//min number in the array
//sum of even numbers in the array
//sum of odd numbers in the array
//double the value of each items

int[] score={20,25,30,35,40,45,50};
  int sumOfscore=0;
        for (int s = score.length-1; s >=0; s--) {
            System.out.print(score[s]+",");//print reverse order
            System.out.print(score[s]*2+",");// double the each item value
            System.out.println();
            sumOfscore+=score[s];
        }

        int lastNumIndex=score.length-1;
        System.out.println(score[lastNumIndex]);// last items in array
        int middleItemIndex=score.length/2;
        System.out.println(score[middleItemIndex]);// middle item in array
        System.out.println(sumOfscore);        // sum of all the items in array
        System.out.println(sumOfscore/score.length);// average of all the items in array
        System.out.println("---------------------------");


          int sumOfEven=0;
          int sumOfEOdd=0;
        for (int z = 0; z <score.length ; z++) {
            ;if (score[z]%2==0){

                sumOfEven+=score[z];
            }

            else if (score[z]%2==1){

                sumOfEOdd+=score[z];
            }
        }
        System.out.println();
        System.out.println(sumOfEven);
        System.out.println(sumOfEOdd);


        // max number in the array
       //min number in the array
        int max=score[0];
for (int item:score){
    if (item>max)
        max=item;
}
        System.out.println(max);

int min=score[0];
for (int item:score){
    if (item<min)
    min=item;
}
        System.out.println(min);




    }
}
