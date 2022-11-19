package run;

import entity.SummonRift;
import logicHandle.InputOutputHandle;

import java.util.Scanner;

public class MainRun {

    public static SummonRift summonRift = new SummonRift();

    public static void main(String[] args) throws NumberFormatException{
        while(true) {
            showMenu();
            int functionChoice = functionHandle();
            functionChoose(functionChoice);
        }
    }

    private static void functionChoose(int functionChoice) {
        switch (functionChoice) {
            case 1:
                summonRift = InputOutputHandle.inputInfo();
                break;
            case 2:
                InputOutputHandle.outputInfo(summonRift);
                break;
            case 3:
                System.exit(functionChoice);
        }
    }

    private static int functionHandle() {
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if(functionChoice >=1 && functionChoice <=3) {
                break;
            }
            System.out.println("Vui long chon thao tac hop le!Chon lai: ");
        }while(true);
        return functionChoice;
    }

    private static void showMenu() {
        System.out.println("====================== SummonRift ======================");
        System.out.println("1. Nhap thong tin cho 2 teams");
        System.out.println("2. Hien thi thong tin 2 teams");
        System.out.println("3. Thoat");
    }

}
