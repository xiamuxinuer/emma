package Day60CollectionFramework;

import java.util.*;

public class linekedlist {
    public static void main(String[] args) {

        List <String>  list1=new ArrayList<>();

        List<String>   list2=new LinkedList<>();
        list2.addAll(Arrays.asList("emma","zaynep","akbar"));

        System.out.println(list2);

list2.add(1,"dildar");

list2.remove("zaynep");

        System.out.println(list2);

        Collections.sort(list2);

        System.out.println(list2);

        System.out.println(list2.get(2));


    }
}
