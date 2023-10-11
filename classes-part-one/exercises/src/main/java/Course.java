//package org.example;  // Assuming the same package as the Student class

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseCode;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void addStudentToCourse(Student student) {
        enrolledStudents.add(student);
    }

    // You can add more methods as needed

    @Override
    public String toString() {
        return "Course Information: Name=" + courseName + ", Code=" + courseCode;
    }
}
