package BTVN;

import java.util.Scanner;

public class B14 {
    //Bài 14: Nhập số tự nhiên n rồi tính tổng
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(Sum(n));
    }

    public static float Sum(int n) {
        float sum = 0;
        for(int i=1;i<=n;i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
