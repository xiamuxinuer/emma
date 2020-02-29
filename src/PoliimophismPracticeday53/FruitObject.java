package PoliimophismPracticeday53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitObject {
    public static void main(String[] args) {

        Apple a1=new Apple("sweet","red","Fuji");
        Fruit a2=new Apple("sour","red","gala");
        Fruit f1=a1;

        Fruit f2= new Orange("sour","orange",12);
        Fruit f3=new Orange("sweet","red",10);
        Orange o1=new Orange("no taste","yellow",5);

        System.out.println(a1.type);

        f1.getDigested();// i1 cant access type,only can access fruit class methods.

        System.out.println(o1.vcLevel);
        f3.getDigested();//cant access vc level,only can access fruit class methods.
        System.out.println(f2.toString());// super class has to string method from object class.and go to call the overriden method in orange class

        System.out.println("---------------------------");
// make an Array:
Fruit[] myFruit={a1,a2,o1,f2,f3};
for (Fruit eachFruit:myFruit){
    eachFruit.getDigested();
}

        System.out.println("---------------------------");

//make a List:
        List<Fruit> fruitList= new ArrayList<>(Arrays.asList(a1,a2,f2,f3,f1,o1));
        for (Fruit each:fruitList){
            //System.out.println(each.getClass().getSimpleName());
            System.out.println(each);
        }


















    }
}
