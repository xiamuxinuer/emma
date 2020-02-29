public class Person {


    private String name;
    private  int   age;

     public static  String species="human";
         public static  int  counter;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        ++counter;


    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name=newName;
    }

   public int getAge(){
        return age;
   }

   public void setAge(int newAge){
        age=newAge;
   }





    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }







}
