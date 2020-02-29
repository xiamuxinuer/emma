public class Car {

    long year;
    String brand,module, color;


    //instance method :are tied to the object,it does nto have 'static' keyword.
    // we need an object when we call them.
    public void gotowork(){
        System.out.println("drive my "+brand+" "+module+"  go to work");

    }


    public void carage(){

        System.out.println("car age is : "+(2020-year));

    }

public void changecolor(String newcolor){
        color=newcolor;
}


}
