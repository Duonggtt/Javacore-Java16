package BTVN;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {

        //Bài 5:
        //a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó.
        // Tìm kiếm vị trí xuất hiện đầu tiên và cuối cùng của ký tự đó trong chuỗi vừa nhập.
        //b. Nhập 3 xâu ký tự ký tự s, s1, s2.
        // Tìm tất cả những lần xuất hiện của s1 trong s và thay thế bằng s2.
        // Xuất s ra màn hình Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 = “123”.
        // Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E”


        Scanner sc = new Scanner(System.in);

        //a.====================================

        int i=0;
        System.out.println("Nhap vao chuoi bat ki: ");
        String str = sc.nextLine();
        System.out.println("Nhap vao ki tu bat ki: ");

        char kitu = sc.next().charAt(0);

        System.out.println("Vi tri xuat hien dau tien cua ki tu" + kitu + " la : " + str.indexOf(kitu));
        System.out.println("Vi tri xuat hien dau tien cua ki tu" + kitu + " la : " + str.lastIndexOf(kitu));


        //b.====================================

        System.out.println("Nhap vao xau s: ");
        String s = sc.nextLine();
        System.out.println("Nhap vao xau s1: ");
        String s1 = sc.nextLine();
        System.out.println("Nhap vao xau s2: ");
        String s2 = sc.nextLine();

        String result = s.replace(s1, s2);

        System.out.println("s = " + "\"" + s + "\"");
        System.out.println("s1 = " + "\"" + s1 + "\"");
        System.out.println("s2 = " + "\"" + s2 + "\"");
        System.out.println("Kết quả xâu ký tự s sẽ là: " + "\"" + result + "\"");

    }
}
