package BTVN;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        //Bài 6: Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
        //  Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4=32

        System.out.println("Nhap so nguyen bat ki: ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;

        while( n != 0) {
            int du = n % 10;
            n = n/10;
            System.out.println(n);
            sum+=du;
        }
        System.out.println(sum);
    }
}
