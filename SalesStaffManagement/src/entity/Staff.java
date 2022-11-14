package entity;

import java.util.Scanner;

public class Staff extends Person{

    private static int AUTO_ID = 999;
    private int id;
    private String contractDate;

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

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", contractDate='" + contractDate + '\'' +
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
        System.out.println("Nhap vao ngay ki hop dong: ");
        this.contractDate = new Scanner(System.in).nextLine();
    }
}
