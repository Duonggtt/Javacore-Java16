package logicHandle;

import entity.Center;
import entity.Clazz;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class CenterHandle {
    ClazzHandle clazzHandle = new ClazzHandle();

    public Center centerInput() throws ParseException {
        Center center = new Center();
        System.out.println("Nhập tên quản lý: ");
        center.setManager(new Scanner(System.in).nextLine());
        System.out.println("Nhập tên giáo viên: ");
        center.setTeacher(new Scanner(System.in).nextLine());
        Clazz clazz = clazzHandle.clazzInput();
        center.setClazz(clazz);
        return center;
    }


    public void centerOutput(Center center) {
        System.out.println(center);
    }

}
