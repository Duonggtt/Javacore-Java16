import entity.TienTe;
import entity.Vang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Vang> dsGiaoDichVang = new ArrayList<>();
    public static List<TienTe> dsGiaoDichTienTe = new ArrayList<>();
    public static void main(String[] args) {
        menuChoice();
    }

    private static void menuChoice() {
        while(true) {
           menuShow();
            int funcChoice;
            do {
                funcChoice = new Scanner(System.in).nextInt();
                if(funcChoice >= 1 && funcChoice <=8 ) {
                    break;
                }
                System.out.println("Vui long chon tao tac hop le!");
            }while(true);

            switch (funcChoice) {
                case 1:
                    nhapDanhSachVang();
                    break;
                case 2:
                    nhapDanhSachTienTe();
                    break;
                case 3:
                    xuatDanhSachVang();
                    break;
                case 4:
                    xuatDanhSachTienTe();
                    break;
                case 5:
                    System.out.println("So luong giao dich vang: " + quantityGoldCaculate());
                    System.out.println("So luong giao dich tien te: " + quantityCashCaculate());
                    break;
                case 6:
                    System.out.println("Trung binh thanh tien cua giao dich tien te la: " + avgCashCaculate());
                    break;
                case 7:
                    xuatGiaoDichLonHon1Ty();
                    break;
                case 8:
                    return;

                default:
                    return;
            }
        }
    }

    private static void menuShow() {
        System.out.println("===========================================");
        System.out.println("1. Nhap danh sach giao dich vang");
        System.out.println("2. Nhap danh sach giao dich tien te");
        System.out.println("3. Xuat danh sach giao dich vang");
        System.out.println("4. Xuat danh sach giao dich tien te");
        System.out.println("5. Tinh tong so luong cho tung loai");
        System.out.println("6. Tinh trung binh thanh tien cua giao dich tien te");
        System.out.println("7. Xuat cac hoa don co gia tri > 1 ty");
        System.out.println("8. Thoat");
        System.out.println("===========================================");
        System.out.println("Chon thao tac muon thuc hien: ");
    }

    public static void nhapDanhSachVang() {
        System.out.println("Nhap so luong giao dich vang can them: ");
        int quantity = new Scanner(System.in).nextInt();
        for(int i =0; i< quantity;i++) {
            Vang vang = new Vang();
            vang.InfoInput();
            dsGiaoDichVang.add(vang);
        }
    }


    public static void xuatDanhSachVang() {
        System.out.println("Danh sach giao dich vang: ");
        for(Vang vang : dsGiaoDichVang) {
            System.out.println(vang);
        }
    }

    public static void nhapDanhSachTienTe() {
        System.out.println("Nhap so luong giao dich tien can them: ");
        int quantity = new Scanner(System.in).nextInt();
        for(int i =0; i< quantity;i++) {
            TienTe tien = new TienTe();
            tien.InfoInput();
            dsGiaoDichTienTe.add(tien);
        }
    }


    public static void xuatDanhSachTienTe() {
        System.out.println("Danh sach giao dich tien: ");
        for(TienTe tien : dsGiaoDichTienTe) {
            System.out.println(tien);
        }
    }

    public static int quantityGoldCaculate() {
        int quantity = 0;
        for(Vang vang : dsGiaoDichVang) {
            quantity += vang.getSoluong();
        }
        return quantity;
    }

    public static int quantityCashCaculate() {
        int quantity = 0;

        for(TienTe tien : dsGiaoDichTienTe) {
            quantity += tien.getSoluong();
        }
        return quantity;
    }

    public static float avgCashCaculate() {
        float res = 0;
        if(dsGiaoDichTienTe.isEmpty()) {
            return 0;
        }
        for(TienTe tien : dsGiaoDichTienTe) {
            if(tien.getLoaiTien().equals("Tien Viet Nam")) {
                res += (float) (tien.getSoluong() * tien.getDongia());
            }else {
                res += (float) (tien.getSoluong() * tien.getDongia() * tien.getTiGia());
            }
        }
        return res / dsGiaoDichTienTe.size();
    }

    public static void xuatGiaoDichLonHon1Ty() {
        System.out.println("Cac don gia vang lon hon 1 ty: ");
        for(Vang vang : dsGiaoDichVang) {
            if(vang.getDongia() > 1000000000) {
                System.out.println(vang);
            }
        }


        System.out.println("Cac don gia tien te lon hon 1 ty: ");
        for(TienTe tien : dsGiaoDichTienTe) {
            if(tien.getDongia() > 1000000000) {
                System.out.println(tien);
            }
        }
    }
}