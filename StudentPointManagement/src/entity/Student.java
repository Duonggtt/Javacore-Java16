package entity;

import java.util.Scanner;

public class Student extends Person{

    private static int AUTO_ID = 9999;
    private int id;
    private String clazz;

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", clazz='" + clazz + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        AUTO_ID++;
        this.id = AUTO_ID;
        System.out.println("Nhập vào lớp sinh viên: ");
        this.clazz = new Scanner(System.in).nextLine();
    }
}
