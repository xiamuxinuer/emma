public class Day32voidemethodpractice {
    public static void main(String[] args) {

reverseName("akbar");
printName("dilida");
printaToz();
printZtoA();
characterPrint('d','a');
numberComparision(10,15);

repeatStr("java",3);
skipCount();
countDownEvennumfromXtoY(20,1);
count();




    }

    public  static void reverseName(String myName){

        for (int i = myName.length()-1; i>=0; i--) {
            System.out.print(myName.charAt(i)+" ");
        }
        System.out.println();
    }

public  static void printName(String name){

    for (int i = 0; i <name.length(); i++) {
        System.out.print(name.charAt(i));
        if (i!=name.length()-1){
            System.out.print("-");
        }
    }
    System.out.println();
}

public  static void printaToz() {
    for (char i = 'a'; i <= 'z'; i++) {
        System.out.print(i+" ");
    }

}

public static void printZtoA(){
    for (char i='Z';i>='A';i--)   {
        System.out.print(i+" ");
    }
    System.out.println();
}

public static void characterPrint(char start,char end){

     if (start<end){
            for (char i =start; i <=end; i++)
                System.out.print(i);
        }

      else if (start>end){
            for (char i =start; i>=end; i--){
                System.out.print(i);
            }

    }
      else {
         System.out.println("they are same");
     }
    System.out.println();
}

public static void numberComparision(int num1, int num2){
        if (num1>num2){
            System.out.println(num1+">"+num2);
        }
        else if (num1<num2){
            System.out.println(num1+"<"+num2);
        }
        else {
            System.out.println(num1+"=="+num2);
        }
}

public static void repeatStr(String str,int count){
    for (int i = 1; i <=count; i++) {
        System.out.print(str+",");
    }
    System.out.println();
}

public static void skipCount(){
    for (int i = 0; i <50; i+=3) {
        System.out.print(i+" ");
    }
    System.out.println();
}

public static void countDownEvennumfromXtoY(int X,int Y){
    for (int i = X; i>=Y; i--) {
        if (i%2==0){
            System.out.print(i+" ");
        }

    }
}


public static void count()   {
        countDownEvennumfromXtoY(20,10);
}





}
