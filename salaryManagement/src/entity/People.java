package entity;

import java.util.Scanner;

public class People implements InputTable {
    protected String name;
    protected String address;
    protected String phone;

    public People() {
    }

    public People(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

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
        return "People{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


    @Override
    public void infoInput() {
        System.out.println("Nhap ten giao vien: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhap dia chi giao vien: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhap sdt giao vien: ");
        this.phone = new Scanner(System.in).nextLine();

    }
}



