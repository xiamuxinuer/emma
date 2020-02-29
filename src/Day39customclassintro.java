import java.util.ArrayList;
import java.util.List;

public class Day39customclassintro {

    public static void main(String[] args) {



Student s1=new Student();

s1.name="emma";
s1.age=18;
s1.gender='F';

        System.out.println(s1.name+" " +s1.age+" "+ s1.gender);



     Car car1=new Car();
     car1.year=2020;
     car1.brand="Toyota";
     car1.module="corolla";
     car1.color="white";


        System.out.println(car1.year+" "+car1.brand+" "+car1.module+" "+car1.color);

        car1.gotowork();
        car1.carage();
        car1.changecolor("green");

        System.out.println(car1.color);

     Car car2=new Car();
     car2.year=2018;
     car2.brand="Honda";
     car2.module="Civic";
     car2.color="red";

        System.out.println(car2.year+" "+car2.brand+" "+car2.module+" "+car2.color);


     car2.gotowork();
     car2.carage();
     car2.changecolor("blue");
     System.out.println(car2.color);


//offer task:

Offer offer=new Offer();
offer.company="cybertek";
offer.isFullTime=false;
offer.location="oklahoma";
offer.salary=95000;


offer.displayInformation();

offer.add5000();
//or:
System.out.println("new salary" + +offer.salary);

      offer.turnittofulltime();
        System.out.println(offer.isFullTime);//true
        System.out.println("---------------");

offer.changeLocation("DC");

       offer.changeLocation("new york");







        System.out.println("---------------------------");





List<Offer> offerArray=new ArrayList<>();
offerArray.add(offer);
// if you have more offers:
//List<Offer> offerArray = new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5));

      for (Offer each:offerArray){
         each.changeLocation("houston");

      }
        System.out.println("----------------------------------------------------------------");

//create more offer:
        Offer o1=new Offer();

        o1.company="Amazon";
        o1.isFullTime=false;
        o1.location="Dallas";
        o1.salary=120000;

        System.out.println(o1.highSalary());

        System.out.println("----------------------------------");
boolean result=o1.highSalary();
if (result=true){
    o1.changeLocation("Tulsa");
}
        System.out.println("-----------------------------------------");

      String o1String=o1.toString();
        System.out.println(o1String);
        System.out.println("-----------------------------------");

        System.out.println(o1);





    }
}
