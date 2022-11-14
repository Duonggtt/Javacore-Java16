package LogicHandle;

import Run.MainRun;
import entity.Student;
import entity.Subject;
import entity.Transcript;
import entity.TranscriptDetail;

import java.util.Scanner;

public class TranscriptLogic {

    public static void transcriptLogicHandle() {
        if(!checkDetail()) {
            System.out.println("Vui lòng nhập thông tin sinh viên và môn học trước!");
            return;
        }
        System.out.println("Nhập vào số lượng sinh viên muốn thêm vào bảng: ");
        int studentNumber;
        do {
            studentNumber = new Scanner(System.in).nextInt();
            if (studentNumber <= MainRun.studentCount) {
                break;
            }
            System.out.println("Số lượng sinh viên muốn thêm vào bảng vượt quá số lượng sinh viên hiện có! Vui lòng nhập lại!");
        } while (true);
        for (int i = 0; i < studentNumber; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + " : ");
            System.out.println("Nhập mã sinh viên : ");
            Student student = null;
            int studentId;
            do {
                studentId = new Scanner(System.in).nextInt();
                for (int j = 0; j <= MainRun.students.length; j++) {
                    if (MainRun.students[j] != null && MainRun.students[j].getId() == studentId) {
                        student = MainRun.students[j];
                        break;
                    }
                }
                if (student != null) {
                    break;
                }
                System.out.println("Mã sinh viên không tồn tại! Vui lòng nhập lại!");
            } while (true);
            System.out.println("Nhập số môn học muốn thêm vào bảng: ");
            int subjectNumber;
            do {
                subjectNumber = new Scanner(System.in).nextInt();
                if (subjectNumber <= MainRun.subjectCount) {
                    break;
                }
                System.out.println("Số lượng môn học bạn nhập vượt quá số lượng môn học đã có! Vui lòng nhập lại!");
            } while (true);
            System.out.println("Nhập mã môn học của sinh viên thứ " + (i + 1) + " : ");
            int subjectId;
            TranscriptDetail[] detail = new TranscriptDetail[subjectNumber];
            int count = 0;
            double total = 0;
            Subject subject = null;
            do {
                subjectId = new Scanner(System.in).nextInt();
                for (int j = 0; j <= MainRun.subjects.length; j++) {
                    if (MainRun.subjects[j] != null && MainRun.subjects[j].getSubjectId() == subjectId) {
                        subject = MainRun.subjects[j];
                        break;
                    }
                }
                if (subject != null) {
                    break;
                }
                System.out.println("Mã môn học không tồn tại! Vui lòng nhập lại!");
            } while (true);
            System.out.println("Nhập điểm của môn học đó: ");
            int subjectPoint;
            do {
                subjectPoint = new Scanner(System.in).nextInt();
                if (subjectPoint >= 0 && subjectPoint <= 10) {
                    break;
                }
                System.out.println("điểm bạn nhập không hợp lệ !! Vui lòng nhập trong khoảng từ 0-10!");
            } while (true);
            detail[count] = new TranscriptDetail(subject, subjectPoint);
            count++;
            total += subjectPoint / subjectNumber;
            for(int j = 0;j<detail.length-1;i++) {
                for(int k=j+1;k<detail.length;k++) {
                    TranscriptDetail detail1 = detail[i];
                    TranscriptDetail detail2 = detail[i];
                    if(detail1.getPoint() > detail2.getPoint()) {
                        TranscriptDetail temp = detail1;
                        detail1 = detail2;
                        detail2 = temp;
                    }
                }
            }
            //luu gia tri
            Transcript transcript = new Transcript(student, detail);
            transcript.setTotalPoint(total);
            saveTranscriptManagement(transcript);
        }
    }

    private static boolean checkDetail() {
        boolean isValidstudent = false;
        for(int i=0;i<MainRun.students.length;i++) {
            if(MainRun.students[i] != null) {
                isValidstudent = true;
                break;
            }
        }
        boolean isValidSubject = false;
        for(int i=0;i<MainRun.subjects.length;i++) {
            if(MainRun.subjects[i] != null) {
                isValidSubject = true;
                break;
            }
        }
        return isValidstudent && isValidSubject;
    }

    private static void saveTranscriptManagement(Transcript transcript) {
        for (int i = 0; i < MainRun.transcripts.length; i++) {
            if (MainRun.transcripts[i] == null) {
                MainRun.transcripts[i] = transcript;
                break;
            }
        }
    }

    public static void showTranscriptManagement() {
        System.out.println("\n\n=========================== BẢNG DANH SÁCH ĐIỂM CỦA SINH VIÊN ===========================\n");
        for (int i = 0; i < MainRun.transcripts.length; i++) {
            if (MainRun.transcripts[i] != null) {
                System.out.println(MainRun.transcripts[i]);
            }
        }
        System.out.println("\n=========================================================================================\n\n");
    }

    public static void sortTranscript() {
        System.out.println("Chọn phương thức sắp xếp: ");
        System.out.println("1. Sắp xếp theo tên sinh viên.");
        System.out.println("2. Sắp xếp theo tên môn học.");
        System.out.println("3. Thoát.");
        int sortFunctionChoice;
        do {
            sortFunctionChoice = new Scanner(System.in).nextInt();
            if (sortFunctionChoice >=1 && sortFunctionChoice <=3) {
                break;
            }
            System.out.println("Phương thức sắp xếp không hợp lệ! Vui lòng chọn lại!");
        }while(true);
        switch (sortFunctionChoice) {
            case 1:
                sortByName();
                showTranscriptManagement();
                break;
            case 2:
                sortBySubjectName();
                break;
            case 3:
                return;
        }
    }

    private static void sortBySubjectName() {
        showTranscriptManagement();
    }

    private static void sortByName() {
        for(int i=0;i<MainRun.transcripts.length-1;i++){
            for(int j=i+1;j<MainRun.transcripts.length;j++) {
                Transcript transcript1 = MainRun.transcripts[i];
                Transcript transcript2 = MainRun.transcripts[j];
                if(transcript1.getStudent().getName().compareTo(transcript1.getStudent().getName()) > 0) {
                    Transcript temp = transcript1;
                    transcript1 = transcript2;
                    transcript2 = temp;
                }
            }
        }
    }

    public static void totalTranscript() {
        for(int i=0;i<MainRun.transcripts.length;i++) {
            Transcript transcript = new Transcript();
            System.out.println("Điểm tổng kết của sinh viên tên " + MainRun.students[i].getName() + " la: " + transcript.totalPoint);
        }
    }
}
