package BTVN;

import ONCLASS.RECTANGLE;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhap chieu rong: ");
        double width = new Scanner(System.in).nextDouble();
        System.out.println("Nhap chieu dai: ");
        double height = new Scanner(System.in).nextDouble();
        System.out.println("Nhap mau sac: ");
        String color = new Scanner(System.in).nextLine();
        Rectangle rectangle = new Rectangle(width,height,color);
        rectangle.Xuat();
    }


}
