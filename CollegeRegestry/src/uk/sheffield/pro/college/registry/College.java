package uk.sheffield.pro.college.registry;

import java.util.ArrayList;

public class College {
    private String collegeName;             // college name; the college should have a name, shouldn't it?
    private ArrayList<Student> students;    // a "container" for college students

    public College(String name) {
        this.collegeName = name;
        this.students = new ArrayList<>();
    }

    // add a student to the college
    public void addStudent(String name, String surname) {
        Student std = new Student(name,surname);
        this.students.add(std);
    }
}
