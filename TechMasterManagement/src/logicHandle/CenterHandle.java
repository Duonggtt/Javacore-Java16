package logicHandle;

import entity.Center;
import entity.Clazz;
import entity.Student;

import java.util.Scanner;

public class CenterHandle {

    public static Center center = new Center();
        public static Center inputInfo() {
            System.out.println("Nhập thông tin cho trung tâm TechMaster!");
            System.out.println("Nhập thông tin quản lý: ");
            center.setManager(new Scanner(System.in).nextLine());
            System.out.println("Nhập thông tin giảng viên: ");
            center.setTeacher(new Scanner(System.in).nextLine());
            System.out.println("Nhập thông tin lớp học");
            Clazz clazz = ClazzHandle.inputInfo();
            center.setClazz(clazz);
            return center;
        }

    public static void outputInfo(Center center) {
        System.out.println(center);
    }

}
