package Polymorphism;

import java.util.*;

public class AccountAction {
    public static void main(String[] args) {


        Account a1=new Account("emma",5000);
        Account a2=new Account("akbar",1000);
        Account a3= new Account("dilida",2000);
        Account a4=new Account("Hannah",500);
        a1.transferAll(a2);
        System.out.println(a1+""+a2);

a1.deposit(500);

        System.out.println(a1);


a1.withdraw(100);
        System.out.println(a1);

        System.out.println(a1.isPalindrome());
        System.out.println(a4.isPalindrome());


        List<Account> accountList= Arrays.asList(a1,a2,a3,a4);
        Collections.sort(accountList);

        System.out.println(accountList);

Account a5=new Account("rich",1000);

for (Account each:accountList){
    each.transferAll(a5);
}
        System.out.println(a5);
        System.out.println(accountList);

        System.out.println("-----------------------------------------------------");


//polymorphism:
        Account a6=new Account("lale",1000);
        Transferable t1=new Account("baby",200);
        Object o1=new Account("mama",500);
        Comparable c1=new Account("queen",150);
//only reference type can decide what methods object can access.
 // so object can only access the reference type class has inside itself.
  //a6 object can access the methods that Account class has.
  //t1 object can access the method  that Transferable class has.






       List<Object> list=  Arrays.asList(a6,t1,o1,c1);
        System.out.println(list);







    }
}
