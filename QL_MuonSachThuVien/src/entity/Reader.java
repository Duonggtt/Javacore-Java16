package entity;


import constant.ReaderTypeConstant;

import java.util.Scanner;

public class Reader extends Person{

    private static int AUTO_ID = 0;
    private int id;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reader(int id) {
        this.id = id;
    }

    public Reader() {
        if(AUTO_ID == 0) {
            AUTO_ID = 9999;
        }
        AUTO_ID++;
        this.id = AUTO_ID;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void NhapThongTin() {
            super.NhapThongTin();
            System.out.println("===== Chọn loại người đọc =====");
            System.out.println("1. Sinh Viên");
            System.out.println("2. Học sinh cao học");
            System.out.println("3. Giảng viên");
            int readerTypeChoose;
            do{
                readerTypeChoose = new Scanner(System.in).nextInt();
                if(readerTypeChoose >=1 && readerTypeChoose <=3) {
                    break;
                }
                System.out.println("Loại người đọc không hợp lệ! Vui lòng chọn lại!");
            }while(true);
            switch (readerTypeChoose) {
                case 1:
                    this.type = ReaderTypeConstant.STUDENT;
                    break;
                case 2:
                    this.type = ReaderTypeConstant.POST_UNIVERSITY;
                    break;
                case 3:
                    this.type = ReaderTypeConstant.TEACHER;
                    break;
            }
        }
}
