package inheritancepractice;

public class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate) {
        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void withDraw(int amount){
        super.withDraw(amount);
        super.withDraw(30);

    //or:

        //give us same result as above:
//      balance-=amount;
 //     balance-=30;

        //or:
    //    super.withDraw(amount+30);

        //can call it as many time as we want.only inside of over ride instance  method in sub class
  //      super.withDraw(amount);
    }
    @Override
    public void deposit(int amount){
        super.deposit(amount);
      balance+=(amount*interestRate);

    }



    public static void main(String[] args) {

     final SavingAccount s1=new SavingAccount("emma",123456,15000,0.035);

        System.out.println(s1);

       s1.accountHolder="akbar";
        System.out.println(s1);




s1.withDraw(1000);

        System.out.println(s1);

        s1.deposit(100);

        System.out.println(s1);
    }






}
