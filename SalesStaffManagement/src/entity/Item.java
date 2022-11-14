package entity;

import constant.itemTypeConstant;

import java.util.Scanner;

public class Item implements inputTable{

    private static int AUTO_ID = 999;
    private int itemId;
    private String itemName;
    private String itemType;
    private int itemPrice;
    private int itemQuantity;

    public int getAUTO_ID() {
        return AUTO_ID;
    }

    public void setAUTO_ID(int AUTO_ID) {
        this.AUTO_ID = AUTO_ID;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemQuantity=" + itemQuantity +
                '}';
    }

    @Override
    public void inputInfo() {
        AUTO_ID++;
        this.itemId = AUTO_ID;
        System.out.println("Nhap ten mat hang: ");
        this.itemName = new Scanner(System.in).nextLine();
        System.out.println("Chon nhom hang: ");
        System.out.println("1. Dien tu.");
        System.out.println("2. Dien lanh.");
        System.out.println("3. May tinh.");
        System.out.println("4. Thiet bi van phong.");
        int itemTypeTemp;
        do {
            itemTypeTemp = new Scanner(System.in).nextInt();
            if(itemTypeTemp >= 1 && itemTypeTemp <=4) {
                break;
            }
            System.out.println("Nhom hang khong hop le! Vui long chon lai!");
        }while(true);
        switch (itemTypeTemp) {
            case 1:
                this.itemType = itemTypeConstant.ELECTRONIC.value;
                break;
            case 2:
                this.itemType = itemTypeConstant.REFRIGERATION.value;
                break;
            case 3:
                this.itemType = itemTypeConstant.COMPUTER.value;
                break;
            case 4:
                this.itemType = itemTypeConstant.OFFICE_EQUIPMENT.value;
                break;

        }
        System.out.println("Nhap gia ban: ");
        this.itemPrice = new Scanner(System.in).nextInt();
        System.out.println("Nhap so luong mat hang: ");
        this.itemQuantity = new Scanner(System.in).nextInt();
    }
}
