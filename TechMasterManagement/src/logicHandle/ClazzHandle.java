package logicHandle;

import entity.Center;
import entity.Clazz;
import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ClazzHandle {
    public static ArrayList<Student> students = new ArrayList<>();
    public static Clazz clazz = new Clazz();
    public static Clazz inputInfo() {
        System.out.println("Nhập môn học: ");
        clazz.setSubject(new Scanner(System.in).nextLine());
        System.out.println("Nhập vào thông tin học viên");
        System.out.println("Nhập số học viên :");
        int studentNum = new Scanner(System.in).nextInt();
        for(int i=0;i<studentNum;i++) {
            System.out.println("Học viên thứ " + (i+1));
            Student student = StudentHandle.inputInfo();
            students.add(student);
            clazz.setStudents(students);
        }
        return clazz;
    }


}
