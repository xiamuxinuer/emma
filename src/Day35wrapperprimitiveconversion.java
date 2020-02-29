import java.util.Arrays;

public class Day35wrapperprimitiveconversion {
    public static void main(String[] args) {

       Integer a1=new Integer((12));
       Integer a2=12;

       int a3=a2;
        System.out.println(a3);

        Integer num1=100;
        int num0=Integer.valueOf(num1);
        int num00=Integer.parseInt("100");
        System.out.println(num0);
        System.out.println(num00);

        int num2=Integer.valueOf(200);

       int num3=Integer.parseInt("200");


     // task:
     String pTabNum="IPR2012-0001";
    // String strYear=pTabNum.substring(3,7);

     //   int year=Integer.parseInt(strYear);
        // do it in one shot :
       int year=Integer.parseInt(pTabNum.substring(3,7));
        System.out.println(year);

        //get  year task :
        System.out.println(getYear("abc2019-0001"));
    }

    public  static int getYear(String caseNUmber){

        String strYear=caseNUmber.substring(3,caseNUmber.indexOf("-"));

        int year=Integer.parseInt(strYear);

        return year;
    }






}
