public class Offer {



   String company;
   String location;
   long salary ;
   boolean isFullTime;
 public void displayInformation(){
     System.out.println("company : " + company);
     System.out.println("location : " + location);
     System.out.println("salary : " + salary);
     System.out.println("isFullTime : " + isFullTime);
 }


    public void add5000(){
    if (salary<100000){
        salary+=5000;
    }
        System.out.println(salary);
}


public void turnittofulltime(){
     if (isFullTime==false){
         isFullTime=true;
     }
     else {
         System.out.println("already full time.");
     }

}

public void changeLocation(String newLocation){
     location=newLocation;
     displayInformation();
}


public boolean highSalary(){
     if (salary>100000){
         return true;
     }
     else
         return false;

}

public String toString(){


String str="["+company+"|"+location+"|"+salary+"|"+isFullTime+"]";
     return  str;
}









}
