package ONCLASS;

public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

    public int getChieuDai(int d) {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong(int r) {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int chuVi(int chieuDai, int chieuRong) {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public int dienTich(int chieuDai, int chieuRong) {
        return this.chieuDai * this.chieuRong;
    }

 }
