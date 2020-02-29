package Day56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {
      // calling no arg constructor:
        Store s1=new Store();

        System.out.println(s1.name);
        System.out.println(s1.allProducts);

        //passing a object:
        Product p=new Product("PC",2999);
        s1.addProduct(p);
        System.out.println(s1.allProducts);

        //passing name and price for an object:
        s1.addProduct(new Product("imac",3999));
        System.out.println(s1.allProducts);



        List<Product> productList=new ArrayList<>();

        Product p1=new Product("Macbook",2999);
        Product p2=new Product("Apple watch",499);
        Product p3=new Product("iPhone 11",1999);
        Product p4=new Product("iPhone X",999);
        Product p5=new Product("Sony TV",899);

        productList.addAll(Arrays.asList(p1,p2,p3,p4,p5));

       Store s2=new Store("Macy",productList);

        System.out.println(s2.name);
        System.out.println(s2.allProducts);

        System.out.println(s2.getProductCount());

        s2.allProducts.clear();// array list method

s2.addProduct(new Product("lego toy",199));

s2.addProduct("disney toy",299);
        System.out.println(s2.allProducts);

        //System.out.println(s2.allProducts.size());
        System.out.println(s2.getProductCount());

        s2.displayProducts();

        System.out.println(s2.checkIfProductExists(new Product("toy",599)));

        System.out.println(s2.checkIfProductExists(p1));

        s2.addProduct(p1);

        System.out.println(s2.checkIndex(p1));

        s2.remove(p1);

         s2.remove(p1);

        s2.remove(p2);


        System.out.println(s2.getSum());
        System.out.println("s2 average price is :"+ s2.getsAverage());


        System.out.println(s2.mostExpensivePrice());
        System.out.println(s2.getMostExpensiveProduct());



       Store s3=new Store("walmart",productList);
        System.out.println(s3.getsAverage());
        System.out.println(s3.priceMoreThanAverage());
        System.out.println(s3.getMostExpensiveProduct());





    }
}
