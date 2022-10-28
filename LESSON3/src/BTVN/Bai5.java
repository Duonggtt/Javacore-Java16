package BTVN;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        //Bài 5: Một số được gọi là số thuận nghịch nếu ta đọc từ trái sang phải hay từ phải sang trái
        // số đó ta vẫn nhận được một số giống nhau.
        // Hãy nhập một số và kiểm tra xem số đó có phải số thuật nghịch hay không (ví dụ số: 558855).

        System.out.println("Nhap n: ");
        long n = new Scanner(System.in).nextLong();
        long reverseNum = 0;
        long m = n;
        while(m > 0) {
            reverseNum = reverseNum * 10 + m % 10;
            m/=10;
        }
        if(reverseNum == n) {
            System.out.println("la so thuan nghich");
        }
        else {
            System.out.println("Ko la so thuan nghich");
        }



    }
}
