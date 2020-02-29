public class Day35wrapperpractice {
    public static void main(String[] args) {

     String str="3.14";
     float f=Float.parseFloat(str);
        System.out.println(f);

    double d=Double.parseDouble(str);
        System.out.println(d);


        //task:
     String groceries="i bought 3 tomatos and price was 3.14 each.";
     String[] parts=groceries.split(" ");
    String count=parts[2];
    int count0=Integer.parseInt(count);

    String eachprice=parts[parts.length-2];
    double eachprice0=Double.parseDouble(eachprice);

      double  price=count0*eachprice0;

        System.out.println(price);



//character practice :
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));
        System.out.println(Character.isLetter('s'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('B'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('b'));


        String n="A34B123c4x";
        String strn="";

        for (int i = 0; i < n.length(); i++) {

            if (Character.isDigit(n.charAt(i))){
                System.out.println(n.charAt(i)+" ");
                strn+=n.charAt(i);

            }
        }

        System.out.println(strn);
          Integer num=Integer.parseInt(strn);

        System.out.println(num);

       //task :
       String codenum="A34B123C4X";
       int sum=0;
     char[] allchars=codenum.toCharArray();
     for (char eachChar:allchars){
         if (Character.isDigit(eachChar)){
             System.out.println(eachChar);
             sum+=Integer.parseInt(eachChar+"");

         }
     }
        System.out.println(sum);













    }
}
