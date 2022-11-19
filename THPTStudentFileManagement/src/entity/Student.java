package entity;

import java.util.Scanner;

public class Student {
    private static int AUTO_ID = 0;
    private int id;
    private String name;
    private String date;
    private String address;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static Student studentInput() {
        Student student = new Student();
        AUTO_ID++;
        student.id = AUTO_ID;
        System.out.println("Nhập vào tên học sinh: ");
        student.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập ngày sinh học sinh: ");
        student.setDate(new Scanner(System.in).nextLine());
        System.out.println("Nhập đa chỉ học sinh: ");
        student.setAddress(new Scanner(System.in).nextLine());

        return student;
    }

}
