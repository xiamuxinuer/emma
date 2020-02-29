package MuhtarTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class AssociationExample {
    public static void main(String[] args) {


        Student s1 = new Student("emma");
        Student s2 = new Student("akbar");
        Student s3 = new Student("dilida");
        Student s4 = new Student("queen");
        Student s5 = new Student("seda");

        List<Student> CybertekStudents=new ArrayList<>();
        CybertekStudents.addAll(Arrays.asList(s1,s2,s3,s4,s5));


        School o=new School("Cybertek",CybertekStudents);
        CybertekStudents.add(new Student("denis"));
        CybertekStudents.add(new Student("Irina"));

        for (Student eachStudent:CybertekStudents
             ) {
            System.out.println(eachStudent);
        }






    }
}