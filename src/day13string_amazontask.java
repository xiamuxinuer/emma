public class day13string_amazontask {
    public static void main(String[] args) {

      String memberType="regularMember";
      double amount=15.99d;
        int shippingFee=0;

         if (amount>25||memberType.equalsIgnoreCase("primeMember")){
            System.out.println(shippingFee);
        }
       else if (amount>25&&memberType.equalsIgnoreCase("primeMember")){
            System.out.println("not primeMember but you get free shipping on amount $ "+amount);
        }
       else {
            System.out.println("your shipping fee is :"+ (shippingFee+5));
        }



//     nested "if " statement

        boolean youWantToshope=true;
       String preference="online";
       if (youWantToshope==true) {

           if (preference.equals("store")) {
               System.out.println("go to store shopping");
           } else {
               System.out.println("go online shopping");
           }
       }
else {
           System.out.println("stay home and coding!");
       }













    }
}
