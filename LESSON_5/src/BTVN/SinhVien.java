package BTVN;

import java.util.Scanner;

public class SinhVien {
    public String MaSinhVien;
    public String TenSinhVien;
    public String Lop;

    public SinhVien() {}

    public SinhVien(String MaSinhVien, String TenSinhVien, String Lop) {
        this.MaSinhVien = MaSinhVien;
        this.TenSinhVien = TenSinhVien;
        this.Lop = Lop;
    }

    public String GetId(String MaSinhVien) {
        return MaSinhVien;
    }

    public String GetClass( String Lop) {
        return Lop;
    }

    public String GetName(String TenSinhVien) {
        return TenSinhVien;
    }

    public void NhapThongTinSinhVien(Scanner sc) {
        System.out.println("Nhap ma sinh vien: ");
        MaSinhVien = sc.nextLine();
        System.out.println("Nhap ho ten sinh vien ");
        TenSinhVien = sc.nextLine();
        System.out.println("Nhap vao lop cua sinh vien: ");
        Lop = sc.nextLine();
    }


    public void XuatThongTinSinhVien() {
        System.out.println("Ma sinh vien: " +MaSinhVien);
        System.out.println("Ho ten sinh vien: " + TenSinhVien);
        System.out.println("Lop cua sinh vien: " + Lop);
    }


    public void XuatThongTinNSinhVien() {;
        System.out.printf("\n%-20s %-30s%-20s",MaSinhVien,TenSinhVien,Lop);
    }

    public static void SortByClass(SinhVien[] sv, int n) {
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++) {
                SinhVien temp = sv[i];
                if (sv[i].Lop.compareTo(sv[j].Lop)>0)
                {
                    temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }
    }

    public static void SordByName(SinhVien[] sv,int n) {
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++) {
                SinhVien temp = sv[i];
                if (sv[i].TenSinhVien.compareTo(sv[j].TenSinhVien)>0)
                {
                    temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }
    }


    @Override
    public String toString() {
        return "SinhVien{" +
                "MaSinhVien='" + MaSinhVien + '\'' +
                ", TenSinhVien='" + TenSinhVien + '\'' +
                ", Lop='" + Lop + '\'' +
                '}';
    }
}
