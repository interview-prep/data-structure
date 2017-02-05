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

    @Override
    public String toString() {
        return name + " " + grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (grade != student.grade) return false;
        return name.equals(student.name);

    }

    @Override
    public int hashCode() {
        int result = grade;
        result = 31 * result + name.hashCode();
        return result;
    }
}
