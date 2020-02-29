package MuhtarTask;

public class Tester extends Employee {



    public Tester(String employeeName, int employeeID, String jobTitle) {
        super(employeeName, employeeID, jobTitle);
        jobTitle="tester";
    }



    @Override
    public void working() {
        System.out.println("testers are testing ");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                '}';
    }
}
