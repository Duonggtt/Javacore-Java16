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
}
