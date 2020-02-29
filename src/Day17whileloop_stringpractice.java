public class Day17whileloop_stringpractice {
    public static void main(String[] args) {
//task write your name:
String name="emma snow";
int   x=0;
        while (x<name.length())   //  while (x<=name.length()-1)
        {
            System.out.print(name.charAt(x++));//  or===>>> System.out.print(name.charAt(x));x++;
        }

        System.out.println("_______________");

//  task write name backward:
        String myName="diLida";
        int n=myName.length()-1;//(last character index  of the string )

      while (n>=0){
       System.out.println(myName.charAt(n--));
       }

//task:give me $5 or $20
        int money=0;
    while(money!=5&&money!=20){

        System.out.println("give me $5 or $20");
        money++;     // money=scan.nextInt();----->>w can use scanner instead of (money++).
    }
        System.out.println("thank you.");







    }
}
