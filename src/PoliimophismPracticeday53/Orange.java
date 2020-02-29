package PoliimophismPracticeday53;

public class Orange extends Fruit {

    int vcLevel;


    public Orange(String taste, String color,int vcLevel) {
        super(taste, color);
        this.vcLevel=vcLevel;
    }

    //@Override
    public void getDigested() {
        System.out.println("orange has high vc level as "+ vcLevel );
    }

    @Override
    public String toString() {
        return "Orange{" +
                "vcLevel=" + vcLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
