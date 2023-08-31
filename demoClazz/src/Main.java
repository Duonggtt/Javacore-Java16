public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn = hcn.inputInfo();
        hcn.chuVi(hcn);
        hcn.dienTich(hcn);
    }
}