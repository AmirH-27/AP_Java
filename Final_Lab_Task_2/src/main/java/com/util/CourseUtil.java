package com.util;
import com.model.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseUtil {
    public List<Course> getAll() {
        List<Course> courses =
                new ArrayList<>();
        courses.add(new Course(1, "Java", "3301"));
        courses.add(new Course(2, "Python", "3302"));
        courses.add(new Course(3, "C++", "3303"));
        courses.add(new Course(4, "C#", "3304"));
        return courses;
    }
}
