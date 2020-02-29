public class day9switchstetment {
    public static void main(String[] args) {

     int dayCode=5;
     switch (dayCode){                 //checking exact equality or value(another way to do if else statement))
         case 1:
             System.out.println("monday");
             break;  //used to get out of this branch.
         case 2:
             System.out.println("tuesday");
             break;
         case 3:
             System.out.println("wednesday");
             break;
         default:
             System.out.println("unknown day");    //optional
     }

        String greeting="";
        int languageType=3;
      switch (languageType){
          case 1:
              greeting="hello";
              break;
          case 2:
              greeting="marhaba";
              break;
          case 3:
              greeting="bonjour";
              break;
          default:
              greeting="unknown";
      }
       greeting=greeting+"!"+"SDET";
        System.out.println(greeting);


   char   letter='b';

   double price;
   switch (letter){
       case 'a' :price=0.55;
       break;
       case 'b': price=0.98;
       break;
       case 'c':   price=5;
       break;
       default:   price=0;
   }
        System.out.println(price);




    }
}
