import java.util.Arrays;
import java.util.List;

public class Day43petclasspractice {
    public static void main(String[] args) {

        Pet p1=new Pet("bunny","richard");
        System.out.println(p1);


        Pet p2=new Pet("cat","queen");
        System.out.println(p2);
        p2.speak();

        Pet p3=new Pet("dog","klindike");
        System.out.println(p3);
        p3.speak();

        Pet p4=new Pet("horse","arman");
        System.out.println(p4);
        p4.speak();

        List<Pet> petList= Arrays.asList(p1,p2,p3,p4);
        System.out.println(petList);

        for (Pet each:petList){
            System.out.println(each.getName());
            each.speak();
        }

for (Pet each:petList){
    if (each.getType().equalsIgnoreCase("cat")){
        System.out.println(each);

    }
}

// this is a static method , so we do not need an object when we call it. just use :classname.method name.
  Pet.general();



    }
}
