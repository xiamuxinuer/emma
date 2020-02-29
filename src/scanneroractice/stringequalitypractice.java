package scanneroractice;

import java.util.Scanner;

public class stringequalitypractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String season=input.next();
        if (season.equalsIgnoreCase("summer")){ //will ignore uppercase or lowercase.only use in--"String"
            System.out.println("fishing");
        }
        else if (season.equals("spring")){    // will not ignore uppercase or lowercase.
            System.out.println("hiking");
        }
        else if (season.equals("fall")){
            System.out.println("camping");
        }
        else {
            System.out.println("coding");
        }











    }
    }


