public class Day23foreachloop {

    public static void main(String[] args) {


     double[] price={ 99.23, 11.99, 100.25, 95.99, 56.34};
        for (int i = 0; i <price.length; i++) {
            System.out.println(price[i]);
        }


        System.out.println("--------------------");
        //for each loop:can only be used for Array,there is no infinite loop ever.same result as above
      for ( double item:price   ){
          System.out.println(item);
      }

    //for each loop practice:

String[] name={"emma", "akbar","dildar","queen"};
      for (String item:name){
          System.out.println(item);
      }

long[] salary={30000,45000,60000,80000};
      int sum=0;
      for (long item:salary){
          System.out.println(item);


          sum+=item;
      }
        System.out.println(sum);

for (long item:salary){
   if (item>50000){
       System.out.println(item);
   }
}
        System.out.println("-------------------------");
// find max :

long max=salary[0];
for (long item:salary){

    if (item>max){
        max=item;
    }
}
        System.out.println(max);


        System.out.println("-----------------------");
// find min:

    long min=salary[3];

        for (long item:salary){

            if (item<min){
                min=item;
            }
        }
        System.out.println(min);
        System.out.println("----------------------------------------");

//     task:double the each items value

int[] age={20,15};
        for (int a = 0; a <age.length ; a++) {
            System.out.println(age[a]*2);
        }

for (int item:age){
    System.out.println(item*2);
}







    }
}
