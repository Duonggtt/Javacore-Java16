package caculatesalary.entity;


public class Nhanvien {
    protected String maNv;
    protected String hoTen;
    protected String namSinh;

    public Nhanvien(String maNv, String hoTen, String namSinh) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public Nhanvien() {
    }

    public String getMaNv() {
        return maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    
    @Override
    public String toString() {
        return "Nhanvien{" +
                "maNv='" + maNv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh='" + namSinh + '\'' +
                '}';
    }
}
