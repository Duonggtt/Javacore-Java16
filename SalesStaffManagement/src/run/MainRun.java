package run;

import java.util.Scanner;

import entity.Item;
import entity.SalesList;
import entity.Staff;
import logicHandle.ItemLogicHandle;
import logicHandle.SalesListManagement;
import logicHandle.StaffLogicHandle;

import static logicHandle.SalesListManagement.showSalesListManagement;

public class MainRun {

    public static Item[] items = new Item[1000];
    public static Staff[] staffs = new Staff[1000];
    public static SalesList[] salesLists = new SalesList[1000];
    public static int staffcount = 0;
    public static int itemCount = 0;

    public static void main(String[] args) {
        while(true) {
            showMenu();
            int functionChoice = functionHandle();
            functionChoose(functionChoice);
        }
    }

    private static void functionChoose(int functionChoice) {
        switch (functionChoice) {
            case 1:
                ItemLogicHandle.itemInput();
                break;
            case 2:
                System.out.println("\n\n=================== Xuat ra danh sach mat hang ===================\n");
                ItemLogicHandle.itemOutput();
                break;
            case 3:
                StaffLogicHandle.staffInput();
                break;
            case 4:
                System.out.println("\n\n=================== Xuat ra danh sach nhan vien ===================\n");
                StaffLogicHandle.staffOutput();
                break;
            case 5:
                SalesListManagement.salesListManagementhandle();
                showSalesListManagement();
                break;
            case 6:
                SalesListManagement.sortSalesListManagement();
                showSalesListManagement();
                break;
            case 7:
                SalesListManagement.staffSalary();
                break;
            case 8:
                System.exit(functionChoice);
        }
    }

    private static int functionHandle() {
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if(functionChoice >=1 && functionChoice <= 8) {
                break;
            }
            System.out.println("Thao tac khong hop le! Vui long chon lai!");
        }while(true);
        return functionChoice;
    }

    private static void showMenu() {
        System.out.println("\n\n========================= CHUONG TRINH QUAN LY NHAN VIEN BAN HANG =========================\n");
        System.out.println("1. Nhap danh sach mat hang.");
        System.out.println("2. Xuat danh sach mat hang.");
        System.out.println("3. Nhap danh sach nhan vien.");
        System.out.println("4. Xuat danh sach nhan vien.");
        System.out.println("5. Lap bang danh sach ban hang.");
        System.out.println("6. Sap xep danh sach ban hang.");
        System.out.println("7. Lap bang ke doanh thu moi nhan vien.");
        System.out.print("\n8. Thoat chuong trinh.");
        System.out.println("\n\n===========================================================================================\n");
        System.out.print("Chon thao tac ban muon thuc hien: ");
    }

}
