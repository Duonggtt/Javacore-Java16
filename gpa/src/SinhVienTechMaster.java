import java.util.Scanner;

public class SinhVienTechMaster {

    private String name;
    private String nganh;
    private Double diem;
    private String hocluc;

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVienTechMaster{" +
                "name='" + name + '\'' +
                ", nganh='" + nganh + '\'' +
                ", diem=" + diem +
                ", hocluc='" + hocluc + '\'' +
                '}';
    }

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.setName(scanner.nextLine());
        System.out.println("Nhap nganh: ");
        this.setNganh(scanner.nextLine());
        System.out.println("Nhap diem: ");
        this.setDiem(scanner.nextDouble());

    }

    public void getHocLuc(){
        if(diem < 5){
            this.setHocluc("YEU");
        }else if(diem >= 5 && diem < 6.5){
            this.setHocluc("TRUNG BINH");
        }else if(diem >=6.5 && diem < 7.5){
            this.setHocluc("KHA");
        }else if(diem >= 7.5 && diem <=10){
            this.setHocluc("GIOI");
        }else {
            this.setHocluc("DUP");
        }
    }

    public  void Xuat(){
        System.out.println("Ten hoc vien: " + name);
        System.out.println("Nganh: " + nganh);
        System.out.println("DiemL " + diem);
        System.out.println("Hoc luc: " + hocluc);
    }
}
