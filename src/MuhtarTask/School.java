package MuhtarTask;

import java.util.List;

public class School {

    String schoolName;
    List<Student> AllStudentsList;


    public School(String schoolName, List<Student> allStudentsList) {
        this.schoolName = schoolName;
        AllStudentsList = allStudentsList;
    }

    //create a method called addNewStudent() that can add students to the AllStudentsList

    public void addNewStudent(Student newStudent){

        AllStudentsList.add(newStudent);

    }


    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", AllStudentsList=" + AllStudentsList +
                '}';
    }
}
