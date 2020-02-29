package AbstractionTask.polimorphism;

public class Tester extends ScrumTeam {

    public Tester(String employeeName, String jobTitle, long salary) {
        super(employeeName,  salary);
        this.jobTitle=jobTitle;
    }

    @Override
    public void demo() {
        System.out.println("tester doing demo");
    }

    @Override
    public void dailyStandUp() {
        System.out.println("tester attending daily stand up meeting.");
    }

  public void foundBug(){
      System.out.println("tester found bugs");
  }



}
