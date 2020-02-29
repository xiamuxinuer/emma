package compareinterface;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class personobject {
    public static void main(String[] args) {


        Person p1 = new Person("emma", 35);
        Person p2 = new Person("akbar", 37);
        Person p3 = new Person("dilida", 8);

        System.out.println(p1.compareTo(p3));





        List<Person> list = Arrays.asList(p1, p2, p3);

        System.out.println(list);
        Collections.reverse(list);//  just back to front  order.no sorting just reversing .
        System.out.println(list);

        Collections.sort(list);// small to large natural order sorting out by age.
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);





    }
}