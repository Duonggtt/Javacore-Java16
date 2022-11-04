package BTVN;

import java.util.Scanner;

public class B15 {
    //Bài 15: Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7.
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("\nTong = " + Sum(n));
    }

    public static int Sum(int n) {
        int sum = 0;
        for(int i=0;i<n;i++) {
            if(i < n && i %7 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
