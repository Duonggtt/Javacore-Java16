package run;

import entity.Student;
import logicHandle.StudentHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    static ArrayList<Student> students = new ArrayList<>();
    static StudentHandle studentHandle = new StudentHandle();
    static Student student = new Student();
    public static void main(String[] args) {
        student = studentHandle.studentInput();
        students.add(student);
        while(true) {
            System.out.println("Bạn có muốn nhập thêm student ko?");
            System.out.println("1. yes");
            System.out.println("2. no");
            int choice = functionHandle();
            boolean isCheck = false;
            switch (choice) {
                case 1:
                    student = studentHandle.studentInput();
                    students.add(student);
                    isCheck = true;
                    break;
                case 2:
                    break;
            }
            if (!isCheck) {
                System.out.println("Danh sách student: ");
                break;
            }
        }
        showStudent(students);
    }

    private static int functionHandle() {
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if(choice > 0 && choice < 3) {
                break;
            }
            System.out.println("Vui lòng chọn thao tác hợp lệ!CHọn lại: ");
        } while (true);
        return choice;
    }

    private static void showStudent(ArrayList<Student> students) {
        studentHandle.studentOutput(students);
    }
}

