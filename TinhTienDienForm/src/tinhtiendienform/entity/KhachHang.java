/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtiendienform.entity;

/**
 *
 * @author LENOVO
 */
public class KhachHang {
    
    private int maKH;
    private String hoTen;
    private int thang;
    private int soDienDau;
    private int soDienCuoi;

    public KhachHang() {
    }

    public KhachHang(int maKH, String hoTen, int thang, int soDienDau, int soDienCuoi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.thang = thang;
        this.soDienDau = soDienDau;
        this.soDienCuoi = soDienCuoi;
    }
    
    

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getSoDienDau() {
        return soDienDau;
    }

    public void setSoDienDau(int soDienDau) {
        this.soDienDau = soDienDau;
    }

    public int getSoDienCuoi() {
        return soDienCuoi;
    }

    public void setSoDienCuoi(int soDienCuoi) {
        this.soDienCuoi = soDienCuoi;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", hoTen=" + hoTen + ", thang=" + thang + ", soDienDau=" + soDienDau + ", soDienCuoi=" + soDienCuoi + '}';
    }
    
    public void nhapThongTin(int id, String name,int thang, int soDien1, int soDien2) {
        this.maKH = id;
        this.hoTen = name;
        this.thang = thang;
        this.soDienDau = soDien1;
        this.soDienCuoi = soDien2;
    }
    
    
}
