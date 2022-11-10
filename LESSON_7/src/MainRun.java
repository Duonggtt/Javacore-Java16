import entity.LessonManagement;
import entity.LessonManagermentDetail;
import entity.Subject;
import entity.Teacher;

import java.util.Scanner;

public class MainRun {

    public static Teacher[] teachers = new Teacher[1000];
    public static Subject[] subjects = new Subject[1000];
    public static LessonManagement[] lessonManagements = new LessonManagement[1000];

    public static void main(String[] args) {
        while(true) {
            showMenu();
            int functionChoices = choosehandle();
            functionMenu(functionChoices);

        }
    }

    private static void functionMenu(int functionChoices) {
        switch (functionChoices) {
            case 1:
                System.out.println("Nhập vào số lượng môn học cần thêm: ");
                subjectInput();
                break;
            case 2:
                System.out.println("Xuất ra danh sách môn học: ");
                subjectOutput();
                break;
            case 3:
                System.out.println("Nhập vào số lượng giảng viên cần thêm: ");
                teacherInput();
                break;
            case 4:
                System.out.println("Xuất ra danh sách giảng viên: ");
                teacherOuput();
                break;
            case 5:
                lessonManagement();
                showLessonManagement();
                break;
            case 6:
                System.out.println("Sắp xếp danh sách kê khai giảng dạy: Theo họ tên giảng viên");
                sortLessonManagementByName(lessonManagements);
                showLessonManagement();
                break;
            case 7:
                break;
            case 8:
                return;


        }
    }

    private static void sortLessonManagementByName(LessonManagement[] lessonManagements) {
        for (int i =0;i<lessonManagements.length;i++) {
            for(int j=i+1;j<lessonManagements.length ;j++) {
                LessonManagement temp  = lessonManagements[i];
                if(lessonManagements[i].getTeacher().getName().compareTo(lessonManagements[j].getTeacher().getName()) > 0) {
                    temp = lessonManagements[i];
                    lessonManagements[i] = lessonManagements[j];
                    lessonManagements[j] = temp;
                }
            }
        }
    }


    private static void showLessonManagement() {
        for (int i = 0; i < lessonManagements.length; i++) {
            if(lessonManagements[i] != null) {
                System.out.println(lessonManagements[i]);
            }
        }
    }

    private static void lessonManagement() {
        if(teachers.length == 0 || subjects.length == 0) {
            System.out.println("Vui lòng nhập thông tin môn học và giảng viên!!");
            return;
        }
        System.out.println("Nhập số giảng viên cần phân công: ");
        int teacherNum = new Scanner(System.in).nextInt();
        Teacher teacher = null;
        for (int i = 0; i < teacherNum; i++) {
            System.out.println("Nhập vào giảng viên số " + (i+1) + " : ");
            System.out.println("Nhập mã giảng viên: ");
            int teacherId;
            do {
                teacherId = new Scanner(System.in).nextInt();
                for(int j=0;j<teachers.length;j++) {
                    if(teachers[j].getId() == teacherId) {
                        teacher = teachers[j];
                        break;
                    }
                }
                if(teacher != null) {
                    break;
                }
                System.out.println("Mã giảng viên khoogn tồn tại!");
            }while(true);
            System.out.println("Phân công giảng viên dạy bao nhiêu môn: ");
            int subjectNum = new Scanner(System.in).nextInt();
            LessonManagermentDetail[] detail = new LessonManagermentDetail[subjectNum];
            int count = 0;
            int tongTiet = 0;
            Subject subject = null;
            for (int j =0;j<subjectNum;j++) {
                System.out.println("Nhập thông tin môn học thứ " + (j+1) + " : ");
                System.out.println("Nhập mã môn học: ");
                int subjectId;
                do {
                    subjectId = new Scanner(System.in).nextInt();
                    for(int k=0;j<subjects.length;k++) {
                        if(subjects[k].getId() == subjectId) {
                            subject = subjects[k];
                            break;
                        }
                    }
                    if(subject != null) {
                        break;
                    }
                    System.out.println("Mã môn học không tồn tại!");
                }while(true);
                System.out.println("Môn này phân công dạy bao nhiêu lớp");
                int classNum;
                //Số lớp cho mỗi môn là số nguyên dương và không lớn hơn 3.
                do {
                    classNum = new Scanner(System.in).nextInt();
                    if(classNum > 0 && classNum <4) {
                        break;
                    }
                    System.out.println("Vui lòng nhập số lớp hợp lệ!");
                }while(true);
                detail[count] = new LessonManagermentDetail(subject,classNum);
                tongTiet += subject.getLessonQuantity() * classNum;
                if(tongTiet > 200) {
                    System.out.println("Số lượng tiết nếu dạy cả môn này vượt quá quy định !");
                    break;
                }
                count++;
            }

            LessonManagement lessonManagement = new LessonManagement(teacher,detail);
            saveLessonInfo(lessonManagement);

        }

    }

    private static void saveLessonInfo(LessonManagement lessonManagement) {
        for(int i=0;i<lessonManagements.length;i++) {
            if(lessonManagements[i] == null) {
                lessonManagements[i] = lessonManagement;
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

    private static void subjectInput() {
        int subjectNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < subjectNum; i++) {
            Subject subject = new Subject();
            subject.InfoInput();
            for(int j=0;j<subjectNum;j++) {
                if(subjects[i] == null) {
                    subjects[i] = subject;
                }
            }
        }
    }

    private static void teacherOuput() {
        for(int i=0;i<teachers.length;i++) {
            if(teachers[i] != null) {
                System.out.println(teachers[i]);
            }
        }
    }

    private static void teacherInput() {
        int teacherNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < teacherNum; i++) {
            Teacher teacher = new Teacher();
            teacher.InfoInput();
            for(int j=0;j<teacherNum;j++) {
                if(teachers[i] == null) {
                    teachers[i] = teacher;
                }
            }
        }
    }

    private static int choosehandle() {
        int functionChoices;
        do{
            functionChoices = new Scanner(System.in).nextInt();
            if(functionChoices >=1 && functionChoices <= 8) {
                break;
            }
            System.out.println("Vui lòng chọn thao tác hợp lệ!");
        }while(true);
        return functionChoices;
    }

    private static void showMenu() {
        System.out.println("\n\n====================CHƯƠNG TRÌNH QUẢN LÝ TRẢ LƯƠNG THỈNH GIẢNG====================");
        System.out.println("1. Nhập danh sách môn học mới.");
        System.out.println("2. In ra danh sách môn học.");
        System.out.println("3. Nhập danh sách giảng viên mới.");
        System.out.println("4. In ra danh sách giảng viên.");
        System.out.println("5. Lập lịch phân công giảng dạy.");
        System.out.println("6. Sắp xếp lịch phân công giảng dạy.");
        System.out.println("7. Tính lương.");
        System.out.println("8. Thoát.");
        System.out.print("Nhập thao tác muốn thực hiện: ");
    }

}
