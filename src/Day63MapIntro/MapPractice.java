package Day63MapIntro;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);



        System.out.println(groceryPriceMap);



     Set<String> allNames=groceryPriceMap.keySet();
        System.out.println(allNames);

       //allNames.remove("Tomato");
        //System.out.println(allNames);

for (String eachName:allNames){
    System.out.print(eachName +": ");
    System.out.println(groceryPriceMap.get(eachName));
}

        Set<String> nameCopy=new HashSet<>(allNames);

        System.out.println(nameCopy);

        nameCopy.remove("Tomato");
        System.out.println(nameCopy);
        System.out.println(allNames);
        System.out.println(groceryPriceMap);


        Collection<Double> allPrice = groceryPriceMap.values();

        System.out.println(allPrice);
        allPrice.remove(3.99);
        System.out.println(groceryPriceMap);


        allPrice.removeIf(eachprice->eachprice>3);
        System.out.println(allPrice);
        System.out.println(groceryPriceMap);



//loop through the Map:
        Set<Map.Entry<String, Double>> entryView = groceryPriceMap.entrySet();

        System.out.println(entryView);


for (Map.Entry<String, Double> each:entryView){
   // System.out.println(each);
    //System.out.println(each.getKey());
    //System.out.println(each.getValue());
    if (each.getKey().length()>5){
        each.setValue(5.0);
    }
    System.out.println(each);
}









    }
}
