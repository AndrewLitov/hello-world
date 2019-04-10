package com.epam.courses.litovshenko.model;


import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String nameOfTeacher; // ФИО преподователя
    private List<Course> teacherCourseList = new ArrayList<Course>(); //перечень курсов преподователя

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }


    //конструктор для создания нового преподователя, аргументы - ФИО преподователя
    public Teacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    //конструктор для создания преподователя, аргументы- ФИО, список курсов
    public Teacher(String nameOfTeacher, List<Course> listOfCoursesTeacer) {
        this.nameOfTeacher = nameOfTeacher;
        this.teacherCourseList = listOfCoursesTeacer;
    }


    //метод для выставления оценки студенту
    //аргументы - ФИО студента, имя курса, оценка
    public void setMark(String nameOfStudent, String nameOfCurse, int mark) {
    }

    //метод для обновления оценки студенту
    //аргументы - ФИО студента, имя курса, оценка
    public void updateMark(String nameOfStudent, String nameOfCurse, int mark) {
    }


    //метод для добавления отзыва студенту
    //аргументы - ФИО студента, имя курса, оценка
    public void addComment(String nameOfStudent, String nameOfCurse, String comment) {
    }

    @Override
    public int hashCode() {

        return (int) (((nameOfTeacher == null) ? 0 : nameOfTeacher.hashCode()) + ((teacherCourseList == null) ? 0 : teacherCourseList.hashCode()));
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "nameOfTeacher='" + nameOfTeacher + '\'' +
                '}';
    }
}
