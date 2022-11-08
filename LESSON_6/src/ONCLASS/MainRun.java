package ONCLASS;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        System.out.println("Nhap chieu dai: ");
        int d = new Scanner(System.in).nextInt();
        hinhChuNhat.setChieuDai(d);
        System.out.println("Nhap chieu rong: ");
        int r = new Scanner(System.in).nextInt();
        hinhChuNhat.setChieuRong(r);
        System.out.println("Chu vi la: " + hinhChuNhat.chuVi(d,r));
        System.out.println("Dien tich la: " + hinhChuNhat.dienTich(d,r));
    }
}
