package run;

import entity.Center;
import logicHandle.CenterHandle;
import logicHandle.StudentHandle;

import java.text.ParseException;
import java.util.Scanner;

public class MainRun {
    static Center center;

    public static void main(String[] args) throws ParseException {
        while(true) {
            showMenu();
            int functionChoice = functionHandle();
            functionChoose(functionChoice);
        }
    }

    private static void functionChoose(int functionChoice) throws ParseException {
        CenterHandle centerHandle = new CenterHandle();
        StudentHandle studentHandle = new StudentHandle();
        switch (functionChoice) {
            case 1:
                center = centerHandle.centerInput();
                break;
            case 2:
                centerHandle.centerOutput(center);
                break;
            case 3:
                studentHandle.updateStudent(center);
                break;
            case 4:
                studentHandle.updateStudentRankById(center);
                break;
            case 5:
                studentHandle.removeStudentById(center);
                break;
            case 6:
                System.exit(functionChoice);

        }
    }

    private static int functionHandle() {
        int functionChoice;
        do{
            try{
                functionChoice = new Scanner(System.in).nextInt();
                if(functionChoice >=1 && functionChoice <=6) {
                    break;
                }
                System.out.println("Thao tác không hợp lệ! Vui lòng chọn lại: ");
            }catch(Exception e){
                System.out.println("Invalid input type! import again: ");
            }
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
