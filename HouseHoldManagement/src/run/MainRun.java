package run;

import entity.HouseHold;
import entity.Member;
import logicHandle.MemberHandle;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) throws ParseException {
        while(true) {
            showMenu();
            int functionChoice = functionHandle();
            functionChoose(functionChoice, new HouseHold());
        }

    }

    private static void functionChoose(int functionChoice, HouseHold houseHold) throws ParseException {
        switch (functionChoice) {
            case 1:
                houseHold =addHouseHold();
                break;
            case 2:
                showHouseHoleAndMember(houseHold);
                break;
            case 3:
                System.exit(functionChoice);
        }
    }

    private static void showHouseHoleAndMember(HouseHold houseHold) {
        System.out.println(houseHold.toString());
    }


    private static HouseHold addHouseHold() throws ParseException {
        System.out.println("Nhap so luong ho dan: ");
        int houseHoldNum = new Scanner(System.in).nextInt();
        HouseHold houseHold = null;
        for (int i = 0; i < houseHoldNum; i++) {
            System.out.println("Ho dan thu: " + (i + 1));
            MemberHandle memberHandle = new MemberHandle();
            System.out.println("Nhap id: ");
            int id = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println("Nhap so nha: ");
            String houseNumber = new Scanner(System.in).nextLine();
            ArrayList<Member> members = new ArrayList<Member>();

            System.out.println("Nhap so luong nguoi trong ho dan: ");
            int memberNum = new Scanner(System.in).nextInt();
            for (int j = 0; j < memberNum; j++) {
                System.out.println("Nguoi dan thu " + (j + 1));
                Member member = memberHandle.inputInfo(new Scanner(System.in));
                members.add(member);
            }
            houseHold = new HouseHold(id, houseNumber, members);
        }
        return houseHold;
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
        System.out.println("========== QUẢN LÝ HỘ DÂN ==========");
        System.out.println("1. Nhập thông tin hộ dân.");
        System.out.println("2. Hiển thị thông tin chi tiết của hộ dân.");
        System.out.println("3. Thoát.");
        System.out.println("Chon thao tac: ");
    }

}
