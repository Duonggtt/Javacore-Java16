package entity;

import constant.TeacherLevel;

import java.util.Scanner;

public class Teacher extends Person {

    private int AUTO_ID = 0;
    private int id;
    private String level;

    public Teacher() {
        if(AUTO_ID == 0) {
            AUTO_ID = 99;
        }
        AUTO_ID++;
        this.id = AUTO_ID;
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
    public void InfoInput() {
        super.InfoInput();
        System.out.println("Chọn trình độ giảng viên: ");
        System.out.println("1. GS-TS.");
        System.out.println("2. PGS-TS.");
        System.out.println("3. Giảng viên chính.");
        System.out.println("4. Thạc sỹ.");
        int levelChoice = 0;
        do{
            levelChoice = new Scanner(System.in).nextInt();
            if(levelChoice >=1 && levelChoice <=4) {
                break;
            }
            System.out.println("Vui lòng chọn trình độ giảng viên hợp lệ!");
        }while(true);
        switch (levelChoice) {
            case 1:
                this.level = TeacherLevel.GS_TS.value;
                break;
            case 2:
                this.level = TeacherLevel.PGS_TS.value;
                break;
            case 3:
                this.level = TeacherLevel.TEACHER.value;
                break;
            case 4:
                this.level = TeacherLevel.MASTER.value;
                break;
        }
    }

}
