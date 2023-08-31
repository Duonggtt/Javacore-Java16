import java.util.Scanner;

public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }

    HinhChuNhat inputInfo() {
        HinhChuNhat hcn = new HinhChuNhat();
        System.out.println("Nhap chieu dai: ");
        hcn.setChieuDai(new Scanner(System.in).nextInt());
        System.out.println("Nhap chieu rong: ");
        hcn.setChieuRong(new Scanner(System.in).nextInt());
        return hcn;
    }

    void chuVi(HinhChuNhat hcn) {
        if(hcn.getChieuDai() <= 0 || hcn.getChieuRong() <=0) {
            System.out.println("Chieu dai hoac chieu rong ko hop le");
            return;
        }
        float chuvi = (float) (hcn.getChieuDai() + hcn.getChieuRong())* 2;
        System.out.println("Chu vi hinh chu nhat la: " + chuvi);
    }

    void dienTich(HinhChuNhat hcn) {
        if(hcn.getChieuDai() <= 0 || hcn.getChieuRong() <=0) {
            System.out.println("Chieu dai hoac chieu rong ko hop le");
            return;
        }
        int dientich = hcn.getChieuDai() * hcn.getChieuRong();
        System.out.println("Dien tich hinh chu nhat la: " + dientich);
    }
}
