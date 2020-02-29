import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class Day43constructorpractice {
    public static void main(String[] args) {

Coffee c1 = new Coffee();
        System.out.println(c1);

Coffee c2=new Coffee("coffee mocha",2);
        System.out.println(c2);
Coffee c3=new Coffee("carmel machiado",2,-2.3);
        System.out.println(c3);
Coffee c4=new Coffee("carmel machiado",2,5.3);
        System.out.println(c4);

        c4.setPrice(-5.99);
        System.out.println(c3);


//create a list of coffee:
        List<Coffee> listOfCoffee=new ArrayList<>(Arrays.asList(c1,c2,c3,c4) );
        System.out.println(listOfCoffee);

    }
}
