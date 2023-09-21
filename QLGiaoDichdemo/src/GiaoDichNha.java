import java.util.Scanner;

public class GiaoDichNha extends GiaoDich{

    private String loaiNha;
    private String diaChi;

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" +
                "loaiNha='" + loaiNha + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", maGiaoDich=" + maGiaoDich +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                '}';
    }

    @Override
    public void InfoInput() {
        super.InfoInput();
        System.out.println("Nhap dia chi giao dich nha: ");
        this.diaChi = new Scanner(System.in).nextLine();
        System.out.println("----------------");
        System.out.println("1. Loai Cao cap");
        System.out.println("2. Loai thuong");
        System.out.println("----------------");
        System.out.println("Chon loai nha: ");
        int funcChoices;
        do {
            funcChoices = new Scanner(System.in).nextInt();
            if(funcChoices >=1 && funcChoices <=2) {
                break;
            }
            System.out.println("Vui long chon loai nha phu hop!");
        }while(true);
        switch (funcChoices) {
            case 1:
                this.loaiNha = ConstantType.LOAI_CC.value;
                break;
            case 2:
                this.loaiNha = ConstantType.LOAI_T.value;
                break;
            default:
                return;
        }
    }
}
