import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day37arraylisttasks {
    public static void main(String[] args) {
// easy way to create an array list in one shot :
        List<Integer> myList= Arrays.asList(10,15,50,15,100);
        System.out.println(myList);
        List<String> nameList=Arrays.asList("guzalnur","alimjan","mahmut");
        System.out.println(nameList);
        System.out.println("---------------------");
        List<String> teamMates=new ArrayList<>();
        teamMates.add("akbar");
        teamMates.add("emma");
        teamMates.add("dilidar");
        teamMates.add("snow");
        teamMates.add("queen");
        System.out.println(teamMates);
        System.out.println(teamMates.toString().replace(",","-"));

        //print one by one:
        for (String eachName:teamMates){
            System.out.println(eachName);
        }

       //print reverse:

        for (int i =teamMates.size()-1; i>=0; i--) {
            System.out.println(teamMates.get(i));
        }


        //print first and  last name on the list :
        System.out.println(teamMates.get(0));
        System.out.println(teamMates.get(teamMates.size()-1));

       //print 2 at a time:0,1  1,2   2,3  3,4
        for (int i = 0; i <teamMates.size()-1; i++) {
            System.out.println(teamMates.get(i)+","+ teamMates.get(i+1));
        }
        //print each 2 at a time:0,1   2,3   4,5

        for (int i = 0; i <teamMates.size()-1; i+=2) {
            System.out.println(teamMates.get(i)+","+ teamMates.get(i+1));
        }


         //concat everyone in one string separated by -

        for (int i = 0; i <teamMates.size(); i++) {

            if (i==teamMates.size()-1){
                System.out.print(teamMates.get(i));
            }
          else {
                System.out.print(teamMates.get(i)+"-");//akbar-emma-dilidar-snow-queen
            }

        }
        System.out.println();
       // find longest name in List of String
        String longestName=teamMates.get(0);
        for (String eachName:teamMates) {
            if (eachName.length() > longestName.length() ){
               longestName=eachName;
            }

        }

        System.out.println("Longest name on the list is : "+longestName);


        //Given a ArrayList of 6 Integer 1,3,7,2,12,7

        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(12);
        numbers.add(7);

//insert 100 in between each numbers

for (int i=0; i<numbers.size();i++){
    if (!(i==numbers.size()-1)){
        System.out.print(numbers.get(i)+", 100, ");
    }
    else {
        System.out.println(numbers.get(i));
    }
}
//or:
        for (int i = 1; i <numbers.size(); i+=2) {
            numbers.add(i,100);

        }
        System.out.println("numbers list after insert 100 between each numbers: "+numbers);


List<String> names=new ArrayList<>();
names.add("A");
names.add("OB");
names.add("Aby");
names.add("emma");
names.add("akbar");
names.add("dilidaraaaa");
        System.out.println(names);
        //Remove any name with less than 2 characters
        for (int i = 0; i <names.size(); i++) {
            if (names.get(i).length()<2){
                names.remove(names.get(i));
            }
        }
        System.out.println(names);
        // if any name has more than 10 character only keep 10 characters
        for (int i = 0; i <names.size(); i++) {
            if (names.get(i).length()>10){
                System.out.println(names.get(i).substring(0,10));
            }
        }

// if it has exactly 5 characters , reverse it
        for (int i = 0; i <names.size(); i++) {
            if (names.get(i).length()==5){
                for (int j =names.get(i).length()-1; j >=0; j--) {
                    System.out.println(names.get(i).charAt(j));
                }
            }
        }


//Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"..

List<String> scores=new ArrayList<>();
        scores.add("79");
        scores.add("54");
        scores.add("100");
        scores.add("65");
        scores.add("44");
        scores.add("95");
        scores.add("80");
        scores.add("91");
//* print pass if its more than 60 , fail if not
for (String eachScore:scores){
    if (Integer.parseInt(eachScore)>60){
        System.out.println(eachScore+"--"+"pass");
    }
    else {
        System.out.println(eachScore+"--"+"fail");
    }
}

//* count how many score are more than 90
int count=0;
for (String eachScore:scores){
    if (Integer.parseInt(eachScore)>90){
        count++;
    }
}
        System.out.println("count of score more than 90 : " + count);


//* get the average score
int sum=0;
        for (int i = 0; i <scores.size(); i++) {
            sum+=Integer.parseInt(scores.get(i));
        }
        System.out.println("sum of the all score is :" + sum);
        System.out.println("average of the all score is :"+ sum/(scores.size()));


//* update the values with score-grade pair
//  for example
//79C , 54F, 100A, 65D, 44F , 89B , 95A

for (String eachScore:scores){
    if (Integer.parseInt(eachScore)>=90){
        System.out.print(eachScore+"A");
    }
    else if (Integer.parseInt(eachScore)>=80){
        System.out.print(eachScore+"B , ");
    }
    else if (Integer.parseInt(eachScore)>=70){
        System.out.print(eachScore+"C , ");
    }
   else if (Integer.parseInt(eachScore)>=60){
        System.out.print(eachScore+"D , ");
    }
    else {
        System.out.print(eachScore+"F , ");

    }
}
        System.out.println();



    //call the method :
        System.out.println(nameCharsToList("emma"));

//or:
        List<Character> result=nameCharsToList("akbar");
        System.out.println(result);
      result.add('h');     // only can add character
        result.add('9');   // 9 as character in single quotation
        System.out.println(result);


        List<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);


        number(num);
    }

    public static List<Character> nameCharsToList(String name){
       List<Character> charList=new ArrayList<>();
        for (int i = 0; i <name.length(); i++) {
            charList.add(name.charAt(i));
        }

        return charList;

    }

//Write a static void method to accept a List<Integer> and reverse it

    public static void number(List<Integer> num){

        for (int i = num.size()-1; i>=0; i--) {
            System.out.println(num.get(i));
        }
    }






}





