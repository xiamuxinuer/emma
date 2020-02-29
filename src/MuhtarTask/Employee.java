package MuhtarTask;

public abstract class Employee {

    String employeeName;
     int   employeeID;
     String JobTitle;

    public Employee(String employeeName, int employeeID, String jobTitle) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
    }

    public abstract void working();






}
