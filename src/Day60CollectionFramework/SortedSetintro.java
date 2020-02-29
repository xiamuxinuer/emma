package Day60CollectionFramework;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetintro {
    public static void main(String[] args) {

        SortedSet<Integer> mySet=new TreeSet<>();
        mySet.addAll(Arrays.asList(100,72,15,20,50,55));

        System.out.println(mySet);

        System.out.println(mySet.first());
        System.out.println(mySet.last());


        System.out.println("------------------------");


        Job j1=new Job("DC",150000,"Amazon");
        Job j2=new Job("NY",120000,"Google");
        Job j3=new Job("FL",100000,"Facebook");
        Job j4=new Job("OK",80000,"paycom");

      SortedSet<Job> jobSet= new TreeSet(Arrays.asList(j1,j2,j3,j4));

        System.out.println(jobSet);


    }
}
