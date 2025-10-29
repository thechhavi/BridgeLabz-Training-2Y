package com.university.department.cse;

public class Course {
    private String courseName;
    private String courseCode;

    // Constructor
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Method to display details
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}
