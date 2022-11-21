package run;

import entity.School;
import logicHandle.ClazzHandle;
import logicHandle.SchoolHandle;
import logicHandle.StudentHandle;

import java.text.ParseException;
import java.util.Scanner;

public class MainRun {

    private static School school = new School();
    public static void main(String[] args) throws ParseException {
        while(true){
            showMenu();
            int functionChoose = functionHandle();
            functionChoice(functionChoose);
        }
    }

    private static int functionHandle() {
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if(functionChoice >=1 && functionChoice <=5) {
                break;
            }
            System.out.println("This manipulation is not valid! Choose again: ");
        }while(true);
        return functionChoice;
    }

    private static void functionChoice(int functionChoose) throws ParseException {
        switch (functionChoose) {
            case 1:
                school = SchoolHandle.inputInfo();

                break;
            case 2:
                SchoolHandle.outputInfo(school);
                break;
            case 3:
//                StudentHandle.getStudentByYearAndAdress();
                break;
            case 4:
                ClazzHandle.exportStudentByClazz();
                break;
            case 5:
                System.exit(functionChoose);
        }
    }

    private static void showMenu() {
        System.out.println("====================== SCHOOL MANAGEMENT ======================");
        System.out.println("1. Enter student information.");
        System.out.println("2. Export student information");
        System.out.println("3. Export information of students born in 1985 and from Hanoi.");
        System.out.println("4. Export information of students in class 10A1.");
        System.out.println("5. Exit.");
    }


}
