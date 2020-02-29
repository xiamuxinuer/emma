public class Vehicle {

   protected String make;
  private int  year;


  public void start(){
      System.out.println("starting"+make);
  }
    public void goForward(){
        System.out.println(make+" is going forward.");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
