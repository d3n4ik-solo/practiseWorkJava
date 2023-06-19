package com.example.onemoretest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String email;
    private String birthday;
    private int ID;

    public Student(String name, String email, String birthday, int ID) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.ID = ID;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getID() {
        return ID;
    }
}

class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void removeStudent(int ID) {
        for (Student student : students) {
            if (student.getID() == ID) {
                students.remove(student);
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void searchStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student found!");
                System.out.println("Name: " + student.getName());
                System.out.println("Email: " + student.getEmail());
                System.out.println("Birthday: " + student.getBirthday());
                System.out.println("ID: " + student.getID());
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void generateReport() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            for (Student student : students) {
                writer.write("Name: " + student.getName() + "\n");
                writer.write("Email: " + student.getEmail() + "\n");
                writer.write("Birthday: " + student.getBirthday() + "\n");
                writer.write("ID: " + student.getID() + "\n");
                writer.write("\n");
            }
            System.out.println("Report generated successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while generating the report.");
        }
    }
}
