import java.util.Scanner;

public class GiaoDichDat extends GiaoDich{
    private String loaiDat;

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public String toString() {
        return "GiaoDichDat{" +
                "loaiDat='" + loaiDat + '\'' +
                ", maGiaoDich=" + maGiaoDich +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                '}';
    }

    @Override
    public void InfoInput() {
        super.InfoInput();
        System.out.println("----------------");
        System.out.println("1. Loai A");
        System.out.println("2. Loai B");
        System.out.println("3. Loai C");
        System.out.println("----------------");
        System.out.println("Chon loai dat: ");
        int funcChoice;
        do {
            funcChoice = new Scanner(System.in).nextInt();
            if(funcChoice >=1 && funcChoice <=3) {
                break;
            }
            System.out.println("Vui long chon loai dat phu hop!");
        }while(true);
        switch (funcChoice) {
            case 1:
                this.loaiDat = ConstantType.LOAI_A.value;
                break;
            case 2:
                this.loaiDat = ConstantType.LOAI_B.value;
                break;
            case 3:
                this.loaiDat = ConstantType.LOAI_C.value;
                break;
            default:
                return;
        }
    }
}
