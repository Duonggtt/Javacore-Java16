package logicHandle;

import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandle {

    public Student studentInput() {
        while (true){
            try{
                Student student = new Student();
                System.out.println("Nhập tên student: ");
                student.setName(new Scanner(System.in).nextLine());
                System.out.println("Nhập địa chỉ student: ");
                student.setAddress(new Scanner(System.in).nextLine());
                return student;
            }catch(Exception e) {
                System.out.println("Lỗi input Student!Nhập lại!");
            }
        }
    }

    public void studentOutput(ArrayList<Student> students) {
        for (Student student: students) {
            System.out.print(student);
        }
    }


}
