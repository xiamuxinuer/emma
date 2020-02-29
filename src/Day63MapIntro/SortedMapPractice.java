package Day63MapIntro;

import java.util.*;

public class SortedMapPractice {
    public static void main(String[] args) {

        SortedMap<String, Double> groceryPriceMap = new TreeMap<>();

        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);

        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);


        System.out.println(groceryPriceMap);













    }
}
