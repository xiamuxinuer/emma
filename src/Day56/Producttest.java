package Day56;

public class Producttest {
    public static void main(String[] args) {

        Product p1=new Product("Macbook",2999);
        Product p2=new Product("Apple watch",499);
        Product p3=new Product("Macbook",2999);

        System.out.println(p1==p2);
        System.out.println(p1==p3);//   result:false,different object.
        System.out.println(p2.equals(p3));

     Product p4=p1;
        System.out.println(p4);
        System.out.println(p4.equals(p1));// result :true, pointing same object.





    }
}
