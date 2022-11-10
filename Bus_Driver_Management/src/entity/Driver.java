package entity;

import constant.DriverLevel;

import java.util.Scanner;

public class Driver extends Person{

    private static int AUTO_ID = 10000;
    private int id;
    private String level;



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
        return "Driver{" +
                "id=" + id +
                ", level='" + level + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void infoInput() {
        super.infoInput();
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.println("Chọn trình độ của tài xế: ");
        System.out.println("1. Loại A");
        System.out.println("2. Loại B");
        System.out.println("3. Loại C");
        System.out.println("4. Loại D");
        System.out.println("5. Loại E");
        System.out.println("6. Loại F");
        int levelTypeTemp;
        do{
            levelTypeTemp = new Scanner(System.in).nextInt();
            if(levelTypeTemp >=1 && levelTypeTemp <=6) {
                break;
            }
            System.out.println("Vui lòng chọn trình độ hợp lệ!");
        }while(true);
        switch (levelTypeTemp) {
            case 1:
                this.level = DriverLevel.TYPE_A.value;
                break;
            case 2:
                this.level = DriverLevel.TYPE_B.value;
                break;
            case 3:
                this.level = DriverLevel.TYPE_C.value;
                break;
            case 4:
                this.level = DriverLevel.TYPE_D.value;
                break;
            case 5:
                this.level = DriverLevel.TYPE_E.value;
                break;
            case 6:
                this.level = DriverLevel.TYPE_F.value;
                break;
        }
    }
}
