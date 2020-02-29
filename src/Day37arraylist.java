import java.util.ArrayList;
import java.util.List;

public class Day37arraylist {
    public static void main(String[] args) {

        List<String> teamMates = new ArrayList<>();
        teamMates.add("akbar");
        teamMates.add("dida");
        teamMates.add("emma");
        teamMates.add("snow");
        teamMates.add("john");
        teamMates.add("rahan");

        System.out.println(teamMates);//   print out the list as a string .

        System.out.println(teamMates.toString());// same as above.


        System.out.print(teamMates.get(0));//get first item on the list.
        System.out.println();
        System.out.print(teamMates.get(teamMates.size() - 1));//get last item on the list.
        System.out.println();

        for (int i = 0; i < teamMates.size(); i++) {
            System.out.print(teamMates.get(i) + " ");     //print each item on the list
        }
        System.out.println();
// reverse array list :
        for (int i = teamMates.size() - 1; i >= 0; i--) {
            System.out.print(teamMates.get(i) + " ");
        }
        System.out.println();

        //print each 2  item at a time :
        for (int i = 0; i < teamMates.size() - 1; i++) {
            System.out.println(teamMates.get(i) + "," + teamMates.get(i + 1));//0,1>1,2>2,3>3,4
        }

        //print  2 at a time :
        for (int i = 0; i < teamMates.size() - 1; i += 2) {
            System.out.println(teamMates.get(i) + "," + teamMates.get(i + 1));//0,1>2,3>4,5>6,7
        }

        // pair by 3
        for (int i = 0; i <= teamMates.size() - 3; i += 3) {
            System.out.println(teamMates.get(i) + " " + teamMates.get(i + 1) + " " + teamMates.get(i + 2));}

            //pair by 3

            for (int i = 0; i <= teamMates.size() - 3; i++) {
                System.out.println(teamMates.get(i) + " " + teamMates.get(i + 1) + " " + teamMates.get(i + 2));}



        String result = "";
        for (int i = 0; i <teamMates.size() ; i++) {
            if (i == teamMates.size()-1 ) {

                result = result + teamMates.get(i);
            }
            else {
                result = result + teamMates.get(i)+ "-";
            }

        }
        System.out.println(result);


         String teamMatesToString=teamMates.toString();
        System.out.println(teamMatesToString);
        System.out.println(teamMatesToString.replace(",","-"));



List<Double> priceList=new ArrayList<>();
priceList.add(9.99);
priceList.add(12.99);
priceList.add(2.39);
priceList.add(11.29);
priceList.add(65.59);
priceList.add(999.99);


        System.out.println("price list : "+priceList);   //print out the list as string.
        priceList.set(2,10.0);//change second item value to 10.0
        priceList.get(3);
        priceList.set(0,priceList.get(0)+4);// add 4 to first item

double sumOFFirstTwoItem=priceList.get(0)+priceList.get(1);

        System.out.println(sumOFFirstTwoItem);


        priceList.set(priceList.size()-1,sumOFFirstTwoItem);

        double lastitemprice=priceList.get(priceList.size()-1);//get last item in any list


        System.out.println(lastitemprice);

        System.out.println(priceList);
        //double the price of each item on the list:

        for (double eachitem:priceList){
            System.out.print(eachitem*2+", ");
        }
        System.out.println();
//or:
        for (int i = 0; i <priceList.size(); i++) {
            priceList.set(i,priceList.get(i)*2);
        }
        System.out.println(priceList);

// cut the price in half if the price is more than $20 :

        for (double eachitem:priceList) {
            if (eachitem >= 20.0) {
                System.out.print(eachitem / 2 + ", ");
            }
    }

        System.out.println();


//create a array list of a Integer and fill up with 1-100:
        List<Integer> nums=new ArrayList<>();
        for (int i = 1; i <=100; i++) {
            nums.add(i);
        }
        System.out.println(nums);

//change all the odd numbers to 0:???
        for (int i = 0; i <nums.size(); i+=2) {

                nums.set(i,0);

        }
        System.out.println(nums);

//insert 100 to first index;
        nums.add(0,100);

        System.out.println(nums);

        nums.indexOf(20);
        System.out.println("indexof 20  is : " +nums.indexOf(20) );


        List<Integer>  lst=new ArrayList<>();
        lst.add(44);
        lst.add(15);
        lst.add(34);
        lst.add(41);
        lst.add(19);
        // insert 100 after 34 :
        lst.add(lst.indexOf(34)+1,100);
        System.out.println(lst);

// add five 100 in front of 44 :
        for (int i = 1; i <=5 ; i++) {
            lst.add(0,100);
            }

        System.out.println(lst);


//find longest name in List of String that contains 6 names
        List<String> names=new ArrayList<>();
        names.add("emma");
        names.add("akbar");
        names.add("dilida");
        names.add("queen");
        names.add("rehan");
        names.add("snow");

String longestName=names.get(0);
for (String eachName:names){
    if (eachName.length()>longestName.length()){
        longestName=eachName;
    }
}
        System.out.println(longestName);

// important note:

// length     :  counting the elements inside --  array , it's a property of array object
        // last element of an array :  arr[arr.length-1]
// length()   :  counting the characters inside--  String , it's a method of String object
        // last char of a String :  str.charAt( str.length()-1 )
// size()     :  counting the elements inside ArrayList object, , it's a method of List Object
        // last element of an arrayList :  lst.get( lst.size()-1 )



           }
        }





