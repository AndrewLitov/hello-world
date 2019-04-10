package com.epam.courses.litovshenko.model;


import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName; // имя курса
    private Teacher teacherName; //преподователь, который ведет курс
    private List<Student> studentsList = new ArrayList<Student>(); //список студентов на курсе


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    //метод для получения списка всех студентов данного курса
    public List<String> getStudentCourseList() {
        List<String> studentCourseList = new ArrayList<String>();
        return studentCourseList;
    }


    @Override
    public int hashCode() {

        return (int) (((courseName == null) ? 0 : courseName.hashCode()) + ((teacherName == null) ? 0 : teacherName.hashCode()) + ((studentsList == null) ? 0 : studentsList.hashCode()));
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", teacherName=" + teacherName + '}';
    }
}
