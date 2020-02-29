import java.util.Arrays;

public class Day26ArrayReveiw {
    public static void main(String[] args) {
//Array method review :
        //swap value in array:
int[] num={10,5,20,15,30,25};
        System.out.println(Arrays.toString(num));


        System.out.println(num[0]);//first item

        System.out.println(num[num.length-1]);//last item


        for (int i = 0; i <num.length/2; i++) {
            System.out.println(num[i]+"-switch to --"+num[(num.length-1)-i]);
            int temp=num[i];
            num[i]=num[(num.length-1)-i];
            num[(num.length-1)-i]=temp;
        }

        System.out.println("after complete swap:"+Arrays.toString(num));


//String  to char array:only for string
//use for each loop
    String survey="complete online 1 month survey"   ;
    char[] sruveyChar=survey.toCharArray();
    for (char item:sruveyChar){
            System.out.println(item);
        }
//sort it to low to high order an array;

Arrays.sort(sruveyChar);
        System.out.println(Arrays.toString(sruveyChar));

// task 1: write a program to check if  all the element in an int array more that 100
int[] score={20,101,76,168,89,100,105};

        for (int item:score){
            if (item<=100){
                System.out.println("no");
                break;

            }
        }


//task 2 : given a String with multiple word. get an array of words then reverse the array
String sentence="i love java";

char[] sentenceChar=sentence .toCharArray();

        System.out.println(sentenceChar);//---->>>  i love java
        for (int i = sentenceChar.length-1; i >=0; i--) {
            System.out.println(sentenceChar[i]);

        }



  //task3: count of certain item in an array.
String[] movie={"iron man","wonder women","spider man ","hulk","die heart","iron man","wonder women"};
        System.out.println(Arrays.toString(movie));
        int sizeOfArray=movie.length;
        System.out.println(sizeOfArray);
String itemToSearch="iron man";
int countOFItem=0;
for (String item:movie){
    if (item.equals(itemToSearch)){
        countOFItem++;
    }
}
        System.out.println(countOFItem);

//task 4:
String  students="  robin,emma,rayna,akbar,muge   ";
             students=students.trim();

// get all name in string array:
        String[] allName=students.split(",");

// spell the name of each student.

        System.out.println(Arrays.toString(allName));//print it as a string .

        for (int i = 0; i <allName.length; i++) {
            System.out.println(allName[i]);//print out each name separately .
        }



   for (int i = 0; i < allName.length; i++) {

       for (int j = 0; j < allName[i].length(); j++)

           System.out.print(allName[i].charAt(j) + " -->> ");

       System.out.println();


   }








}
}
