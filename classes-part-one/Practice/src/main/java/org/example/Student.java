package org.example;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return this.name + " has a GPA of: " + this.gpa;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double currentQualityScore = this.gpa * this.numberOfCredits;
        double courseQualityScore = grade * courseCredits;
        this.numberOfCredits += courseCredits;
        this.gpa = (currentQualityScore + courseQualityScore) / this.numberOfCredits;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits < 30) {
            return "Freshman";
        } else if (this.numberOfCredits < 60) {
            return "Sophomore";
        } else if (this.numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    // Getters and setters omitted

    public static void main(String[] args) {
        // Example of using the Student class
        Student student1 = new Student("Alice", 1);
        student1.addGrade(3, 4.0);
        student1.addGrade(2, 3.5);
        System.out.println(student1.studentInfo()); // Should display GPA
        System.out.println("Grade Level: " + student1.getGradeLevel()); // Should display "Freshman"
    }
}

