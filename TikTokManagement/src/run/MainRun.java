package run;

import entity.Followers;
import entity.Idols;
import entity.Songs;
import entity.TikTok;
import logicHandle.inputOutputHandle;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {

    private static TikTok tikTok = new TikTok();


    public static void main(String[] args) throws ParseException {
        while(true) {
            showMenu();
            int functionChoice = functionHandle();
            functionChoose(functionChoice);
        }
    }

    private static void functionChoose(int functionChoice) throws ParseException {
        switch (functionChoice) {
            case 1:
                tikTok =inputOutputHandle.infoInput();
                break;
            case 2:
                inputOutputHandle.outputInfo(tikTok);
                break;
            case 3:
                System.exit(functionChoice);
        }
    }

    private static int functionHandle() {
        int functionChoice;
        do{
            functionChoice = new Scanner(System.in).nextInt();
            if(functionChoice >=1 && functionChoice <= 3) {
                break;
            }
            System.out.println("Thao tác không hợp lệ! Nhập lại: ");
        }while(true);
        return functionChoice;
    }

    private static void showMenu() {
        System.out.println("============ TIKTOK ============");
        System.out.println("1. Nhap thong tin tiktok");
        System.out.println("2. In ra thong tin chi tiet");
        System.out.println("3. Thoat");
        System.out.println("Chọn chức năng: ");
    }

}
