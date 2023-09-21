package entity;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class GiaoDich implements inputInfo{
    protected int maGiaoDich;
    protected String ngayGiaoDich;
    protected float dongia;
    protected int soluong;

    public GiaoDich() {
    }


    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public void InfoInput() {
        System.out.println("Nhap ma giao dich: ");
        this.maGiaoDich = new Scanner(System.in).nextInt();
        System.out.println("Nhap ngay giao dich(dd/mm/yyyy) : ");
        this.ngayGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("Nhap don gia: ");
        this.dongia = new Scanner(System.in).nextInt();
        System.out.println("Nhap so luong: ");
        this.soluong = new Scanner(System.in).nextInt();
    }
}
