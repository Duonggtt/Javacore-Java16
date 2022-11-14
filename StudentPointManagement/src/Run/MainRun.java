package Run;

import LogicHandle.StudentLogic;
import LogicHandle.SubjectLogic;
import LogicHandle.TranscriptLogic;
import entity.Student;
import entity.Subject;
import entity.Transcript;

import java.util.Scanner;

import static LogicHandle.TranscriptLogic.showTranscriptManagement;

public class MainRun {

    public static Student[] students = new Student[1000];
    public static Subject[] subjects = new Subject[1000];
    public static Transcript[] transcripts = new Transcript[1000];
    public static int studentCount = 0;
    public static int subjectCount = 0;

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
                StudentLogic.studentInput();
                break;
            case 2:
                StudentLogic.studentOutput();
                break;
            case 3:
                SubjectLogic.subjectInput();
                break;
            case 4:
                SubjectLogic.subjectOutput();
                break;
            case 5:
                TranscriptLogic.transcriptLogicHandle();
                showTranscriptManagement();
                break;
            case 6:
                TranscriptLogic.sortTranscript();
                break;
            case 7:
                TranscriptLogic.totalTranscript();
                break;
            case 8:
                System.exit(functionChoice);
        }
    }


    private static int functionHandle() {
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if(functionChoice >=1 && functionChoice <=8) {
                break;
            }
            System.out.println("Thao tác không hợp lệ!Vui lòng chọn lại!");
        }while(true);
        return functionChoice;
    }

    private static void showMenu() {
        System.out.println("\n\n============================ CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ============================\n");
        System.out.println("1. Nhập vào danh sách sinh viên.");
        System.out.println("2. Xuất danh sách sinh viên.");
        System.out.println("3. Nhập vào danh sách môn học.");
        System.out.println("4. Xuất danh sách sinh viên.");
        System.out.println("5. Lập bảng điểm sinh viên.");
        System.out.println("6. Sắp xếp bảng danh sách điểm sinh viên.");
        System.out.println("7. Tính điểm tổng kết cho mỗi sinh viên.");
        System.out.println("8. Thoát chương trình.");
        System.out.println("\n====================================================================================\n");
        System.out.print("\nChọn thao tác bạn muốn thực hiện: ");
    }

}
