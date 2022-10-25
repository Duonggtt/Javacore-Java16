package BTVN;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        //Bài 4: Nhập vào ngày tháng năm sinh của một người theo định dạng nhất định, tính tuổi của người đó
        // (chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng).

        Scanner sc = new Scanner(System.in);

        String Somebody;
        System.out.println("Nhap vao ngay sinh cua ban");
        Somebody = sc.nextLine();

        LocalDate currenTime = LocalDate.now();
        LocalDate birthday = LocalDate.parse(Somebody, DateTimeFormatter.ofPattern("dd/MM/yyyy"));


        System.out.println("Thoi gian hien tai la: " + currenTime);
        System.out.println("Ngay sinh cua ban la: " + birthday);

        Duration handel = Duration.between(birthday.atStartOfDay(), currenTime.atStartOfDay());
        System.out.println("Ban nam nay " + handel.toDays() / 365 + " tuoi !");
    }
}
