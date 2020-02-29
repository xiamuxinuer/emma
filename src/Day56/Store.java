package Day56;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
    List<Product> allProducts;


    public Store() {

      this.name="TJ Max";
      this.allProducts=new ArrayList<>();
    }


    public Store(String name, List<Product> allProducts) {
        this();// calling no arg constructor.
        this.name = name;
        this.allProducts.addAll(allProducts);
    }

    //Create an instance void method called addProduct(Product p)
public void addProduct(Product newProduct){
        allProducts.add(newProduct);
}

public void addProduct(String name, int price){
        Product newProduct=new Product(name,price);
        allProducts.add(newProduct);
}

public int getProductCount(){
        return allProducts.size();
}

public void displayProducts(){
        for (Product each:allProducts){
            System.out.println("each product : " + each);
        }
}


//Create an instance void method called checkIfProductExist(Product p)

public boolean checkIfProductExists(Product p){
       return allProducts.contains(p);
}


public int checkIndex(Product p){
        return allProducts.indexOf(p);
}

//Create an instance void method called removeProduct(Product p)
public void remove(Product p){

        if (checkIfProductExists(p)){

            allProducts.remove(p);
            System.out.println("removed :"+p);


        }
        else {
            System.out.println("we dont have "+ p);
            System.out.println(allProducts);
        }
}

// Find sum.of all products
public int getSum(){
        int sum=0;
        for (Product each:allProducts){
            sum+=each.getPrice();
        }
        return sum;
}

public double getsAverage(){
        return getSum()/getProductCount();
}


// find max price :
public int mostExpensivePrice(){
        int max=0;
        for (Product each:allProducts){
            if (each.getPrice()>max){
                max=each.getPrice();
            }
        }
   return max;
}

// find and return max price product:

    public  Product getMostExpensiveProduct(){
int max=0;
//int maxIndex=0;
//        for (int i = 0; i < allProducts.size(); i++) {
//            if (allProducts.get(i).getPrice()>max){
//                max=allProducts.get(i).getPrice();
//                maxIndex=i;
//            }
//        }
//            return allProducts.get(maxIndex);

        Product maxProduct=null;
        for (Product each:allProducts){
            if (each.getPrice()>max){
                max=each.getPrice();
                maxProduct=each;
            }
        }
return maxProduct;

    }

//Find list of products more than average  (edited)

public List<Product> priceMoreThanAverage(){
      List<Product> newList=new ArrayList<>();
        for (Product each:allProducts){
            if (each.getPrice()>getsAverage()){
                newList.add(each);
            }
        }
        return newList;
}


}





