package entity;

import constant.ReporterType;

import java.util.Scanner;

public class Reporter extends Person{

    private static int AUTO_ID = 9999;
    private int id;
    private String type;

    public int getAUTO_ID() {
        return AUTO_ID;
    }

    public void setAUTO_ID(int AUTO_ID) {
        this.AUTO_ID = AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


    @Override
    public void InfoInput() {
        super.InfoInput();
        AUTO_ID++;
        this.id = AUTO_ID;
        System.out.println("Chọn loại phóng viên: ");
        System.out.println("1. Chuyên nghiệp.");
        System.out.println("2. Nghiệp dư.");
        System.out.println("3. Cộng tác viên.");
        int reporterTypeTemp;
        do {
            reporterTypeTemp = new Scanner(System.in).nextInt();
            if(reporterTypeTemp >= 1 && reporterTypeTemp <= 3) {
                break;
            }
            System.out.println("Loại phóng viên không hợp lệ!Vui lòng chọn lại!");
        }while(true);
        switch (reporterTypeTemp) {
            case 1:
                this.type = ReporterType.PROFESSIONAL.value;
                break;
            case 2:
                this.type = ReporterType.AMATEUR.value;
                break;
            case 3:
                this.type = ReporterType.COLLABORATOR.value;
                break;
        }
    }
}
