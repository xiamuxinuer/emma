import java.util.Arrays;

public class Day25arraymethod {
    public static void main(String[] args) {
//1. string to charAt method:
       String name ="emma";
       char[] nameChar=new char[name.length()];

//        nameChar[0]=name.charAt(0);
//        nameChar[1]=name.charAt(1);
//        nameChar[2]=name.charAt(2);
//        nameChar[3]=name.charAt(3);

        for (int i = 0; i <name.length() ; i++) {
            nameChar[i]=name.charAt(i);
            System.out.println(nameChar[i]);
        }

        System.out.println(Arrays.toString(nameChar));

//  simple way to do it;

        char[] nameChar2=name.toCharArray();
        System.out.println(Arrays.toString(nameChar2));
        Arrays.sort(nameChar2);
        System.out.println(Arrays.toString(nameChar2));// after sort it
// or:
        System.out.println(Arrays.toString(name.toCharArray()));// dint sort the original string
 // for each loop :another way to do it
        for (char item:nameChar2){
     System.out.println(item);    // give me sorted result.
 }




    int countOFM=0;
        for (char item:nameChar2){
            if (item=='m'){
                countOFM++;
            }
        }
        System.out.println("count of m :"+countOFM);


 //2.sting split method:what ever we use to split a string ,it will be gone, not appear in result.
       String sentence="i love java";
       String[] allWords=sentence.split(" ");//split by space.

        System.out.println(Arrays.toString(allWords));
        System.out.println(allWords.length); // give you how many word we have in array.or how many pieces we have after split.

        System.out.println(sentence.length());// give you how many character we have in string.

        System.out.println(allWords[allWords.length-1]);//  give you last word in array.

        System.out.println(allWords[0]);// give you first word in array.
        System.out.println(allWords[allWords.length/2]);// middle word in array,(only if we have odd number of words in array.
// in loop:
        for (String item:allWords){
            System.out.println(item);
        }



        //task:find longest word
        String sen="we are going to have a vacation";
        String[] words=sen.split(" ");
        System.out.println(Arrays.toString(words));
         String longestWord=words[0];

       for (String item:words){
           if (item.length()>longestWord.length()){
               longestWord=item;
           }
       }
        System.out.println("longest word in sentence is :"+ longestWord);








    }
}
