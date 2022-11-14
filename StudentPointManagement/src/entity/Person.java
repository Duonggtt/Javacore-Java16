package entity;

import java.util.Scanner;

public class Person implements InputTable{

    protected String name;
    protected String address;
    protected String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public void inputInfo() {
        System.out.println("Nhập vào tên sinh viên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào địa chỉ sinh viên: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào SĐT sinh viên: ");
        this.phone = new Scanner(System.in).nextLine();
    }
}
