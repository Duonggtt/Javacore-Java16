package BTVN;

import java.util.*;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so sinh vien: ");
        int n = new Scanner(System.in).nextInt();
        SinhVien[] sv = new SinhVien[n];
        for(int i=0;i<n;i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i+1) + ": ");
            sv[i] = new SinhVien();
            NhapThongTinNSinhVien(sv[i]);
        }
        System.out.println("\n=========================================");
        System.out.println("Xuat danh sach sinh vien: ");
        System.out.printf("\n%-20s %-30s%-20s", "MaSV", "Ten Sinh Vien", "Lop");
        for (int i = 0; i < n; i++) {

            sv[i].XuatThongTinNSinhVien();
        }
        System.out.println("\n=========================================");

        System.out.println("\n=============================================================");
        System.out.println("Xuat danh sach sinh vien sap xep theo lop: ");
        System.out.printf("\n%-20s %-30s%-20s", "MaSV", "Ten Sinh Vien", "Lop");
        for (int i = 0; i < n; i++) {
            sv[i].SortByClass(sv,n);
            sv[i].XuatThongTinNSinhVien();
        }
        System.out.println("\n=============================================================");

        System.out.println("\n=========================================");
        System.out.println("Xuat danh sach sinh vien sap xep theo ten: ");
        System.out.printf("\n%-20s %-30s%-20s", "MaSV", "Ten Sinh Vien", "Lop");

        for (int i = 0; i < n; i++) {
            sv[i].SordByName(sv,n);
            sv[i].XuatThongTinNSinhVien();
        }
        System.out.println("\n=============================================================");

    }

    public static void NhapThongTinNSinhVien(SinhVien sv) {
            System.out.println("Nhap ma sinh vien: ");
            sv.MaSinhVien = new Scanner(System.in).nextLine();
            System.out.println("Nhap ho ten sinh vien ");
            sv.TenSinhVien = new Scanner(System.in).nextLine();
            System.out.println("Nhap vao lop cua sinh vien: ");
            sv.Lop = new Scanner(System.in).nextLine();
    }

}
