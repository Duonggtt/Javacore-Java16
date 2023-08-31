package run;

import entity.School;
import entity.Student;
import logicHandle.schoolLogicHandle;
import logicHandle.studentLogicHandle;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<School> schools = new ArrayList<>();
    public static int studentCount = 0;

    public static void main(String[] args) throws ParseException {
        while(true) {
            showMenu();
            int functionChoice = functionHandle();
            functionChoose(functionChoice);
        }

    }

    private static void functionChoose(int functionChoice) throws ParseException {
        switch (functionChoice) {
            case 1:
                studentLogicHandle.addStudent();
                break;
            case 2:
                studentLogicHandle.showStudent();
                break;
            case 3:
                schoolLogicHandle.schoolFileManager();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.exit(functionChoice);

        }
    }

    private static int functionHandle() {
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if(functionChoice >=1 && functionChoice <=6) {
                break;
            }
            System.out.println("Vui lòng chọn thao tác hợp lệ! Chọn lại: ");
        }while(true);
        return functionChoice;
    }

    private static void showMenu() {
        System.out.println("\n\n===================== CHƯƠNG TRÌNH QUẢN LÝ HỌC SINH TRƯỜNG THPT =====================\n");
        System.out.println("1. Nhập vào danh sách học sinh.");
        System.out.println("2. Xuất danh sách học sinh.");
        System.out.println("3. Tạo bảng quản lý học sinh.");
        System.out.println("4. Lấy ra những học sinh sinh năm 1985 và quê ở Thái Nguyên.");
        System.out.println("5. Lấy ra những học sinh sinh học lớp 10A1.");
        System.out.println("6. Thoát chương trình.");
        System.out.println("\n===========================================================================================\n");
        System.out.println("Chọn thao tác: ");
    }

}
