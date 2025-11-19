package com.project.student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<student> students = new ArrayList<>();

    // CREATE
    public void addStudent(student s) {
        students.add(s);
        try {
            DatabaseManager.insertStudent(s);
            System.out.println("Student added successfully.");
        } catch (Exception e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    // READ
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        students.forEach(System.out::println);
    }

    // UPDATE
    public void updateStudent(int id, String name, String course, int marks) {
        for (student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setCourse(course);
                s.setMarks(marks);
                try {
                    DatabaseManager.updateStudent(s);
                    System.out.println("Student updated.");
                } catch (Exception e) {
                    System.out.println("DB Error: " + e.getMessage());
                }
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // DELETE
    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
        try {
            DatabaseManager.deleteStudent(id);
            System.out.println("Student deleted.");
        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }
    }
}