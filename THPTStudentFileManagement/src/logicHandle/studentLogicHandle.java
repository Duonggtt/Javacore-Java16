package logicHandle;

import entity.Student;
import run.MainRun;

import java.util.ArrayList;
import java.util.Scanner;

public class studentLogicHandle {

    public static ArrayList<Student> students = new ArrayList<>();
    public static Student student = new Student();
    public static void addStudent() {
        System.out.println("Nhập vào số học sinh cần quản lý: ");
        int studentNum = new Scanner(System.in).nextInt();
        for(int i = 0;i < studentNum;i++) {
            System.out.println("Học sinh thứ: " + (i+1) + " : ");
            students.add(Student.studentInput());
        }
        MainRun.studentCount += studentNum;
    }

    public static void showStudent() {
        for ( Student i : students) {
            System.out.println(i);
        }
    }
}
