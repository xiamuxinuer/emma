package Polymorphism;

import javax.swing.*;

public class Account implements Transferable,Comparable<Account> {

protected String name;
private    int   balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

   public void deposit(int amount){
        balance=this.balance+amount;
   }

  public void withdraw(int amount){
        balance=this.balance-amount;
  }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

//logic inside transferAll implementation
////* it should take all the balance from current account to other Account
////*
       @Override
    public void transferAll(Account otherAccount) {
        otherAccount.balance+=this.balance;
        this.balance=0;
    }


    @Override
    public int compareTo(Account o) {
        if (this.balance>o.balance){
            return 1;
        }
      else if (this.balance<o.balance) {
          return -1;
        }
      else return 0;
    }


/*   to honor Palindrome day ,
//*   add a method inside Account class called
//*   isPalindrome return true if account name is palidrome (case and space should not matter)
//*
//*/


public boolean isPalindrome(){
    String reverseName="";
    String temp=this.name.toLowerCase().replace(" ","");
    for (int i=temp.length()-1;i>=0;i--){
        reverseName+=temp.charAt(i);
    }
    if (reverseName.equalsIgnoreCase(temp)) {

        return true;
    }


    return false;
}




}


