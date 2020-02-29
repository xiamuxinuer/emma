package Day60CollectionFramework;

public class Job implements Comparable <Job> {
    String  location;
    double  salary;
    String   companyName;

    public Job(String location, double salary, String companyName) {
        this.location = location;
        this.salary = salary;
        this.companyName = companyName;
    }

    @Override
    public int compareTo(Job o) {
        if (this.salary>o.salary){
            return 1;
        }
        else if (this.salary<o.salary){
            return -1;
        }
        else return 0;
    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
