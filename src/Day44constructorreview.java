public class Day44constructorreview {

    public static void main(String[] args) {


Person p1=new Person("emma",35);
p1.species="human";
        System.out.println(p1);
//species is static method , so all objects that we created share the copy of the value of it.
// if we change the value of it ,rest of the objects will get the copy of new value.

Person p2=new Person("akbar",37);
p2.species ="humanoid";
        //Person.species ="humanoid";
        System.out.println(p2);

Person p3=new Person("queen",25);
        System.out.println(p3);

        System.out.println("count of person:"+ Person.counter);



    }
}
