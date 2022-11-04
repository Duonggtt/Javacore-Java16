package ONCLASS;

import java.util.Scanner;

public class SinhVien {
    int MaSV;
    String TenSV;
    String QueQuan;
    String GioiTinh;
    double DiemTrungBinh;
    String TenKhoa;

    public void NhapThongTinSinhVien() {
        System.out.println("Nhap ma sinh vien: ");
        this.MaSV = new Scanner(System.in).nextInt();

        System.out.println("Nhap ho ten: ");
        this.TenSV = new Scanner(System.in).nextLine();

        System.out.println("Nhap que quan: ");
        this.QueQuan = new Scanner(System.in).nextLine();

        System.out.println("Nhap gioi tinh: ");
        this.GioiTinh = new Scanner(System.in).nextLine();

        System.out.println("Nhap diem trung binh: ");
        this.DiemTrungBinh = new Scanner(System.in).nextDouble();

        System.out.println("Nhap ten Khoa:: ");
        this.TenKhoa = new Scanner(System.in).nextLine();
    }
}
