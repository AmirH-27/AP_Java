package com.model;

public class Course {
    private int course_id;
    private String course_name;
    private String course_code;

    public Course(int course_id, String course_name, String course_code) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_code = course_code;
    }

    //setter
    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }
    //getter
    public int getCourse_id() {
        return course_id;
    }
    public String getCourse_name() {
        return course_name;
    }
    public String getCourse_code() {
        return course_code;
    }
}
