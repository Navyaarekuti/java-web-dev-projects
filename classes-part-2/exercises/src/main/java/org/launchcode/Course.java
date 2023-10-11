package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;
import org.launchcode.Teacher;
public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        return "Course{" +
                "topic='" + topic + '\'' +
                ", instructor=" + instructor +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (!Objects.equals(topic, course.topic)) return false;
        if (!Objects.equals(instructor, course.instructor)) return false;
        return Objects.equals(enrolledStudents, course.enrolledStudents);
    }

    @Override
    public int hashCode() {
        int result = topic != null ? topic.hashCode() : 0;
        result = 31 * result + (instructor != null ? instructor.hashCode() : 0);
        result = 31 * result + (enrolledStudents != null ? enrolledStudents.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        // Create a teacher
        Teacher instructor = new Teacher("John", "Doe", "Math", 10);

        // Create a course and associate the teacher
        Course mathCourse = new Course("Mathematics", instructor);

        // Create students
        Student student1 = new Student("Alice", 1, 30, 3.5);
        Student student2 = new Student("Bob", 2, 45, 3.8);

        // Add students to the course
        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        // Print course information
        System.out.println(mathCourse);
    }
}
