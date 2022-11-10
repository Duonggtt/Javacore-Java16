package entity;

import java.util.Scanner;

public class Subject implements inputTable{

    private int id;
    private String name;
    private int lessonQuantity;
    private double lessonPrice;
    private int theoryLessonQuantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLessonQuantity() {
        return lessonQuantity;
    }

    public void setLessonQuantity(int lessonQuantity) {
        this.lessonQuantity = lessonQuantity;
    }

    public double getLessonPrice() {
        return lessonPrice;
    }

    public void setLessonPrice(double lessonPrice) {
        this.lessonPrice = lessonPrice;
    }

    public int getTheoryLessonQuantity() {
        return theoryLessonQuantity;
    }

    public void setTheoryLessonQuantity(int theoryLessonQuantity) {
        this.theoryLessonQuantity = theoryLessonQuantity;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lessonQuantity=" + lessonQuantity +
                ", lessonPrice=" + lessonPrice +
                ", theoryLessonQuantity=" + theoryLessonQuantity +
                '}';
    }

    public void InfoInput() {
        System.out.println("Nhập tên giảng viên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập tổng số tiết: ");
        this.lessonQuantity = new Scanner(System.in).nextInt();
        System.out.println("Nhập số tiết lý thuyết: ");
        this.theoryLessonQuantity = new Scanner(System.in).nextInt();
        System.out.println("Nhập mức kinh phí: ");
        this.lessonPrice = new Scanner(System.in).nextDouble();
    }

}
