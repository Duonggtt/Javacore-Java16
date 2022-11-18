package run;

import entity.Items;
import logicHandle.listHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {

    public static void main(String[] args) {
        while(true) {
            Items items = new Items();
            ArrayList<Items> listItem = new ArrayList<>();
            showMenu();
            int functionChoice = functionHandle();
            functionChoose(functionChoice);
        }
    }

    private static int functionHandle() {
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if(functionChoice >=1 && functionChoice <=7) {
                break;
            }
            System.out.println("Vui long chon thao tac phu hop!Moi ban chon lai: ");
        }while(true);
        return functionChoice;
    }

    private static void functionChoose(int functionChoice) {
        switch (functionChoice) {
            case 1:
                listHandle.addArrayList();
                break;
            case 2:
                listHandle.showArrayList();
                break;
            case 3:
                listHandle.searchItemByName();
                break;
            case 4:
                listHandle.searchItemById();
                break;
            case 5:
                listHandle.searchItemByQuantity();
                break;
            case 6:
                listHandle.searchItemByPrice();
                break;
            case 7:
                System.exit(functionChoice);
        }
    }

    private static void showMenu() {
        System.out.println("\n\n=================== CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ===================\n");
        System.out.println("1. Nhập danh sách sản phẩm.");
        System.out.println("2. Xem danh sách sản phẩm.");
        System.out.println("3. Tìm sản phẩm theo tên.");
        System.out.println("4. Tìm sản phẩm theo id.");
        System.out.println("5. Tìm các sản phẩm có số lượng dưới 5.");
        System.out.println("6. Tìm các sản phẩm theo mức giá.");
        System.out.println("7. Thoát chương trình.");
        System.out.println("\n============================================================================");
        System.out.println("\nChọn thao tác muốn thực hiện: ");
    }

}
