package AbstractionTask.polimorphism;

public abstract class ScrumTeam {
    String employeeName;
    String jobTitle;
    long    salary;

    public ScrumTeam(String employeeName,  long salary) {
        this.employeeName = employeeName;

        this.salary = salary;
    }



    public abstract void demo();
    public abstract void dailyStandUp();

  public void   employeeInfo(){
      System.out.println("employeeName: "+employeeName+",Job Title: "+jobTitle+",employee salary: "+salary);
  }


}
//Task:
//	create an abstract class called ScrumTeam:
//			Data: employeeName, jobTitle, salary
//			actions (Abstract):  Demo();
//					 			 DailyStandUp();
//			instance method:
//					 employeeInfo(): prints employeeName, Job Title, employee salary


//	create the following sub classes of ScrumTeam:
//			1. Testers:
//						actions: foundBug()
//			2. Developers: job title by default should be software developer
//						actions: fixingBug()
//	create class capitalOne:
//			create List of Testers, and store two objects of Testers class
//			create List of Developers, and store two objects of Developers class
//			create List of ScrumTeam, and store the list of Testers and Developers
//			use for each loop to print out each of the scrum team member's EmployeeInfo