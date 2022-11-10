package entity;

import java.util.Scanner;

public class Person implements InfoInput{

    protected String name;
    private String address;
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

    public void infoInput() {
        System.out.println("Nhập vào họ tên tài xế: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào địa chỉ tài xế: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào số điện thoại tài xế: ");
        this.phone = new Scanner(System.in).nextLine();
    }
}
