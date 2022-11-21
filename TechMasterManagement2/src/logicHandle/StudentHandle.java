package logicHandle;

import entity.Center;
import entity.Clazz;
import entity.Student;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentHandle {

    public Student studentInput() throws ParseException {
        Student student = new Student();

        System.out.println("Nhập tên học viên: ");
        student.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập ngày tháng năm sinh của học viên (dd/MM/yyyy): ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dob = simpleDateFormat.parse(new Scanner(System.in).nextLine());
        student.setDob(dob);
        System.out.println("Nhập xếp loại của học viên: ");
        student.setRank(new Scanner(System.in).nextLine());
        return student;
    }

    public void updateStudent(Center center) throws ParseException {
        center.getClazz().getStudents().add(studentInput());
        System.out.println("Cập nhật thông tin học viên thành công!");
    }

    public void updateStudentRankById(Center center) {
        System.out.println("Nhập id học viên bạn muốn update rank: ");
        int studentId = new Scanner(System.in).nextInt();
        for(int i =0;i<center.getClazz().getStudents().size();i++){
            if(center.getClazz().getStudents().get(i).getId() == studentId && center.getClazz().getStudents().size() > 0) {
                System.out.println("Nhập xếp hạng mới cho học viên mang id " + studentId);
                center.getClazz().getStudents().get(i).setRank(new Scanner(System.in).nextLine());
                break;
            }
        }
        System.out.println("Đã cập nhật rank học viên mang id " + studentId);
    }

    public void removeStudentById(Center center) {
        System.out.println("Nhập id học viên bạn muốn xóa: ");
        int studentId = new Scanner(System.in).nextInt();
        for(int i =0;i<center.getClazz().getStudents().size();i++){
            if(center.getClazz().getStudents().get(i).getId() == studentId && center.getClazz().getStudents().size() > 0) {
                center.getClazz().getStudents().remove(i);
                break;
            }
        }
        System.out.println("Đã xóa học viên mang id " + studentId);
    }
}
