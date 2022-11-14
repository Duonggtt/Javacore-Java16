package logicHandle;

import entity.Item;
import run.MainRun;

import java.util.Scanner;

public class ItemLogicHandle {

    public static void itemInput() {
        System.out.println("Nhap so luong mat hang can quan ly: ");
        int itemNum = new Scanner(System.in).nextInt();
        for(int i=0;i< itemNum;i++) {
            System.out.println("Nhap vao mat hang thu " + (i+1) + " : ");
            Item item = new Item();
            item.inputInfo();
            for(int j=0 ; j<MainRun.items.length;j++) {
                if(MainRun.items[j] == null) {
                    MainRun.items[j] =item;
                    break;
                }
            }
        }
        MainRun.itemCount += itemNum;
    }

    public static void itemOutput() {
        for(int i=0;i<MainRun.items.length;i++) {
            if(MainRun.items[i] != null) {
                System.out.println(MainRun.items[i]);
            }
        }
    }
}
