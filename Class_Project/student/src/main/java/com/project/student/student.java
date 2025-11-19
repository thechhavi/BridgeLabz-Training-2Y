package com.project.student;

public class student {
    private int id;
    private String name;
    private String course;
    private int marks;

    public student(int id, String name, String course, int marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public int getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setCourse(String course) { this.course = course; }
    public void setMarks(int marks) { this.marks = marks; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + course + " | Marks: " + marks;
    }
}