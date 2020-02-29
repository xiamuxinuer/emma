public class Day35Wrapperclass {
    public static void main(String[] args) {

        String strnum="100";
        int num=Integer.parseInt(strnum);
        System.out.println(num);

        String empID="FB-457";


        String[] emoIDsplit=empID.split("-");   //get a string array
//        String idStr=emoIDsplit[1];
//            int id=Integer.parseInt(idStr);
//        System.out.println(id);
//
        // one step doing it :
        int id=Integer.parseInt(empID.split("-")[1]);   //  get----->>457
        System.out.println(id);


      //task:
      String num1="600";
      String num2="200";
      int num1Str=Integer.parseInt(num1);
      int num2Str=Integer.parseInt(num2);
        System.out.println(num1Str+num2Str);


Boolean b1=Boolean.valueOf(true);
Boolean b2=Boolean.valueOf("true");
        System.out.println(b1);
        System.out.println(b2);


      int x=10;
      Integer integerX=Integer.valueOf(x);

        byte bValue = integerX.byteValue();
        System.out.println(integerX);

        double dValue = integerX.doubleValue();
        System.out.println(dValue);





    }

}
