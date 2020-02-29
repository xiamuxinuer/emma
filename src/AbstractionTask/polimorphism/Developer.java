package AbstractionTask.polimorphism;

public class Developer extends ScrumTeam {

    public Developer(String employeeName, long salary) {
        super(employeeName, salary);
        this.jobTitle="developer";
    }


    @Override
    public void demo() {
        System.out.println("developers doing demo");
    }

    @Override
    public void dailyStandUp() {
        System.out.println("developer attending daily stand up meeting");
    }

    public void fixingBug(){
        System.out.println("developer fixing bug.");
    }



}
