package inheritancepractice;

public class FulltimeEmploye extends Employee {

   int monthlySalary;



    public FulltimeEmploye(String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }



    @Override
    public  void YearlySalary(){

        System.out.println(monthlySalary*12);

    }

    @Override
    public String toString() {
        return "FulltimeEmploye{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }




    public static void main(String[] args) {
        FulltimeEmploye f = new FulltimeEmploye("emma", 12345, 2500);

        System.out.println(f);
        f.YearlySalary();

        System.out.println(f.monthlySalary);
        System.out.println(f.name+" "+ f.id);







    }
}
