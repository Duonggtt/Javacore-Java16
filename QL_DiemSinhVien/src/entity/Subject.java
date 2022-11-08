package entity;

import Constant.SubjectTypeConstant;

import java.util.Scanner;

public class Subject {

    public static int AUTO_SUBJECT_ID = 0;
    private int subjectId;
    private String subjectName;
    private int subjectUnit;
    private String subjectType;

    public Subject() {
        if(AUTO_SUBJECT_ID == 0) {
            AUTO_SUBJECT_ID = 99;
        }
        AUTO_SUBJECT_ID++;
        this.subjectId = AUTO_SUBJECT_ID;
    }

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

    public int getSubjectUnit() {
        return subjectUnit;
    }

    public void setSubjectUnit(int subjectUnit) {
        this.subjectUnit = subjectUnit;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", subjectUnit=" + subjectUnit +
                ", subjectType='" + subjectType + '\'' +
                '}';
    }

    public void NhapThongTinSJ() {
        System.out.println("Nhập tên môn học: ");
        this.subjectName = new Scanner(System.in).nextLine();
        System.out.println("Nhập số đơn vị học trình: ");
        this.subjectUnit = new Scanner(System.in).nextInt();
        System.out.println("Chọn loại môn học: ");
        System.out.println("1. Đại cương.");
        System.out.println("2. Cơ sở ngành.");
        System.out.println("3. Chuyên ngành.");
        int subjectTypeTemp;
        do{
            subjectTypeTemp = new Scanner(System.in).nextInt();
            if(subjectTypeTemp >= 1 && subjectTypeTemp <= 3) {
                break;
            }
            System.out.println("Loại môn học không hợp lệ! Vui lòng chọn lại!");
        }while(true);
        switch (subjectTypeTemp) {
            case 1:
                this.subjectType = SubjectTypeConstant.GENERAL_SUBJECT;
                break;
            case 2:
                this.subjectType = SubjectTypeConstant.BASIS_SUBJECT;
                break;
            case 3:
                this.subjectType = SubjectTypeConstant.SPECIALIZATION_SUBJECT;
                break;
        }
    }

}
