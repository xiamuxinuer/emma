import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day36ArrayList {
    public static void main(String[] args) {

      //creating ArrayList object:
        List<String> list0=new ArrayList<>()  ;
        // or:
        ArrayList<String> list1=new ArrayList<>();


      // only way to  store numbers is use wrapper class type. can not use primitive .
        List<Integer> list2=new ArrayList<>();

        List<Long>    list3=new ArrayList<>();

//create a arrayList object and assign it to a variable :
        List<Long> list=new ArrayList<>();
       list.add(12L); list.add(50L); list.add(120L);
        System.out.println("list: "+ list);
        System.out.println("size = " + list.size());
        System.out.println("fist item in the list is : "+ list.get(0));

// get each single item in the array list:  use  list.get(i) method .
        for (int i = 0; i <list.size(); i++) {
            System.out.println("each item in the list :" + list.get(i));
        }

        // get the sum:
         long sum=0;
         for (long eachlong:list){
             System.out.println("eachlong : " + eachlong);
             sum+=eachlong;
         }
        System.out.println("sum = " + sum);

         //find max :
         long max=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>max);
            max=list.get(i);
        }

        System.out.println("max = " + max);


        // insert something into the array list :
        list.add(2,55L);
        System.out.println("list = " + list);
        System.out.println(list.get(2));
// remove item by value :
        list.remove(120L);
        System.out.println("list = " + list);
//remove item by index:
        list.remove(1);

        System.out.println("list = " + list);

    //check the is empty :
    list.isEmpty();
        System.out.println( list.isEmpty());


        //task:
        int [] nums={11,23,30,45,50,60};
        List<Integer> lst=new ArrayList<>();
        //add nums to  lst if it does not already contains that item:
        for (int each:nums) {
           if (!lst.contains(each)){
               lst.add(each);
           }

        }

        System.out.println(lst);










    }
}
