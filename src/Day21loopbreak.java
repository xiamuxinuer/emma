public class Day21loopbreak {
    public static void main(String[] args) {


        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            if (i==5)
                break;
        }


//get the sum:
        int sum=0;
        for (int x = 1; x <=10; x++) {
            sum=sum+x;
            if (sum+x>=40)
            break;
        }
        System.out.println("sum: " + sum);


        String name="emma";
        for (int y = 0; y < name.length(); y++) {

            if (name.substring(y,y+1).equalsIgnoreCase("a"))  //>> name.charAt(y)=='a'
                break;
            System.out.println(name.substring(y,y+1)+""+y);//     or  >> name.charAt(y)
        }


        //continue :skipping to next iteration
        for (int n = 0; n <=10; n++) {

            if (n % 2 == 0)
                continue;
            System.out.println(n);

        }


    }

}
