import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<GiaoDichNha> danhSachGiaoDichNha = new ArrayList<>();
    public static List<GiaoDichDat> danhSachGiaoDichDat = new ArrayList<>();


    public static void main(String[] args) {
        while(true) {
            showMenu();
            funcChoiceMenu();
        }
    }


    //function chon menu
    private static void funcChoiceMenu() {
        int funcChoice;
        do {
            funcChoice = new Scanner(System.in).nextInt();
            if(funcChoice >=1 && funcChoice <=8) {
                break;
            }
            System.out.println("Vui long chon thao tac phu hop!");
        }while(true);
        switch (funcChoice) {
            case 1:
                nhapDanhSachGiaoDichDat();
                break;
            case 2:
                nhapDanhSachGiaoDichNha();
                break;
            case 3:
                xuatDanhSachGiaoDichDat();
                break;
            case 4:
                xuatDanhSachGiaoDichNha();
                break;
            case 5:
                tongSoLuongTungLoaiGiaoDich();
                break;
            case 6:
                System.out.println("Trung binh thanh tien cua giao dich dat: " + trungBinhThanhTienGdDat());;
                break;
            case 7:
                xuatGdTheoThangVaNam();
                break;
            case 8:
                System.exit(0);
            default:
                return;
        }
    }

    //menu cho thao tac
    private static void showMenu() {
        System.out.println("=====================================================");
        System.out.println("1. Nhap danh sach giao dich DAT");
        System.out.println("2. Nhap danh sach giao dich NHA");
        System.out.println("3. Xuat danh sach giao dich DAT");
        System.out.println("4. Xuat danh sach giao dich NHA");
        System.out.println("5. Tong so luong giao dich cua tung loai");
        System.out.println("6. Tinh trung binh thanh tien cua giao dich DAT");
        System.out.println("7. Xuat danh sach cac giao dich thang 9 nam 2023");
        System.out.println("8. Thoat");
        System.out.println("=====================================================");
        System.out.println("Chon thao tac :");
    }

    //Nhap du lieu
    public static void nhapDanhSachGiaoDichDat() {
        System.out.println("Nhap so giao dich dat can them vao danh sach: ");
        int n = new Scanner(System.in).nextInt();
        for(int i =0;i<n;i++) {
            GiaoDichDat gd = new GiaoDichDat();
            gd.InfoInput();
            danhSachGiaoDichDat.add(gd);
        }
    }

    public static void nhapDanhSachGiaoDichNha() {
        System.out.println("Nhap so giao dich nha can them vao danh sach: ");
        int n = new Scanner(System.in).nextInt();
        for(int i =0;i<n;i++) {
            GiaoDichNha gd = new GiaoDichNha();
            gd.InfoInput();
            danhSachGiaoDichNha.add(gd);
        }
    }

    //Xuat du lieu
    public static void xuatDanhSachGiaoDichDat() {
        if(danhSachGiaoDichDat.isEmpty()) {
            System.out.println("Chua co du lieu cho danh sach nay!");
            return;
        }
        System.out.println("Danh sach giao dich dat: ");
        for(GiaoDichDat gd : danhSachGiaoDichDat) {
            System.out.println(gd);
        }
    }

    public static void xuatDanhSachGiaoDichNha() {
        if(danhSachGiaoDichNha.isEmpty()) {
            System.out.println("Chua co du lieu cho danh sach nay!");
            return;
        }
        System.out.println("Danh sach giao dich nha: ");
        for(GiaoDichNha gd : danhSachGiaoDichNha) {
            System.out.println(gd);
        }
    }

    public static void tongSoLuongTungLoaiGiaoDich() {
        System.out.println("Tong so luong giao dich nha: " + danhSachGiaoDichNha.size());
        System.out.println("Tong so luong giao dich dat: " + danhSachGiaoDichDat.size());
    }

    public static float trungBinhThanhTienGdDat() {
        float res = 1;
        float avg;
        if(danhSachGiaoDichDat.isEmpty()) {
            System.out.println("Danh sach giao dich dat chua co du lieu");
            return 0;
        }
        for(GiaoDichDat gd : danhSachGiaoDichDat) {
            if(gd.getLoaiDat().equals("Loai dat A")) {
                res += gd.donGia * gd.dienTich * 1.5;
            }else {
                res += gd.donGia * gd.dienTich;
            }
        }
        avg = res / danhSachGiaoDichDat.size();
        return avg;
    }

    public static void xuatGdTheoThangVaNam() {
        for(GiaoDichDat gd : danhSachGiaoDichDat) {
            if(gd.ngayGiaoDich.endsWith("/09/2023")) {
                System.out.println(gd);
            }
        }
        if(danhSachGiaoDichDat.isEmpty()) {
            System.out.println("Chua co du lieu cho danh sach giao dich nha!");
        }

        for(GiaoDichNha gd : danhSachGiaoDichNha) {
            if(gd.ngayGiaoDich.endsWith("/09/2023")) {
                System.out.println(gd);
            }
        }
        if(danhSachGiaoDichNha.isEmpty()) {
            System.out.println("Chua co du lieu cho danh sach giao dich dat!");
        }
    }
}