import java.util.Scanner;

public class SinhVien {
    private int id;
    private String name;
    private float diemNam1;
    private float diemNam2;
    private float diemNam3;
    private float diemNam4;

    public SinhVien(int id, String name, float diemNam1, float diemNam2, float diemNam3, float diemNam4) {
        this.id = id;
        this.name = name;
        this.diemNam1 = diemNam1;
        this.diemNam2 = diemNam2;
        this.diemNam3 = diemNam3;
        this.diemNam4 = diemNam4;
    }

    public SinhVien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemNam1() {
        return diemNam1;
    }

    public void setDiemNam1(float diemNam1) {
        this.diemNam1 = diemNam1;
    }

    public float getDiemNam2() {
        return diemNam2;
    }

    public void setDiemNam2(float diemNam2) {
        this.diemNam2 = diemNam2;
    }

    public float getDiemNam3() {
        return diemNam3;
    }

    public void setDiemNam3(float diemNam3) {
        this.diemNam3 = diemNam3;
    }

    public float getDiemNam4() {
        return diemNam4;
    }

    public void setDiemNam4(float diemNam4) {
        this.diemNam4 = diemNam4;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", diemNam1=" + diemNam1 +
                ", diemNam2=" + diemNam2 +
                ", diemNam3=" + diemNam3 +
                ", diemNam4=" + diemNam4 +
                '}';
    }

    SinhVien inputInfo() {
        SinhVien sv = new SinhVien();
        System.out.println("Nhap id: ");
        sv.setId(new Scanner(System.in).nextInt());
        System.out.println("Nhap ten: ");
        sv.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhap diem nam 1: ");
        sv.setDiemNam1(new Scanner(System.in).nextInt());
        System.out.println("Nhap diem nam 2: ");
        sv.setDiemNam2(new Scanner(System.in).nextInt());
        System.out.println("Nhap diem nam 3: ");
        sv.setDiemNam3(new Scanner(System.in).nextInt());
        System.out.println("Nhap diem nam 4: ");
        sv.setDiemNam4(new Scanner(System.in).nextInt());
        return sv;
    }

    float scoreCaculate(SinhVien sv) {
        return (sv.getDiemNam1() + sv.getDiemNam2() + sv.getDiemNam3() + sv.getDiemNam4()) / 4;
    }

    void ratingScore(SinhVien sv) {
        float gpa = scoreCaculate(sv);
        if(gpa > 10) {
            System.out.println("Diem co sai sot khi nhap!");
            return;
        }
        if(gpa > 9 && gpa < 10) {
            System.out.println("A");
            System.out.println("Xuat xac");
        }else if(gpa > 8 && gpa < 9) {
            System.out.println("B+");
            System.out.println("Gioi");
        }else if(gpa > 7 && gpa < 8) {
            System.out.println("B");
            System.out.println("Kha");
        }else if(gpa > 6 && gpa <7) {
            System.out.println("C+");
            System.out.println("Trung binh kha");
        }else if(gpa > 5 && gpa < 6) {
            System.out.println("C");
            System.out.println("Trung binh");
        }else if(gpa > 4 && gpa < 5) {
            System.out.println("D");
            System.out.println("Yeu");
        }else {
            System.out.println("F");
            System.out.println("Kem");
        }
    }

    void outputInfo(SinhVien sv) {
        System.out.println("Id : " + sv.getId());
        System.out.println("Ten : " + sv.getName());
        System.out.println("Diem tong ket : " + scoreCaculate(sv));
        ratingScore(sv);
    }
}
