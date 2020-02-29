public class Coffee {

   private String type;
    private int    caffeinLevel;
    private double price;

//create a  no argument constructor :
    public Coffee(){
        System.out.println("this is a no argument constructor.");
    }

//2 arguments constructor:
    public Coffee(String type,int caffeinLevel){
        this.type=type;
        this.caffeinLevel=caffeinLevel;
    }
//3 arguments constructor:


    public Coffee(String type, int caffeinLevel, double price) {
        this.type = type;
        this.caffeinLevel = caffeinLevel;

//        if (price<=0){
//            this.price=1.0;
//        }
//        else if (price>0){
//            this.price = price;
        setPrice(price);
        }




    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeinLevel=" + caffeinLevel +
                ", price=" + price +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeinLevel() {
        return caffeinLevel;
    }

    public void setCaffeinLevel(int caffeinLevel) {
        this.caffeinLevel = caffeinLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price<=0){
            this.price=1.0;
        }
        else if (price>0){
            this.price = price;
        }

    }











}