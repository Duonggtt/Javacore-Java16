package logicHandle;

import entity.Item;
import entity.SalesList;
import entity.SalesListDetail;
import entity.Staff;
import run.MainRun;

import java.util.Scanner;

public class SalesListManagement {

    public static void salesListManagementhandle() {
        if(!isCheckValid()) {
            System.out.println("Vui long nhap thong tin nhan vien va mat hang truoc!");
            return;
        }
        System.out.println("Nhap so luong nhan vien muon them vao bang: ");
        int staffNumber;
        do {
            staffNumber = new Scanner(System.in).nextInt();
            if(staffNumber <= MainRun.staffcount) {
                break;
            }
            System.out.println("So luong nhan vien vuot qua du lieu hien co! Vui long nhap lai!");
        }while(true);
        for(int i = 0;i<staffNumber;i++) {
            System.out.println("Nhan vien thu " + (i+1) + " : ");
            System.out.println("Nhap ma nhan vien: ");
            Staff staff = null;
            int staffId;
            do {
                staffId = new Scanner(System.in).nextInt();
                for(int j = 0; j< MainRun.staffs.length;j++) {
                    if(MainRun.staffs[j] != null && MainRun.staffs[j].getId() == staffId) {
                        staff = MainRun.staffs[j];
                        break;
                    }
                }
            if(staff != null) {
                break;
            }
            System.out.println("Ma nhan vien khong hop le! Vui long nhap lai!");
            }while(true);
            System.out.println("Nhap so luong mat hang can them vao bang : ");
            int itemNum;
            do {
                itemNum = new Scanner(System.in).nextInt();
                if(itemNum >=0 && itemNum <= 5 && itemNum <= MainRun.itemCount) {
                    break;
                }
                System.out.println("So luong mat hang da vuot qua du lieu hien co! Vui long nhap lai!");
            }while(true);
            for(int j=0;j<staffNumber;j++) {
                System.out.println("Nhap ma mat hang: ");
                Item item = null;
                int count = 0;
                int total = 0;
                SalesListDetail[] detail = new SalesListDetail[itemNum];
                int itemId;
                do {
                    itemId = new Scanner(System.in).nextInt();
                    for(int k = 0;k< MainRun.items.length;k++) {
                        if(MainRun.items[k] != null && MainRun.items[k].getItemId() == itemId) {
                            item = MainRun.items[k];
                            break;
                        }
                    }
                    if(item == null) {
                        System.out.println("Ma mat hang khong hop le!Vui long nhap lai!");
                        continue;
                    }
                    boolean idCheck = false;
                    for(int k=0;k<= MainRun.items.length;k++) {
                        if(MainRun.items[k] != null && MainRun.items[k].getItemId() == itemId) {
                            idCheck = true;
                            break;
                        }
                    }
                    if(!idCheck) {
                        break;
                    }
                    System.out.println("ban vua moi nhap mat hang nay roi! Vui long nhap lai!");
                }while(true);
                System.out.println("Nhap so luong ban duoc cua mat hang mang ma " + itemId + " : ");
                int itemQuantity = new Scanner(System.in).nextInt();
                detail[count] = new SalesListDetail(item,itemQuantity);
                count++;
                SalesList salesList =new SalesList(staff,detail);
                saveSalesListManagement(salesList);
            }
        }
    }

    private static void saveSalesListManagement(SalesList salesList) {
        for (int i = 0; i < MainRun.salesLists.length; i++) {
            if (MainRun.salesLists[i] == null) {
                MainRun.salesLists[i] = salesList;
                break;
            }
        }
    }

    public static void showSalesListManagement() {
        System.out.println("\n\n=========================== BANG DANH SACH QUAN LY BAN HANG ===========================\n");
        for (int i = 0; i < MainRun.salesLists.length; i++) {
            if (MainRun.salesLists[i] != null) {
                System.out.println(MainRun.salesLists[i]);
            }
        }
        System.out.println("\n=========================================================================================\n\n");
    }

    private static boolean isCheckValid() {
        boolean isValidStaff = false;
        for(int i=0;i<MainRun.staffs.length;i++) {
            if(MainRun.staffs[i] != null) {
                isValidStaff = true;
                break;
            }
        }
        boolean isValidItem = false;
        for(int i=0;i<MainRun.items.length;i++) {
            if(MainRun.items[i] != null) {
                isValidItem = true;
                break;
            }
        }
        return isValidStaff && isValidItem;
    }

    public static void sortSalesListManagement() {
        System.out.println("Chon phuong thuc sap xep: ");
        System.out.println("1. Sap xep theo ten nhan vien.");
        System.out.println("2. Sap xep theo nhom mat hang.");
        System.out.println("3. Thoat chuong trinh.");
        int sortFunctionChoice;
        do {
            sortFunctionChoice = new Scanner(System.in).nextInt();
            if(sortFunctionChoice >=1 && sortFunctionChoice <= 3) {
                break;
            }
            System.out.println("Thao tac khong hop le! Vui long chon lai!");
        }while(true);
        switch (sortFunctionChoice) {
            case 1:
                sortByStaffName();
                break;
            case 2:
                sortByItemType();
                break;
            case 3:
                return;
        }
    }

    private static void sortByItemType() {
        for(int i = 0;i<MainRun.salesLists.length;i++) {
            SalesList salesList = MainRun.salesLists[i];
            if(MainRun.salesLists[i] == null) {
                continue;
            }
            SalesListDetail[] salesListDetails = new SalesListDetail[i];
            for(int j=0;j<salesListDetails.length-1;j++) {
                for(int k=j+1;k<salesListDetails.length;k++) {
                    if(salesListDetails[j] == null) {
                        continue;
                    }
                    if(salesListDetails[j].getItem().getItemType().compareTo(salesListDetails[k].getItem().getItemType()) > 0) {
                        SalesListDetail temp = salesListDetails[j];
                        salesListDetails[j] = salesListDetails[k];
                        salesListDetails[k] = temp;
                    }
                }
            }
        }
    }

    private static void sortByStaffName() {
        for(int i =0;i<MainRun.salesLists.length - 1;i++) {
            if(MainRun.salesLists[i] == null) {
                continue;
            }
            for(int j=i+1;j<MainRun.salesLists.length;j++) {
                if(MainRun.salesLists[j] == null) {
                    continue;
                }
                if(MainRun.salesLists[i].getStaff().getName().compareTo(MainRun.salesLists[j].getStaff().getName()) > 0) {
                    SalesList temp = MainRun.salesLists[i];
                    MainRun.salesLists[i] = MainRun.salesLists[j];
                    MainRun.salesLists[j] = temp;
                }
            }
        }
    }

    public static void staffSalary() {
        for(int i=0;i<MainRun.salesLists.length;i++) {
            if(MainRun.staffs[i] == null) {
                continue;
            }
            double salary = 0;
            SalesListDetail[] salesListDetails = MainRun.salesLists[i].getSalesListDetails();
            for(int j=0;j<salesListDetails.length;j++) {
                if(salesListDetails[j] == null) {
                    continue;
                }
                salary += salesListDetails[j].getQuantity() * salesListDetails[j].getItem().getItemPrice();
            }
            System.out.println("Doanh thu cua nhan vien ten " + MainRun.staffs[i].getName() + " la : " + salary);

        }
    }
}
