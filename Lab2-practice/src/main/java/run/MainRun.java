/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.run;


import java.util.ArrayList;
import java.util.Scanner;


import main.java.entity.Student;
import main.java.logicHandle.StudentHandle;

public class MainRun {
    static ArrayList<Student> students = new ArrayList<>();
    static Student student = new Student();
    public static void main(String[] args) {
        StudentHandle studentHandle = new StudentHandle();
        System.out.println("Nhap so luong student ban muon : ");
        int studentNum = Integer.parseInt(new Scanner(System.in).nextLine());
        for(int i =0;i<studentNum;i++) {
            student = studentHandle.studentInput();
            students.add(student);
            for(int j =0;j<students.size();j++) {
                studentHandle.avgScore(student);
                studentHandle.studentRank(student);
            }
        }
        studentHandle.studentOutput(students);
    }
}
