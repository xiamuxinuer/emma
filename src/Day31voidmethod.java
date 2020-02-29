public class Day31voidmethod {



    public static void main(String[] args) {


        System.out.println("begin");

     sayhello();
        //can call static method using:( class name .method name();)
        Day31voidmethod.sayhello();

        System.out.println("------------------");

        saymyname();
        Day31voidmethod.saymyname();
        printoddnumber();

        System.out.println("the end");

    }


//inside in the class but outside of other method.

    public static void sayhello(){
            System.out.println("hello world");
        System.out.println("my name is emma");
        System.out.println(" i love java");



        }

       public static void saymyname()   {
           System.out.println("emma");
       }

       public static void printoddnumber(){
           for (int i = 0; i <=100; i++) {
               if (i%2==1){
                   System.out.print(i+" ");
               }
           }
           System.out.println();
       }












    }



