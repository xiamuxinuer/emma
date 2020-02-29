package Day55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CourseXAction {
    public static void main(String[] args) {


        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("emma",123));
        studentList.add(new Student("akbar",100));

        CourseX x=new CourseX("selenium",studentList);
        System.out.println(x);











    }
}
