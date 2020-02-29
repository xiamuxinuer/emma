public class day4 {
    public static void main(String[] args) {
        String itemName = "amazon Fire with Alexa";
        String model = "HD";
        int version = 8;
        float price = 79.99f;
        System.out.println("I saw " + itemName + model + version + "  only for " + "$"+ price);

        System.out.println(7 / 3);  //two int create another int .{only give you int (whole number)}
        System.out.println(5 / 0.3d); //two numerical data type create (larger data type (fractional number)}
        System.out.println(5 / 3.12);
        System.out.println(5 / 3.12f);

        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;
        double result1=num1/num2;
        float result2=num1/num3;
        int result3=num1+num1;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(num1+num3);

        //tempurator convert
        double farenheit =40.0d;
        double celsius= (5.0/9)*(farenheit-32);
        System.out.println(farenheit+ "F equals to  " + celsius +" C.");

//     remainder  %

        System.out.println(5%2);

        System.out.println(99%10);
        System.out.println(100%10);

        int min=135;
        int remainder=min%60;
        System.out.println(min+"mins = "+min/60+"hours" +remainder+"mins");

        int myFavoritenumber=500;
        int yourFavoritenumber=myFavoritenumber;


        System.out.println(yourFavoritenumber);

         yourFavoritenumber=100;
        System.out.println(yourFavoritenumber);


String yourorder="cheese burger";
String myorder=yourorder;
     yourorder="hamburger";
            System.out.println(myorder +"\n" + yourorder);


    }


    }

