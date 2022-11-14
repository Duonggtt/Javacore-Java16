package entity;

import java.util.Scanner;

public class Post implements InputTable{

    private static int AUTO_ID = 99;
    private int id;
    private String name;
    private double price;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void InfoInput() {
        AUTO_ID++;
        this.id = AUTO_ID;
        System.out.println("Nhập tên kiểu bài: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập đơn giá :");
        this.price = new Scanner(System.in).nextDouble();
    }
}
