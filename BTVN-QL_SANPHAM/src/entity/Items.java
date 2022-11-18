package entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    private int id;
    private String name;
    private String desc;
    private int quantity;
    private double price;
    private String unit;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
    public static Items itemInput() {
        Items items = new Items();

        System.out.println("Nhap id: ");
        items.setId(new Scanner(System.in).nextInt());
        System.out.println("Nhap name: ");
        items.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhap description: ");
        items.setDesc(new Scanner(System.in).nextLine());
        System.out.println("Nhap so luong: ");
        items.setQuantity(new Scanner(System.in).nextInt());
        System.out.println("Nhap price: ");
        items.setPrice(new Scanner(System.in).nextDouble());
        System.out.println("Nhap don vi tinh: ");
        items.setUnit(new Scanner(System.in).nextLine());

        return items;
    }
}
