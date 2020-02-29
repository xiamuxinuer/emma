package Day55;

import java.util.List;

public class CourseX {

    String topic;
    List<Student> studentList;


    public CourseX(String topic, List<Student> studentList) {
        this.topic = topic;
        this.studentList = studentList;
    }


    @Override
    public String toString() {
        return "CourseX{" +
                "topic='" + topic + '\'' +
                ", studentList=" + studentList +
                '}';
    }








}
