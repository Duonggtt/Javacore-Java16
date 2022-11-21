package run;

import entity.Student;
import logicHandle.StudentHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        StudentHandle studentHandle = new StudentHandle();
        Student student = new Student();

            student = studentHandle.studentInput();
            students.add(student);
            while(true) {
                boolean isCheck = false;
                System.out.println("Bạn có muốn nhập thêm student ko?");
                System.out.println("1. yes");
                System.out.println("2. no");
                int choice;
                do {
                    choice = new Scanner(System.in).nextInt();
                    if (choice > 0 && choice < 3) {
                        break;
                    }
                    System.out.println("Vui lòng chọn 1 trong 2: ");
                } while (true);
                switch (choice) {
                    case 1:
                        student = studentHandle.studentInput();
                        students.add(student);
                        isCheck = true;
                        break;
                    case 2:
                        break;
                }
                if (isCheck) {
                    continue;
                }
                break;
            }
        System.out.println(students);

    }

}
