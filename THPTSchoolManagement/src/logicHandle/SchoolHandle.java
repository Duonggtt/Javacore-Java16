package logicHandle;

import entity.Clazz;
import entity.School;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolHandle {
    public static ArrayList<Clazz> clazzes = new ArrayList<>();
    public static School school = new School();

    // Xoa het di lm lai tu dau nhe =]]]] =)))) kho the
    // cu lm static ntn la vi pham tinh dong goi r e
    // h: e xoa het di tao project moi, e tao truoc cac doi tuong cho a
//    sau a huong dan okii a
    public School inputInfo() throws ParseException {
        school = new School();
        System.out.println("Import course : " );
        school.setCourse(new Scanner(System.in).nextLine());
        System.out.println("Import semester: ");
        school.setSemester(new Scanner(System.in).nextInt());
        System.out.println("Import number of class: ");
        int clazzNum = new Scanner(System.in).nextInt();
        for(int i = 0;i<clazzNum;i++) {
            System.out.println("Class " + (i+1));
            Clazz clazz = ClazzHandle.inputInfo();
            clazzes.add(clazz);
            school.setClazzes(clazzes);
        }
        return school;
    }
    public static void outputInfo(School school) {
        System.out.println(school);
    }

}
