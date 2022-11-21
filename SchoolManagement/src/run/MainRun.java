package run;

import entity.Clazz;
import entity.School;
import entity.Student;
import logicHandle.ClazzHandle;
import logicHandle.SchoolHandle;
import logicHandle.StudentHandle;

import java.text.ParseException;
import java.util.Scanner;

public class MainRun {
    static School school;
    public static void main(String[] args) throws ParseException {

        SchoolHandle handle = new SchoolHandle();
        while(true) {
            showMenu();
            int functionChoice = functionHandle();


            functionchoose(functionChoice);
        }
    }

    private static void functionchoose(int functionChoice) throws ParseException {
        SchoolHandle schoolHandle = new SchoolHandle();
        ClazzHandle clazzHandle = new ClazzHandle();
        //SchoolHandle schoolHandle = new SchoolHandle(); // =ưư nãy em làm thế nhưng mà nó lại ko dùng đc cái dòng gán cái nhập vào shool ấy a no bị tắt đi:v
        switch (functionChoice) {
            case 1:
                school = schoolHandle.schoolInput();
;               break;
            case 2:
                // nó báo là schoolHandle chưa đk khởi tạo - > e đã khởi tạo đâuem tưởng bên trên dùng đc chứ ạ
                schoolHandle.schoolOutput(school);
                break;
            case 3:
                schoolHandle.getStudentByDobAndAdress(school);
                break;
            case 4:
                schoolHandle.getStudentByClassName(school);
                break;
            case 5:
                System.exit(functionChoice);
        }
    }

    private static int functionHandle() {
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if(functionChoice >=1 && functionChoice <=5) {
                break;
            }
            System.out.println("Thao tác hông hợp lệ Vui lòng chọn lại: ");
        }while(true);
        return functionChoice;
    }

    private static void showMenu() {
        System.out.println("================== Shool Management ==================");
        System.out.println("1. Nhập vào thông tin trường học.");
        System.out.println("2. In ra thông tin trường học.");
        System.out.println("3. In ra thông tin học sinh sinh năm 1985 và quê ở thái nguyên.");
        System.out.println("4. In ra thông tin học sinh sinh học lớp 10A1");
        System.out.println("5. Thoát");
        System.out.println("Chọn thao tác: ");
    }

}
