package com.epam.courses.litovshenko.model;

import java.util.ArrayList;
import java.util.List;


public class Student {

    private String nameOfStudent; // ФИО студента


    private List<String> coursesList = new ArrayList<String>(); //перечень курсов студента
    private List<Integer> marksList = new ArrayList<Integer>(); //перечень оценок студента
    private List<String> commentsList = new ArrayList<String>(); //перечень комментариев студента


    //конструктор для создания студента
    //параметр - ФИО студента
    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    // метод для записи студента на один или несколько курсов
    public void signUpCourses(String... nameOfCurses) {
    }

    //метод для получения списка всех курсов студента
    public List<String> getStudentCourseList() {
         List<String> studentCourseList = new ArrayList<String>();

        return studentCourseList;
    }


    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }


    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", coursesList=" + coursesList +
                '}';
    }


    @Override
    public int hashCode() {
        return (int) (((nameOfStudent == null) ? 0 : nameOfStudent.hashCode()) + ((coursesList == null) ? 0 : coursesList.hashCode()) + ((marksList == null) ? 0 : marksList.hashCode()) + ((commentsList == null) ? 0 : commentsList.hashCode()));
    }
}
