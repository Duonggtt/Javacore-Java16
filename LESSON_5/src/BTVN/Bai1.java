package BTVN;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        SinhVien sinhvien = new SinhVien();
        Scanner sc = new Scanner(System.in);
        sinhvien.NhapThongTinSinhVien(sc);
        sinhvien.XuatThongTinSinhVien();
    }

}
