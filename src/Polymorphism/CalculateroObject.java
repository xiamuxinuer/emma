package Polymorphism;

public class CalculateroObject {
    public static void main(String[] args) {
        Calculater c1=new Calculater();

        c1.addNum(100).addNum(100).minusNum(50);
        System.out.println(c1.result);






    }
}
