package Day63MapIntro;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {

        Map<String,Integer> nameAndAge=new HashMap<>();
        nameAndAge.put("zehra",28);
        nameAndAge.put("hassan",35);
        nameAndAge.put("emma",35);
        System.out.println(nameAndAge);

        System.out.println(nameAndAge.size());

        System.out.println(nameAndAge.containsKey("zehra"));

        System.out.println(nameAndAge.get("hassan"));

nameAndAge.put("zehra",15);
        System.out.println(nameAndAge.get("zehra"));
        System.out.println(nameAndAge);
        System.out.println(nameAndAge.containsKey("dilida"));


nameAndAge.putIfAbsent("dildar",8);

        System.out.println(nameAndAge);

nameAndAge.putIfAbsent("hassan",45);

        System.out.println(nameAndAge);

       nameAndAge.replace("hassan",45);
        System.out.println(nameAndAge);

       nameAndAge.put("hassan",50);

        System.out.println(nameAndAge.get("hassan"));
        nameAndAge.replace("hassan",80,30);

        System.out.println(nameAndAge.get("hassan"));


        nameAndAge.remove("emma");
        System.out.println(nameAndAge);
        System.out.println(nameAndAge.get("emma"));
        System.out.println(nameAndAge.containsKey("emma"));


        Map<String,Double> itemAndPrice=new HashMap<>();
        itemAndPrice.put("apple",1.99);
        itemAndPrice.put("orange",3.99);
        itemAndPrice.put("banana",0.99);
        itemAndPrice.putIfAbsent("carrot",0.59);
        itemAndPrice.put("apple",2.99);

        System.out.println(itemAndPrice);

        System.out.println( itemAndPrice.get("apple")*2);
        itemAndPrice.remove("orange");
        System.out.println(itemAndPrice);

itemAndPrice.replace("banana",itemAndPrice.get("banana")+1);
        System.out.println(itemAndPrice.get("banana"));

        if (itemAndPrice.containsKey("banana")){
            itemAndPrice.remove("banana");
            System.out.println("no more banana");
        }
        System.out.println(itemAndPrice);










    }
}
