import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day37arraylistpractice {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("emma");
        names.add("akbar");
        names.add("dilida");
        names.add("queen");
        names.add("rehan");
        names.add("snow");
        System.out.println(names.toString());
  list(names);

  Byte((byte) 17);// cast int into byte
        List<String> name=new ArrayList<>();
        name.add("emma");
        name.add("akbar");
        name.add("dilida");
        name.add("queen");
        name.add("rehan");
        name.add("snow");
        System.out.println(longestName(name));

        System.out.println(printList(20));

//or save it as variable and then print it :
        List<Integer> myList=printList(5);
        System.out.println(myList);



    }

public static void list(List<String> names ) {
    for (String each : names) {
        System.out.println(each);
    }
}

    public static void Byte (byte b){
        System.out.println(b);

    }

    public  static String longestName(List<String> name){
        String longestName=name.get(0);
        for (String eachName:name){
            if (eachName.length()>longestName.length()){
                longestName=eachName;
            }
        }
         return longestName;

    }

public static List<Integer> printList(Integer finalNum){
List<Integer> numbers=new ArrayList<>();
    for (int i = 1; i <=finalNum; i++) {
        numbers.add(i);
    }
        return numbers;
    }















}
