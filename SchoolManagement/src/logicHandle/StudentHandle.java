package logicHandle;

import entity.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

// Vì sao lại tạo student handle đầu? vì nó là cái xử lý dễ nhất nếu tạo classHandle trc thì nó còn liên quan đến student handle
public class StudentHandle {
    // Đầu tiên mình cần viết 1 hàm tạo ra student
    public Student inputStudent() throws ParseException {
        Student student = new Student();
        System.out.println("Mời b nhập tên: ");
        student.setName(new Scanner(System.in).nextLine());
        System.out.println("Mời b nhập tuổi: ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dob = simpleDateFormat.parse(new Scanner(System.in).nextLine());
        student.setDob(dob);
        System.out.println("Mời b nhập địa chỉ: ");
        student.setAddress(new Scanner(System.in).nextLine());
        return student;
    }


}
