package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.

// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }
    private void setStudentId(int studentId){
        this.studentId = studentId;
    }

    private void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String getName(){
        return name;
    }
    private int getStudentId(){
        return studentId;
    }

    private double getGpa(){
        return gpa;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }


    }


