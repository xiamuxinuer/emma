import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Day29arrayreview {
    public static void main(String[] args) {
//fill up this array with number from 1 to 100:

    int[] num=new int[100];
        for (int i = 0; i <num.length; i++) {
           num[i]=i+1;
        }

        System.out.println(Arrays.toString(num));

//print even numbers:
        int[] num1=new int[100];
        for (int x = 0; x <num1.length; x++) {
            num1[x]=x*2;
        }

        System.out.println(Arrays.toString(num1));

//print odd numbers:
        int[] num2= new int[100];
        for (int j = 0; j <num2.length; j++) {
            num2[j]=j*2+1;
        }
        System.out.println(Arrays.toString(num2));

        // print i love java 5 times:

        String[] str=new String[5];
        for (int k = 0; k <str.length; k++) {
            str[k]="i lave java";

        }
        System.out.println(Arrays.toString(str));



// task:
String hero="superman-Clark Kent";
String[] allWord=hero.split("-");
        System.out.println(Arrays.toString(allWord));//[superman, Clark Kent]

        String heroCode=allWord[0];
        String fullName=allWord[1];
        System.out.println("hero code is "+  heroCode);
        System.out.println("full name of the hero is "+fullName);
        //System.out.println("hero initial is : "+fullName.charAt(0)+""+ fullName.charAt(fullName.indexOf(" ")+1));
//replace full name with star:
        String star="";
        for (int j = 0; j <fullName.length(); j++) {
            star+="*";
        }
        System.out.println(fullName);
        System.out.println(star);

        System.out.println(hero);
        System.out.println(hero.replace(fullName,star));



        //get the hero initial:
String[] splitFullName=fullName.split(" ");
        System.out.println(Arrays.toString(splitFullName));

        String firstName=splitFullName[0];
        String lastName=splitFullName[splitFullName.length-1];//splitfullname[1]
        System.out.println(" hero initial is:"+ firstName.charAt(0)+lastName.charAt(0));

// task:
       String[] allHeros= {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for(String eachHero:allHeros){
            System.out.println(eachHero);
        }


    }
}
