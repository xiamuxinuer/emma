public class Day22loopreview {
    public static void main(String[] args) {
//https://learn.cybertekschool.com/courses/278/modules#3317
//this will lead you to day 21
//https://learn.cybertekschool.com/courses/278/modules#3318
//this will lead you to day 22
//https://learn.cybertekschool.com/courses/278/modules#3319
//this will lead you to day 23
//https://learn.cybertekschool.com/courses/278/modules#3320
//this will lead you to day 24
//and so on

       String link="https://learn.cybertekschool.com/courses/278/modules";
        int moduleNumber = 3296;
        String dayMsg="this will lead you to day";
        for (int day =1; day <=22; day++) {
            System.out.println(dayMsg +" "+day);
            System.out.println(link+(moduleNumber+ day));
        }

//task: multiplication table:
        for (int timesTable = 1; timesTable <=5; timesTable++) {
            System.out.println("multiplication table of :"+timesTable);

            for (int base=1;base<=5;base++){
                System.out.println(timesTable+"x"+base+"="+timesTable*base);
            }

        }

        //task:repeat string 10 times

String msg="ilovejava";
        //print every letter
        for (int i = 0; i <msg.length() ; i++) {
            System.out.println(msg.charAt(i));
        }
        System.out.println("---------------");
        //skip a letter ,print every other letter
        for (int x = 0; x < msg.length(); x++) {
         if (x%2==0){
             continue;
         }
            System.out.println(msg.charAt(x));
        }
        System.out.println("----------------------");
         // when reach letter "a",break the loop.
        for (int y = 0; y <msg.length() ; y++) {

            if (msg.charAt(y)=='a'){
                break;

            }
            System.out.println(msg.charAt(y));
        }


    }
}

