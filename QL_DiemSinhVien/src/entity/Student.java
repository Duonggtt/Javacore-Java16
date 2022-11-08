package entity;

import java.util.Scanner;

public class Student extends Person{

    public static int AUTO_STUDENT_ID = 0;
    private int id;
    private String studentClass;

    public Student() {
        if(AUTO_STUDENT_ID == 0) {
            AUTO_STUDENT_ID = 9999;
        }
        AUTO_STUDENT_ID++;
        this.id = AUTO_STUDENT_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentClass='" + studentClass + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void NhapThongTinSV() {
        super.NhapThongTinSV();
        System.out.println("Nhập lớp sinh viên: ");
        this.studentClass = new Scanner(System.in).nextLine();
    }
}
