public class Day21forlooppractice {
    public static void main(String[] args) {
//task:print each character in the string:

        String name="my name is emma";

        for (int i = 0; i <name.length() ; i++) {
            System.out.println(name.charAt(i)+"->");//0,1,2,4,
            System.out.println(  name.substring(i,i+1)); //<<--we can use substring too,same result.
        }


//task:print a sentence by 2 character at a time:
        String sentence="i love java";
        for (int x = 0; x < sentence.length()-2; x+=2) {
            System.out.println(sentence.substring(x,x+2));//--->>01,23,45,67
        }

        for (int x = 0; x < sentence.length()-2; x+=1) {
            System.out.println(sentence.substring(x,x+2));//---->>01,12,23,34,45,56
        }
//task:get 3 character at a time"
        for (int x = 0; x < sentence.length()-3; x+=3) {
            System.out.println(sentence.substring(x,x+3));//  012,345,678
        }

        for (int x = 0; x < sentence.length()-3; x+=1) {
            System.out.println(sentence.substring(x,x+3));//  012,123,234,345,456
        }


// task: find the count of :a
        String myName="akbar anzar";
            int count=0;
        for (int y=0;y<myName.length();y++){
            String currentChar=myName.substring(y,y+1);
            if (currentChar.equalsIgnoreCase("a")){
                System.out.println("found a ");
                count++;
            }

        }

        System.out.println("count of a: "+count);

String  str="hello world";
for (int s=0;s<str.length();s++){        //   s<=str.length-1                >>get one character
    System.out.println(str.substring(s,s+1));
}
for ( int s=0;s<=str.length()-2; s++){    //   s<str.length-2   >>get 2 character
    System.out.println(str.substring(s,s+2));
}






    }
}
