import java.util.Scanner;

public class HinhChuNhat {
    private float chieuDai;
    private float chieuRong;


    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }

    void Nhap() {
        System.out.println("Nhap chieu dai: ");
        this.chieuDai = new Scanner(System.in).nextFloat();
        System.out.println("Nhap chieu rong: ");
        this.chieuRong = new Scanner(System.in).nextFloat();

    }

    double TinhChuVi() {
       return (this.chieuDai + this.chieuRong) * 2;
    }

    double TinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    void InKQ() {
        System.out.println("Dien tich là: " + TinhDienTich());
        System.out.println("Chu vi là: " + TinhChuVi());
    }
}
