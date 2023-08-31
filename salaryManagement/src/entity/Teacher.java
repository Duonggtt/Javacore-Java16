package entity;

import java.util.Scanner;

public class Teacher extends People{
    private int AUTO_ID = 0;
    private int id;
    private String level;

    public Teacher(String name, String address, String phone, int id, String level) {
        super(name, address, phone);
        this.id = id;
        this.level = level;
    }

    public Teacher() {
        if(AUTO_ID == 0) {
            AUTO_ID = 99;
        }
        AUTO_ID++;
        this.id=AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", level='" + level + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void infoInput() {
        super.infoInput();
        System.out.println("1: Giao su tien si");
        System.out.println("2: Pho giao su tien si");
        System.out.println("3: Gian vien chinh");
        System.out.println("4: Thac si");
        System.out.println("5: Thoat");
        System.out.println("Chon trinh do giang vien: ");
        int levelChoice;
        do{
            levelChoice = new Scanner(System.in).nextInt();
            if(levelChoice >=1 && levelChoice <=5) {
                break;
            }
            System.out.println("Vui lòng chọn trình độ giảng viên hợp lệ!");
        }while(true);
        switch (levelChoice) {
            case 1:

        }
    }
}
