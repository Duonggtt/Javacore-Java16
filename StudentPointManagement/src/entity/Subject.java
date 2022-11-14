package entity;

import constant.subjectTypeConstant;

import java.util.Scanner;

public class Subject implements InputTable{

    private static int AUTO_ID = 99;
    private int subjectId;
    private String subjectName;
    private int unitNumber;
    private String subjectType;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", unitNumber=" + unitNumber +
                ", subjectType='" + subjectType + '\'' +
                '}';
    }

    public void inputInfo() {
        AUTO_ID++;
        this.subjectId = AUTO_ID;
        System.out.println("Nhập vào tên môn học: ");
        this.subjectName = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào số đơn vị học trình: ");
        this.unitNumber = new Scanner(System.in).nextInt();
        System.out.println("Chọn loại môn học: ");
        System.out.println("1. Đại cương.");
        System.out.println("2. Cơ sở ngành.");
        System.out.println("3. Chuyên ngành.");
        int subjectYpeTemp;
        do {
            subjectYpeTemp = new Scanner(System.in).nextInt();
            if(subjectYpeTemp >=1 && subjectYpeTemp <=3) {
                break;
            }
            System.out.println("Loại môn học không hợp lệ! Vui lòng chọn lại!");
        }while(true);
        switch (subjectYpeTemp) {
            case 1:
                this.subjectType = subjectTypeConstant.GENERAL_SUBJECT.value;
                break;
            case 2:
                this.subjectType = subjectTypeConstant.BASIC_SUBJECT.value;
                break;
            case 3:
                this.subjectType = subjectTypeConstant.SPECIALIZED_SUBJECT.value;
                break;
        }
    }
}
