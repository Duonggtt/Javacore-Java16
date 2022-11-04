package ONCLASS;

import java.util.Scanner;

public class DEMORun {
    public static void main(String[] args) {

        RECTANGLE rectangle = new RECTANGLE();
        System.out.println("Nhap vao chieu dai :");
        rectangle.width = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao chieu rong :");
        rectangle.longs = new Scanner(System.in).nextInt();

        System.out.println("Chu vi hinh chu nhat la: " + rectangle.rectanglePerimeter(rectangle.width, rectangle.longs));
        System.out.println("Dien tich hinh chu nhat la: " + rectangle.rectangleArea(rectangle.width, rectangle.longs));
    }
}
