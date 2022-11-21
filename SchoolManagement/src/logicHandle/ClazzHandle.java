package logicHandle;

import entity.Clazz;
import entity.Student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClazzHandle {
    StudentHandle studentHandle = new StudentHandle();
    public Clazz classInput() throws ParseException {

        Clazz clazz = new Clazz();
        System.out.println("Nhap ten lop: ");
        clazz.setName(new Scanner(System.in).nextLine());
        // oánh cho trận h
        // Nhập dữ liệu cho các student -> phải có 1 câu hiển thị cho ng dùng hiểu cần làm j
        System.out.println("Mời b nhập số lượng student muôn thêm vào lớp");
        int num = new Scanner(System.in).nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Student student = studentHandle.inputStudent();
            students.add(student);
            clazz.setStudents(students);
        }
        // đã set giá trị đâu
        return clazz;
    }
}
