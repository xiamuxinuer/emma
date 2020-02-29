package PoliimophismPracticeday53;

public class Fruitshop {

public static void displayFruit(Fruit anyFruit){
    System.out.println("display fruit\n"+anyFruit.toString());
}

public static void digestBetter(Fruit anyFruit){
    anyFruit.getDigested();
    anyFruit.getDigested();
    anyFruit.getDigested();
    anyFruit.getDigested();
    displayFruit(anyFruit);

}




public  static Fruit getFavoriteFruit(){

return new Apple("sweet","red","fuji");
}

public static Fruit getFavoriteByType(int type){
    if (type == 1) {
        return new Apple("sour","red","gala");
    } else if (type == 1) {

        return new Orange("sour","orange",12);
    }
    else return null;//no object here
    }



    public static void main(String[] args) {

        Fruit a1=new Apple("sour","red","gala");
        Fruit f1= new Orange("sour","orange",12);

        displayFruit(a1);
        displayFruit(f1);


        digestBetter(a1);
        digestBetter(new Apple("sour","red","gala"));//pass the object directly

        System.out.println(getFavoriteFruit());

Fruit f=getFavoriteFruit();
f.getDigested();

        System.out.println(getFavoriteByType(1));
        System.out.println(getFavoriteByType(0));



    }




}
