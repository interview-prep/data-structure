package com.sandeep.interview.collections.arrays;

/**
 * Created by Sandeep on 2/5/2017.
 */

public class Student {

    private int grade;
    private String name;

    public Student(String name, int grade) {
        this.grade = grade;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
