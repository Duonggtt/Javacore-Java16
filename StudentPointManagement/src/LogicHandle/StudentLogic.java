package LogicHandle;

import Run.MainRun;
import com.sun.tools.javac.Main;
import entity.Student;

import java.util.Scanner;

public class StudentLogic {

    public static void studentInput() {
        System.out.println("Nhập số lượng sinh viên muốn thêm: ");
        int studentNum = new Scanner(System.in).nextInt();
        for(int i=0;i< studentNum;i++) {
            System.out.println("Sinh viên thứ " + (i+1) + " : ");
            Student student = new Student();
            student.inputInfo();
            for(int j=0;j<MainRun.students.length;j++) {
                if(MainRun.students[j] == null) {
                    MainRun.students[j] = student;
                    break;
                }
            }
        }
        MainRun.studentCount+= studentNum;
    }

    public static void studentOutput() {
        System.out.println("\n\n==================== XUẤT DANH SÁCH SINH VIÊN ====================\n");
        for (int i = 0; i < MainRun.students.length; i++) {
            if(MainRun.students[i] != null) {
                System.out.println(MainRun.students[i]);
            }
        }
        System.out.println("\n================================================================\n\n");
    }
}
