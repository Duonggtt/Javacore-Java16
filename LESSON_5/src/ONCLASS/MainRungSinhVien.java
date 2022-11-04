package ONCLASS;

import java.util.Scanner;

public class MainRungSinhVien {
    public static void main(String[] args) {
        int soluongSV = new Scanner(System.in).nextInt();
        SinhVien[] sinhvien = new SinhVien[soluongSV];

        for (int i =0;i<soluongSV;i++) {
            sinhvien[i] = new SinhVien();
            sinhvien[i].NhapThongTinSinhVien();
        }

        for (int i =0;i<sinhvien.length;i++) {
            System.out.println(sinhvien[i]);
        }

    }

}
