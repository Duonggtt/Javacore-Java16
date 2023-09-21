import java.util.Scanner;

public class GiaoDich implements inputInfo{
    protected int maGiaoDich;
    protected String ngayGiaoDich;
    protected float donGia;
    protected float dienTich;

    public GiaoDich(int maGiaoDich, String ngayGiaoDich, float donGia, float dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
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

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }


    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public GiaoDich() {
    }


    @Override
    public void InfoInput() {
        System.out.println("Nhap ma giao dich: ");
        this.maGiaoDich = new Scanner(System.in).nextInt();
        System.out.println("Nhap ngay giao dich theo dinh dang (dd/MM/yyyy): ");
        this.ngayGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("Nhap don gia giao dich: ");
        this.donGia = new Scanner(System.in).nextFloat();
        System.out.println("Nhap dien tich: ");
        this.dienTich = new Scanner(System.in).nextFloat();
    }
}
