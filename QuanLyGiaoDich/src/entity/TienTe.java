package entity;

import entity.GiaoDich;

import java.util.Scanner;

public class TienTe extends GiaoDich {
    private float tiGia;
    private String loaiTien;

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    @Override
    public String toString() {
        return "entity.TienTe{" +
                "tiGia=" + tiGia +
                ", loaiTien='" + loaiTien + '\'' +
                ", maGiaoDich=" + maGiaoDich +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", dongia=" + dongia +
                ", soluong=" + soluong +
                '}';
    }

    @Override
    public void InfoInput() {
        super.InfoInput();
        int funcChoice;

                System.out.println("====================");
                System.out.println("1. Tien Viet Nam");
                System.out.println("2. Tien USD");
                System.out.println("3. Tien EURO");
                System.out.println("====================");
                System.out.println("Chon loai tien: ");

                do {
                    funcChoice = new Scanner(System.in).nextInt();
                    if(funcChoice >= 1 && funcChoice <=3) {
                        break;
                    }
                    System.out.println("Vui long chon dung loai tien!");
                }while(true);

            switch (funcChoice) {
                case 1:
                    this.loaiTien = KieuTienTe.TIEN_VN.value;
                    break;
                case 2:
                    this.loaiTien = KieuTienTe.TIEN_USD.value;
                    break;
                case 3:
                    this.loaiTien = KieuTienTe.TIEN_EURO.value;
                    break;
            }
    }
}
