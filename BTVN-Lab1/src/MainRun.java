import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {

    public static ArrayList<Member> memberList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Nhap so luong member: ");
        int memberNum = new Scanner(System.in).nextInt();
        for(int i = 0; i<memberNum; i++) {
            memberList.add(Member.infoInput());
        }
        showMember();
    }

    private static void showMember() {
        for (Member i : memberList) {
            System.out.println(i);
        }
    }


}
