package Day60CollectionFramework;

import java.lang.reflect.Array;
import java.util.*;

public class ListInterface {
    public static void main(String[] args) {


List<String> list=new ArrayList<>();
Collection<String> c=new ArrayList<>();
  c.add("emma");
  c.add("hassan");
  c.addAll(c);
  System.out.println(c);
  System.out.println(c.size());


c.removeAll(Arrays.asList("hassan"));
        System.out.println(c);

c.removeAll(c);
        System.out.println(c);


List<Integer> num=new ArrayList<>(Arrays.asList(1,2,5,8,10,15));
num.addAll(Arrays.asList(1,2,3,5,7,10));
        System.out.println(num);

        Collections.sort(num);

        System.out.println(num);





    }
}
