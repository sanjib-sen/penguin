package com.penguin.model;

public class Course{
    public String teachersName;
    public String courseName;
    public Routine routine;
    public Course(String course, String teacher){
        this.courseName = course;
        this.teachersName = teacher;
        this.routine = null;
    }
}