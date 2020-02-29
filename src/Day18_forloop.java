public class Day18_forloop {
    public static void main(String[] args) {


        for (int x=1;x<=5; x++){
            System.out.println("hello: "+x);
        }

        System.out.println("--------------------");

        for (int y=10;y>0; y--){
            System.out.println("hola: "+y);
        }

//task: even number(skip counting by 2)
        for (int n=0; n<=20;n+=2){
            System.out.println(n+" is even number." );
        }
        System.out.println("--------------------");
        //short cut for for loop : fori-enter

        for (int i = 0; i <=20 ; i++) {
            if (i%2==0){
                System.out.println(i+"  is even number.");
            }
            if (i%2==1){
                System.out.println(i + " is  odd number.");
            }
        }
//task:stimulate slow increase of speed.starting point 0,end 60.
        for (int s = 10,e = 30; s <=e ; s++) {
            System.out.println(s+" too slow ,speed up.");
        }
//
      String str="";         //empty value
//
        for (int z = 1; z <=4 ; z++) {
            str+="*";
            System.out.println(str+" "+z);
        }










    }
}
