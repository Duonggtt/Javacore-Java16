package BTVN;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //Bài 3: Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên dương a và b.

        System.out.println("Nhap a: ");
        int a = new Scanner(System.in).nextInt();
        while(a < 0 ){
            System.out.println("a phai la so duong, vui long nhap lai !: ");
            System.out.println("Nhap a: ");
            a = new Scanner(System.in).nextInt();
        }
        System.out.println("Nhap b: ");
        int b = new Scanner(System.in).nextInt();
        while(b < 0 ){
            System.out.println("b phai la so duong, vui long nhap lai !: ");
            System.out.println("Nhap b: ");
            b = new Scanner(System.in).nextInt();
        }
        int ucln =0;
        int bcnn = 0;

        for (int i = 1; i <= Math.min(a,b); i++) {
            if(a % i == 0 && b % i == 0) {
                ucln = i;
            }
        }
        System.out.println("UCLN la: " + ucln);
        bcnn = (a * b) / ucln ;
        System.out.println("BCNN la: " + bcnn );


    }
}
