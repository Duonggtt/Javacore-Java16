package BTVN;

import java.util.Scanner;

public class B6 {

    public static void main(String[] args) {
        //Bài 6: Nhập bán kính hình tròn, tính diện tích hình tròn đó

        final double PI = 3.14;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao ban kinh hinh tron: ");
        int r = sc.nextInt();
        double S = PI * (r * r);

        System.out.println("Dien tich hinh tron la: " + S );

    }
}
