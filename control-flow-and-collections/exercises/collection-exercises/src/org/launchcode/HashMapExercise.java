package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExercise {
    public static void main(String[] args) {
        HashMap<Integer,String> classRoster = new HashMap<>();
    Scanner input = new Scanner(System.in);
    int id;
    String newStudent;
        System.out.println("Enter your Id: (Enter to finish: ");
    do{

        System.out.print("Student: ");
        newStudent = input.nextLine();

        if (!newStudent.equals("")) {
            System.out.print("ID: ");
            Integer newID = input.nextInt();
            classRoster.put(newID, newStudent);

            input.nextLine();
        }
    } while(!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
//        Map<Integer, String> roster = new HashMap<>();
//
//        // Function to add a student to the roster
//        // Takes student ID (integer) and student name (string)
//        // and adds them to the roster
//        addStudent(roster, 1, "John");
//        addStudent(roster, 2, "Jane");
//        addStudent(roster, 3, "Alice");
//
//        // Print the roster
//        printRoster(roster);
//    }
//
//    // Function to add a student to the roster
//    private static void addStudent(Map<Integer, String> roster, int studentId, String studentName) {
//        roster.put(studentId, studentName);
//    }
//
//    // Function to print the roster
//    private static void printRoster(Map<Integer, String> roster) {
//        System.out.println("Student Roster:");
//        for (Map.Entry<Integer, String> entry : roster.entrySet()) {
//            int studentId = entry.getKey();
//            String studentName = entry.getValue();
//            System.out.println("ID: " + studentId + ", Name: " + studentName);
        }
 }
//}


