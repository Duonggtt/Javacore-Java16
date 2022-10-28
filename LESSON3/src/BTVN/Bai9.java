package BTVN;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {

        //Viết chương trình nhập số nguyên h và in ra màn hình tam giác vuông cân đặc có độ cao h. Ví dụ với h=4:
        //
        //*
        //*  *
        //*  *  *
        //*  *  *  *

        System.out.println("Nhap h: ");
        int h = new Scanner(System.in).nextInt();
        for(int i=1; i<=h;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
