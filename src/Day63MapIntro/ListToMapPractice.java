package Day63MapIntro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapPractice {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList( " Lantern",
                "Flash", "Superman", "Batman", "Aquaman", "Martian");

        Map<String,Integer> nameCharCountPair=new HashMap<>();
        for (String eachName:nameList){
            nameCharCountPair.put(eachName,eachName.length());
        }

        System.out.println(nameCharCountPair);











    }
}
