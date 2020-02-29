package MuhtarTask;

public class Developer extends Employee {


    public Developer(String employeeName, int employeeID, String jobTitle) {
        super(employeeName, employeeID,jobTitle);
        jobTitle="developer";
    }




    @Override
    public void working() {
        System.out.println("developers are coding ");
    }


    @Override
    public String toString() {
        return "Developer{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                '}';
    }
}
