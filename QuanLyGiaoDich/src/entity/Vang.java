package entity;

import entity.GiaoDich;

import java.util.Scanner;

public class Vang extends GiaoDich {
    private String loaiVang;

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String laoiVang) {
        this.loaiVang = laoiVang;
    }

    @Override
    public String toString() {
        return "entity.Vang{" +
                "laoiVang='" + loaiVang + '\'' +
                ", maGiaoDich=" + maGiaoDich +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", dongia=" + dongia +
                ", soluong=" + soluong +
                '}';
    }


    @Override
    public void InfoInput() {
        super.InfoInput();
        System.out.println("Nhap loai vang: ");
        this.loaiVang = new Scanner(System.in).nextLine();
    }
}
