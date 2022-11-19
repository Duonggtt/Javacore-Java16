package logicHandle;

import entity.Member;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemberHandle {

    public Member inputInfo(Scanner scanner) throws ParseException {
        System.out.println("Nhap ten nguoi dan : ");
        String name = scanner.nextLine();
        System.out.println("Nhap ngay sinh nguoi dan : ");
        String dob = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = simpleDateFormat.parse(dob);
        System.out.println("Nhap cong viec nguoi dan : ");
       String job = scanner.nextLine();

        Member member = new Member(name, date, job);
        return member;
    }
}
