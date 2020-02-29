package Day63MapIntro;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Frequencyofcharacter {
    public static void main(String[] args) {


        String str = "AAAABBBCCDDDDDDDEFF";


        //get the frequency ,and store it into map.


        Map<Character, Integer> charFre = new HashMap<>();

        for (int x = 0; x < str.length(); x++) {

            char currentChar = str.charAt(x);
            if (!charFre.containsKey(currentChar)) {
                System.out.println("enter for the first time " + currentChar);
                charFre.put(currentChar, 1);
            } else charFre.replace(currentChar, charFre.get(currentChar) + 1);
        }


        System.out.println(charFre);








    }
}







//// TRY TO GET A charFrequencyMap
//// your map should store character and it's frequency
////  AAABBCDDDD  -->> {'A'=3 , 'B'=2 , 'C'=1 ,'D'=4 ,  }