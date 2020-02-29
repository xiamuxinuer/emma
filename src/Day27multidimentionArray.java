import java.util.Arrays;

public class Day27multidimentionArray {
    public static void main(String[] args) {
//multi-dimensional Array:  can contain another Array/Arrays.
//



        // task :print all even numbers
int[][] num={{10},{15,20,23,11,30}};

        for (int i = 0; i <num.length; i++) {
            for (int j = 0; j <num[i].length; j++) {
                if (num[i][j]%2==0){
                    System.out.print(num[i][j]+",");
                }

            }
        }


        System.out.println("--------------------------------");
for (int[] item:num){
    System.out.println(Arrays.toString(item));// get 2 separate array value. [10] ,[15, 20, 23, 11, 30]
}
// print each single element in each single dimensional array:
        for (int[] item:num){
            for (int eachitem:item){
                System.out.print(eachitem+",");// get each element in each single array value :10,15,20,23,11,30,
            }
        }
        System.out.println("---------------------------------");
int[][]  score={{12,11,10,19},{19,20,15}};
        //find max from multi-dimensional array:
        int max=score[0][0];
        int min=score[0][0];
for (int[] item:score) {
    for (int eachitem : item) {
        if (eachitem > max) {
            max = eachitem;
        }
       if (eachitem<min){
           min=eachitem;
       }
    }
}
        System.out.println(max);
        System.out.println(min);



        System.out.println("---------------------------------");

        //find out longest name and shortest name:
String[] developers={"akbar","muhtaro","hasandova"};
String[]   testers={"emma","joe","mohammad sohrabi","nursultan"};
String[]   BA={"lisa","neila"};
String[][] scrumTeam={developers,testers,BA};// store each single dimensional array into multi-dimensional array
String logestName=scrumTeam[0][0];
String shortestName=scrumTeam[0][0];

     for (String[] item:scrumTeam){
         for (String eachName:item){
             if (eachName.length()>logestName.length()){
                 logestName=eachName;
             }
             if (eachName.length()<shortestName.length()){
                shortestName=eachName;
             }
         }
     }
        System.out.println(shortestName);
        System.out.println(logestName);



    }
}
