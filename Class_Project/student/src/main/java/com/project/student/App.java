package com.project.student;

/**
 * Hello world!
 *
 */
//package com.project.Student_Result;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT RESULT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Course: ");
                    String course = sc.nextLine();
                    System.out.print("Marks: ");
                    int marks = sc.nextInt();
                    service.addStudent(new student(id, name, course, marks));
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String n = sc.nextLine();
                    System.out.print("New Course: ");
                    String c = sc.nextLine();
                    System.out.print("New Marks: ");
                    int m = sc.nextInt();
                    service.updateStudent(uid, n, c, m);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();
                    service.deleteStudent(did);
                    break;

                case 5:
                    System.out.println("Exit...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}