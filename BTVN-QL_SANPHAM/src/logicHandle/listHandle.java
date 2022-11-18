package logicHandle;

import entity.Items;
import run.MainRun;

import java.util.ArrayList;
import java.util.Scanner;

public class listHandle {

    public static ArrayList<Items> listItem = new ArrayList<>();
    public static Items items = new Items();
    public static void showArrayList() {
        for (Items i : listItem) {
            System.out.println(i);
        }
    }

    public static void addArrayList() {
        System.out.println("Nhap vao so luong mat hang can quan ly: ");
        int itemsNum = new Scanner(System.in).nextInt();
        for(int i=0;i<itemsNum;i++) {
            System.out.println("Mat hang thu " + (i+1) + " : ");
            listItem.add(Items.itemInput());
        }
    }

    public static void searchItemByName() {
        System.out.println("Nhap vao ten mat hang ban muon tim kiem: ");
        String itemssearch = new Scanner(System.in).nextLine();
        boolean isCheck = false;
        for(int i = 0; i<listItem.size();i++) {
            if(listItem.get(i).getName().equals(itemssearch)) {
                isCheck = true;
                System.out.println("Da tim thay san pham!");
                System.out.println(listItem.get(i));
            }
        }
        if(!isCheck) {
            System.out.println("Khong tim thay san pham co ten do!");
        }
    }

    public static void searchItemById() {
        boolean isCheck = false;
        System.out.println("Nhap vao id mat hang ban muon tim kiem: ");
        int itemId = new Scanner(System.in).nextInt();
        for(int i = 0; i<listItem.size();i++) {
            if(listItem.get(i).getId() == itemId) {
                isCheck = true;
                System.out.println("Da tim thay san pham!");
                System.out.println(listItem.get(i));
            }
            System.out.println("===============================");
            System.out.println("1. Xoa san pham.");
            System.out.println("2. Cap nhat so luong san pham.");
            System.out.println("3. Thoat.");
            System.out.println("===============================");
            System.out.println("Chon thao tac: ");
            int itemsChoice;
            do{
                itemsChoice = new Scanner(System.in).nextInt();
                if(itemsChoice >=0 && itemsChoice <=3) {
                    break;
                }
                System.out.println("Vui long chon thao tac hop le!Chon lai: ");
            }while(true);
            switch (itemsChoice) {
                case 1:
                    if(listItem.get(i).getId() == itemId) {
                        listItem.remove(listItem.get(i));
                    }
                    System.out.println("Da xoa san pham co id " + itemId);
                    break;
                case 2:
                    System.out.println("Nhap so luong muon cap nhat cho san pham: ");
                    if(listItem.get(i).getId() == itemId) {
                        listItem.get(i).setQuantity(new Scanner(System.in).nextInt());
                    }
                    break;
                case 3:
                    return;
            }
        }
        if(!isCheck) {
            System.out.println("Khong tim thay san pham co ten do!");
        }
    }

    public static void searchItemByQuantity() {
        boolean isCheck = false;
        for(int i = 0; i<listItem.size();i++) {
            if(listItem.get(i).getQuantity() < 5) {
                isCheck = true;
                System.out.println("Da tim thay san pham co so luong nho hon 5!");
                System.out.println(listItem.get(i));
            }
        }
        if(!isCheck) {
            System.out.println("Khong tim thay san pham co so luong nho hon 5 trong list san pham!");
        }
    }

    public static void searchItemByPrice() {
        System.out.println("Tim san pham theo muc gia: ");
        System.out.println("===============================");
        System.out.println("1. Duoi 50.000");
        System.out.println("2. Tu 50.000 - 100.000");
        System.out.println("3. Tren 100.000");
        System.out.println("4. Thoat");
        System.out.println("===============================");
        System.out.println("Chon thao tac: ");
        int itemPriceChoice;
        do{
            itemPriceChoice = new Scanner(System.in).nextInt();
            if(itemPriceChoice >=1 && itemPriceChoice <= 4) {
                break;
            }
            System.out.println("Vui long chon thao tac hop le!Chon lai: ");
        }while(true);
        switch (itemPriceChoice) {
            case 1:
                searchItemByPriceBelow();
                break;
            case 2:
                searchItemByPriceBetween();
                break;
            case 3:
                searchItemByPriceAbove();
                break;
            case 4:
                return;
        }
    }

    private static void searchItemByPriceAbove() {
        boolean isCheck = false;
        for(int i = 0; i<listItem.size();i++) {
            if(listItem.get(i).getPrice() > 100000) {
                isCheck = true;
                System.out.println("Da tim thay san pham!");
                System.out.println(listItem.get(i));
            }
        }
        if(!isCheck) {
            System.out.println("Khong tim thay san pham co gia tren 100.000!");
        }
    }

    private static void searchItemByPriceBetween() {
        boolean isCheck = false;
        for(int i = 0; i<listItem.size();i++) {
            if(listItem.get(i).getPrice() >= 50000 && listItem.get(i).getPrice() <= 100000) {
                isCheck = true;
                System.out.println("Da tim thay san pham!");
                System.out.println(listItem.get(i));
            }
        }
        if(!isCheck) {
            System.out.println("Khong tim thay san pham co gia tu 50.000 - 100.000!");
        }
    }

    private static void searchItemByPriceBelow() {
        boolean isCheck = false;
        for(int i = 0; i<listItem.size();i++) {
            if(listItem.get(i).getPrice() < 50000) {
                isCheck = true;
                System.out.println("Da tim thay san pham!");
                System.out.println(listItem.get(i));
            }
        }
        if(!isCheck) {
            System.out.println("Khong tim thay san pham co gia duoi 50.000!");
        }
    }
}
