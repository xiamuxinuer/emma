public class Pet {

    String type;
    String name;

    public Pet() {

    }

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public void speak(){

       switch (type){
           case "cat":
               System.out.println("say : meow ");
               break;
           case "dog" :
               System.out.println("say: row");
               break;
           default:
               System.out.println("unknown animal");
               break;
       }
    }

    public static void general(){
        System.out.println("they are all animals");

    }


}

