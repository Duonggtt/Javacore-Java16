package logicHandle;

import entity.School;
import entity.Student;
import run.MainRun;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class schoolLogicHandle
{

    public static ArrayList<School> schools = new ArrayList<>();
    public static School school = new School();
    public static void schoolFileManager() throws ParseException {
        System.out.println("Nhập vào số học sinh cần quản lý: ");
        int studentNum;
        do{
            studentNum = new Scanner(System.in).nextInt();
            if(studentNum > MainRun.studentCount) {
                System.out.println("Số lượng học sinh đã vượt quá dữ liệu học sinh hiện có! Vui lòng nhập lại: ");
                continue;
            }
            if(studentNum > 0) {
                break;
            }
            System.out.println(" Số lượng học sinh không được âm!Nhập lại: ");
        }while(true);
        for (int i = 0; i < studentNum; i++) {
            System.out.println("Học sinh thứ " + (i+1));
            System.out.println("Nhập vào mã học sinh: ");
            int studentId;
            Student student;
            do{
                boolean isCheckId = false;
                studentId = new Scanner(System.in).nextInt();
                for(int j=0;j<MainRun.students.size();j++) {
                    if(MainRun.students.get(j).getId() == studentId) {
                        isCheckId = true;
                        student = MainRun.students.get(j);
                    }
                }
                if(!isCheckId) {
                    break;
                }
                System.out.println("Mã học sinh không tồn tại!");
            }while(true);
            String d = new Scanner(System.in).nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = simpleDateFormat.parse(d);
        }
    }
}
