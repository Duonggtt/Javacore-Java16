package BTVN;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        //Bài 10: Viết chương trình nhập số nguyên h và in ra màn hình tam giác cân có độ cao h. Ví dụ với h=4:
        //         *
        //      *  *  *
        //   *  *  *  *  *
        //*  *  *  *  *  *  *

        System.out.println("Nhap h: ");
        int h = new Scanner(System.in).nextInt();

        for(int i =1;i<=h;i++) {
            for(int j =1;j<2*h;i++) {
                if(Math.abs(h-j) <= (i-1)) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
