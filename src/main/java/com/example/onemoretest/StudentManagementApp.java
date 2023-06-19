package com.example.onemoretest;

import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter student birthday: ");
                    String birthday = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    int ID = scanner.nextInt();
                    scanner.nextLine();
                    system.addStudent(new Student(name, email, birthday, ID));
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int removeID = scanner.nextInt();
                    scanner.nextLine();
                    system.removeStudent(removeID);
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    system.searchStudent(searchName);
                    break;
                case 4:
                    system.generateReport();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 5);

        scanner.close();
    }
}