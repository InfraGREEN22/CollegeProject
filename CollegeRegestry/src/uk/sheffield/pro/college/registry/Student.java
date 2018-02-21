package uk.sheffield.pro.college.registry;

import java.util.Random;

public class Student {
    private String firstName;   // student name
    private String familyName;  // student surname
    private int id;             // student id
    private String programme;   // either FIY or PMP
    private double gpa;         // student's GPA

    // constructor
    public Student(String name, String surname) {
        this.firstName = name;
        this.familyName = surname;
        Random id = new Random();
        this.setId(id.nextInt((999999-100000)+1)+100000);  //setting a random number from 100000 to 999999 to make it more unique
    }

    /////////////////////////////////////////////////
    //                   GETTERS                   //
    /////////////////////////////////////////////////

    // get full student's name (both first name and family name)
    public String getFullName() {
        return (this.firstName + " " + this.familyName);
    }

    // get student's name
    public String getName() {
        return this.firstName;
    }

    // get student's surname
    public String getSurname() {
        return this.familyName;
    }

    // get student's programme
    public String getProgramme() {
        return this.programme;
    }

    // get student's id
    public int getId() {
        return this.id;
    }

    // get student's GPA
    public double getGpa() {
        return gpa;
    }

    /////////////////////////////////////////////////
    //                   SETTERS                   //
    /////////////////////////////////////////////////

    // set student's first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // set student's family name
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    // set student's full name (both first and family names); just in case
    public void setFullName(String name, String surname) {
        this.firstName = name;
        this.familyName = surname;
    }

    // set student's id
    public void setId(int id) {
        this.id = id;
    }

    // set student's GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // set student's programme (either FIY or PMP)
    public void setProgramme(String programme) {
        this.programme = programme;
    }
}
