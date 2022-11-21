package logicHandle;

import entity.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentHandle {



    public static Student inputInfo() throws ParseException {
        Student student = new Student();
        System.out.println("Import student's name: ");
        student.setName(new Scanner(System.in).nextLine());
        System.out.println("Import student's date of birth: ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        student.setDob(simpleDateFormat.parse(new Scanner(System.in).nextLine()));
        System.out.println("Import student's address: ");
        student.setAddress(new Scanner(System.in).nextLine());
        return student;
    }



    // Hinh nhu tren lop a co noi ve bai nay, neu phan tich ky thi se hoi kho
    //=)))thooi ksao =]]]
    // Khi goij ham nay thi minh can truyen vao 2 thuoc tinh la nam sinh + address
    // bai nay 1 school co nhieu class a em thaays no co lay ra nhung hoc sinh thuoc lop 10A1 nua neen em nghi nhieu class
    public ArrayList<Student> getStudentByYearAndAddress(Date birthDate, String address) {


    }
}
