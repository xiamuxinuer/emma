package Day55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {


        List<String>  list=new ArrayList<>(Arrays.asList("emma","muge","hassan"));

        Course java=new Course("coding",list);
        System.out.println(java);

        java.studentNames.add("jannet");
        System.out.println(java);
        System.out.println(java.studentNames);

        java.studentNames.addAll(Arrays.asList("akbar","denny","kama"));

        System.out.println(java.studentNames);

        java.addStudent("emma");
        System.out.println(java.studentNames);

        java.addManyStudent(Arrays.asList("lale","hajim","gulnar"));
        System.out.println(java.studentNames);






    }
}
