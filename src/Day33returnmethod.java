import java.util.Arrays;

public class Day33returnmethod {
    public static void main(String[] args) {

        System.out.println(dayCodeDayName(10));
        System.out.println(dayCodeDayName(5));

        System.out.println(ageCheker(1983));

        System.out.println(spellName("emma"));

//or
        String name="dida";
        System.out.println(spellName(name));
    }


    public static String dayCodeDayName(int dayCode) {
        String dayName;
        switch (dayCode) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default: {
                dayName = "invalid day code.";
            }
        }


        return dayName;
    }




    public static int ageCheker(int birthYear){

       if (birthYear<=1900||birthYear>=2020){
           return 0;
       }

       return  2020-birthYear;//use return key word to get out of method,
        // the moment the return line get executed,code stop running.terminate your method.
    }

public  static String spellName(String name){
        String spellName="";
    for (int i = 0; i < name.length(); i++) {
        spellName+=name.charAt(i);
        if (i!=name.length()-1){
           spellName+="-";
        }
    }

    return spellName;
}







}