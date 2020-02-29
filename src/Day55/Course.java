package Day55;

import java.util.List;

public class Course {
   String subject;
   List<String> studentNames;


    public Course(String subject, List<String> studentNames) {
        this.subject = subject;
        this.studentNames = studentNames;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }

public void addStudent(String name){
        studentNames.add(name);
}

public void addManyStudent(List<String>  names){
      studentNames.addAll(names);
}



}
