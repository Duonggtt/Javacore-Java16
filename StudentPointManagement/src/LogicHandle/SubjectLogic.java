package LogicHandle;

import Run.MainRun;
import entity.Subject;

import java.util.Scanner;

public class SubjectLogic {

    public static void subjectInput() {
        System.out.println("Nhập số lượng môn học muốn thêm: ");
        int subjectNum = new Scanner(System.in).nextInt();
        for(int i = 0; i< subjectNum; i++) {
            System.out.println("Môn học thứ " + (i+1) + " : ");
            Subject subject = new Subject();
            subject.inputInfo();
            for(int j=0;j<MainRun.subjects.length;j++) {
                if(MainRun.subjects[j] == null) {
                    MainRun.subjects[j] = subject;
                    break;
                }
            }
        }
        MainRun.subjectCount += subjectNum;
    }

    public static void subjectOutput() {
        System.out.println("\n\n==================== XUẤT DANH SÁCH MÔN HỌC ====================\n");
        for (int i = 0; i < MainRun.subjects.length; i++) {
            if(MainRun.subjects[i] != null) {
                System.out.println(MainRun.subjects[i]);
            }
        }
        System.out.println("\n================================================================\n\n");
    }

}
