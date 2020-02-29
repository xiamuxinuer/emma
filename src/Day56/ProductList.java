package Day56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductList {
    public static void main(String[] args) {

        List<Product> productList=new ArrayList<>();

        Product p1=new Product("Macbook",2999);
        Product p2=new Product("Apple watch",499);
        Product p3=new Product("iPhone 11",1999);
        Product p4=new Product("iPhone X",999);
        Product p5=new Product("Sony TV",899);

        productList.addAll(Arrays.asList(p1,p2,p3,p4,p5));
        System.out.println(productList);
        System.out.println(productList.size());

        boolean result=false;
        for (Product each:productList){
     if ( each.getName().equals("Sony TV")&&each.getPrice()==899){
         result=true;

        }
     else result=false;
    }

        System.out.println(result);


boolean result1=productList.contains(new Product("Sony TV",899));
        System.out.println(result1);





    }
}
