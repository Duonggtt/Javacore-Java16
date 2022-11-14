package logicHandle;

import entity.Staff;
import run.MainRun;

import java.util.Scanner;

public class StaffLogicHandle {


    public static void staffInput() {
        System.out.println("Nhap so luong nhan vien can quan ly: ");
        int staffNum = new Scanner(System.in).nextInt();
        for(int i=0;i< staffNum;i++) {
            System.out.println("Nhap vao nhan vien thu " + (i+1) + " : ");
            Staff staff = new Staff();
            staff.inputInfo();
            for(int j=0 ; j<MainRun.staffs.length;j++) {
                if(MainRun.staffs[j] == null) {
                    MainRun.staffs[j] =staff;
                    break;
                }
            }
        }
        MainRun.staffcount += staffNum;
    }

    public static void staffOutput() {
        for(int i=0;i<MainRun.staffs.length;i++) {
            if(MainRun.staffs[i] != null) {
                System.out.println(MainRun.staffs[i]);
            }
        }
    }
}
