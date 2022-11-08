import entity.Student;
import entity.Subject;

import java.util.Scanner;

public class MainRun {

    public static Student[] students = new Student[1000];
    public static Subject[] subjects = new Subject[1000];

    public static void main(String[] args) {

        while(true) {
            showMenu();
            int studentChoices = choicesHandle();
            chooseFunction(studentChoices);

        }
    }

    private static void chooseFunction(int studentChoices) {
        switch (studentChoices) {
            case 1:
                System.out.println("Nhập số lượng sinh viên cần thêm!");
                int studentNum = new Scanner(System.in).nextInt();
                studentInput(studentNum);
                break;
            case 2:
                System.out.println("============= XUẤT DANH SÁCH SINH VIÊN =============");
                studentOutput();
                System.out.println("====================================================");
                break;
            case 3:
                System.out.println("Nhập số lượng môn học cần thêm!");
                int subjectNum = new Scanner(System.in).nextInt();
                subjectInput(subjectNum);
                break;
            case 4:
                System.out.println("============= XUẤT DANH SÁCH MÔN HỌC =============");
                subjectOutput();
                System.out.println("====================================================");
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                System.exit(studentChoices);
        }
    }

    private static int choicesHandle() {
        int studentChoices;
        do{
            studentChoices = new Scanner(System.in).nextInt();
            if(studentChoices >=1 && studentChoices <=8) {
                break;
            }
            System.out.println("Thao tác bạn chọn không hợp lệ! Vui lòng chọn lại!");
        }while(true);
        return studentChoices;
    }

    private static void showMenu() {
        System.out.println("============= QUẢN LÝ DANH SÁCH SINH VIÊN =============");
        System.out.println("1. Nhập danh sách sinh viên mới.");
        System.out.println("2. Xuất danh sách sinh viên.");
        System.out.println("3. Nhập danh sách môn học mới.");
        System.out.println("4. Xuất danh sách môn học.");
        System.out.println("5. Nhập điểm cho sinh viên đã có trong danh sách.");
        System.out.println("6. Xuất danh sách điểm sinh viên.");
        System.out.println("7. Sắp xếp danh sách bảng điểm.");
        System.out.println("8. Tính điểm tổng kết chung cho mỗi sinh viên.");
        System.out.println("9. Thoát chương trình!");
        System.out.print("Vui lòng chọn thao tác bạn muốn thực hiện! : ");
    }

    private static void subjectInput(int subjectNum) {
        for(int i =0;i<subjectNum;i++) {
            System.out.println("Môn học thứ " + (i+1) + " : ");
            Subject subject = new Subject();
            subject.NhapThongTinSJ();
            for(int j=0;j<subjectNum;j++) {
                if(subjects[i] == null) {
                    subjects[i] = subject;
                }
            }
        }
    }

    private static void studentInput(int studentNum) {
        for(int i =0;i<studentNum;i++) {
            System.out.println("Sinh viên thứ " + (i+1) + " : ");
            Student student = new Student();
            student.NhapThongTinSV();
            for(int j=0;j<studentNum;j++) {
                if(students[i] == null) {
                    students[i] = student;
                }
            }
        }
    }

    private static void studentOutput() {
        for(int i=0;i<students.length;i++) {
            if(students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    private static void subjectOutput() {
        for(int i=0;i<subjects.length;i++) {
            if(subjects[i] != null) {
                System.out.println(subjects[i]);
            }
        }
    }
}
