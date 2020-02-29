import java.util.*;

public class Day38arraylistpractice {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("emma","akbar","dildar");//we can not modify this kind of array list .
        // can not add item or remove item.can not change the size.can do other than that
        //names.add("mamatjan");//cant do this
        names.set(0,"queen");
        System.out.println(names);
// so create a another can modify array list and put above list in new array list:so we can add or remove item on the list
        List<String> nameList=new ArrayList<>(names);
        //or:
        List<String> nameList2=new ArrayList<>(Arrays.asList("emma","akbar","dildar")); // can change size

        System.out.println(nameList);
        System.out.println(nameList2);
        nameList2.remove("emma");
        System.out.println(nameList2);


        List<Double> prices=Arrays.asList(9.99,5.99,3.45,8.99,0.95);// if we dont want to add item or remove item ,
                                                                   // can create array list this way .

// count of item price>5
int count=0;
for (Double eachPrice:prices){
    if (eachPrice>5){
        count++;
    }
}
        System.out.println(count);

// if you want to add 2 more item on the list:
      List<Double> newPrices= new ArrayList<>(prices);
      newPrices.add(20.55);
      newPrices.remove(0.99);// if we have 2 or more same price on the list , it will always remove the first one.
      newPrices.remove(1);
      newPrices.add(1,100.99);
      newPrices.remove(2);


      List<String> groceriesList=Arrays.asList("eggs","apple","salmon","chicken wings");
        System.out.println(groceriesList);
      List<String> newList=new ArrayList<>(groceriesList);
      newList.add("salt");
      newList.add("sugar");

        System.out.println(newList);
List<String> addNewItemToNewList=Arrays.asList("veg","drink","snack");

newList.addAll(addNewItemToNewList);//  add new items list to old list
        System.out.println(newList);
//or:
        newList.addAll(Arrays.asList("rice","flour","veg oil"));
        System.out.println(newList);
        newList.remove("flour");
        System.out.println(newList);

newList.removeAll(addNewItemToNewList);
        System.out.println(newList);

newList.removeAll(Arrays.asList("veg oil","rice"));
        System.out.println(newList);
        List<Integer > num1 = new ArrayList<>(Arrays.asList(100,200,300,400,500,600));
        List<Integer > num2 = new ArrayList<>(Arrays.asList(200,300,600,700,800));// can be modify

        System.out.println(num1.equals(num2));//false
// just print what we have common part in both List.delete other part.(find same item in 2 list)
        num1.retainAll(num2);
        System.out.println(num1);

        num2.retainAll(num1);
        System.out.println(num2);

        System.out.println(num1.equals(num2));//true-->>after retain all method,2 list become equal
        System.out.println(num2.equals(num1));//true

//order of the element matter on the list when we checking array list equality.


        //sort a Array List:use collections method
        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600,100, 800));
     //use collection utility class
        Collections.sort(nums);
        System.out.println(nums);
  //reverse a list :
        Collections.sort(nums,Comparator.reverseOrder());
        System.out.println(nums);


        //sort a Array List:sort it directly
        List<Integer> nums3 = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        nums3.sort(Comparator.naturalOrder());
        System.out.println(nums3);
        nums3.sort(Comparator.reverseOrder());
        System.out.println(nums3);
//use swap method to reverse a list:


        System.out.println("nums3 = " + nums3);
        for (int i = 0; i < nums3.size() / 2; i++) {
            Integer temp = nums3.get(i);
            nums3.set(i, nums3.get(nums3.size() - 1 - i));
            nums3.set(nums3.size() - 1 - i, temp);
        }

        System.out.println("nums3 = " + nums3);



        List<Integer> nums4 = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));

        Collections.reverse(nums4);//[800, 600, 700, 200, 300],  works like swap//   just from back to front .
        System.out.println(nums4);

        Collections.sort(nums4,Comparator.reverseOrder());//[800, 700, 600, 300, 200]  high to low order
        System.out.println(nums4);

        nums4.sort(Comparator.reverseOrder());//[800, 700, 600, 300, 200]     high to low order
        System.out.println(nums4);



  //array list practice:
  //Each element should contains product information separated by comma  : at index 0 -->> iPhone 6s, 499 , 18.71

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList
                ("iPhone 6s,449,18.71",
                        "iPhone 6s Plus,549,22.88",
                        "iPhone X,1149,56.16",
                        "MacbookPro,1499.99,79.49",
                        "ThumbDrive,39.99,2.68",
                        "Beats HeadPhones,349.99,15.12",
                        "Mous,79.99,8.98",
                        "Charger,39.99,4.56",
                        "iPad,429,18.31",
                        "Dyson Vacuum,399,16.25",
                        "TV,2199,89.49",
                        "Apple Watch,559,21.18"));

//print the list:
        System.out.println("arrList = " + arrList);
// get the size of list:
        System.out.println("how many item on the list : " + arrList.size());

        //Task: print only first items name   :
        System.out.println(arrList.get(0).substring(0,arrList.get(0).indexOf(",")));
//or
        String  firstItemName=arrList.get(0).split(",")[0];

        System.out.println("firstItemName = " + firstItemName);

//to print each items name from array list:
        for (String eachItem:arrList){
            System.out.println("each item " + eachItem);// get each item whole information from the list
            String namePart=eachItem.split(",")[0];// just get the each item's name
            System.out.println("each item s name = " + namePart);
        }

//or: do it with for loop:
        for (int i = 0; i <arrList.size(); i++) {
            String namePart=arrList.get(i).split(",")[0];
            System.out.println("namePart = " + namePart);
        }

//Task  : print all the prices more than 500:
        for (String eachItem:arrList){
            String namePart=eachItem.split(",")[0];
            double eachItemPrice=Double.parseDouble(eachItem.split(",")[1]);
            if (eachItemPrice>500){
                System.out.println( namePart+": "+ eachItemPrice);
               // System.out.println("eachItemPrice = " + eachItemPrice);
            }


        }
//Task  : print sum and average price:
        double sum=0;

        for (String eachItem:arrList){
            double eachItemPrice=Double.parseDouble(eachItem.split(",")[1]);
           sum+=eachItemPrice;

        }
        System.out.println("sum = " + sum);
        double average=sum/arrList.size();
        System.out.println("average = " + average);


        //Task  : print all the items name that has less than 20$ monthly payment.

        for (String eachItem:arrList) {

            String namePart = eachItem.split(",")[0];
            double monthlypayment = Double.parseDouble(eachItem.split(",")[2]);
            if (monthlypayment < 20) {

                System.out.println(namePart  +": "+monthlypayment);
            }
        }
        System.out.println("----------------------------");
        //Task  : Print the monthly payments of all the iPhone no matter what model.

        for (String eachItem:arrList) {

            String namePart = eachItem.split(",")[0];
            double monthlypayment = Double.parseDouble(eachItem.split(",")[2]);
            if (namePart.contains("iPhone")) {

                System.out.println(namePart  +": "+monthlypayment);
            }
        }
        System.out.println("----------------------------");

        //Task  : Print all information about most expensive item:

        double max=0;
        String mostExpensiveItem="";
      for (int i=0;i<arrList.size();i++){

          double eachItemPrice=Double.parseDouble(arrList.get(i).split(",")[1]);
          if (eachItemPrice>max){
              max=eachItemPrice;
             mostExpensiveItem=arrList.get(i);
          }
      }
        System.out.println("mostExpensiveItem is : " + mostExpensiveItem+", item price is :"+ max);

        System.out.println("----------------------------");





    }
}
