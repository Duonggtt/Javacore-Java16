package run;

import entity.Center;
import entity.Student;
import logicHandle.CenterHandle;
import logicHandle.StudentHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    private static Center center = new Center();

    public static void main(String[] args) {
        while(true) {
            showMenu();
            int functionChoice = functionHandle();
            functionChoose(functionChoice);
        }
    }

    private static void functionChoose(int functionChoice) {
        switch (functionChoice) {
            case 1:
                center = CenterHandle.inputInfo();
                break;
            case 2:
                CenterHandle.outputInfo(center);
                break;
            case 3:
                 StudentHandle.updateStudent();
                break;
            case 4:
                StudentHandle.rankUpdateById();
                break;
            case 5:
                StudentHandle.removeStudent();
                break;
            case 6:
                System.exit(functionChoice);

        }
    }

    private static int functionHandle() {
        int functionChoice;
        do{
            functionChoice = new Scanner(System.in).nextInt();
            if(functionChoice >=1 && functionChoice <=6) {
                break;
            }
            System.out.println("Thao tác không hợp lệ! Vui lòng chọn lại: ");
        }while(true);
        return functionChoice;
    }

    private static void showMenu() {
        System.out.println("======================= TECHMASTER =======================");
        System.out.println("1. Nhập vào thông tin của trung tâm.");
        System.out.println("2. Hiển thị ra thông tin của trung tâm.");
        System.out.println("3. Thêm học viên vào trung tâm.");
        System.out.println("4. Cập nhật học lực của 1 học viên dựa vào id.");
        System.out.println("5. Xóa học viên nghỉ học ra khỏi lớp.");
        System.out.println("6. Thoát chương trình.");
        System.out.println("============================================================");
        System.out.println("Chọn thao tác: ");
    }

}
