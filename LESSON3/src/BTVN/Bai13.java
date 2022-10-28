package BTVN;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        //Bài 13: Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7.

        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int sum =0;
        for(int i=0;i <= n ; i++) {
            if(i % 7 ==0) {
                sum+=i;
            }
        }
        System.out.printf("Tong cac so tu nhien ko lon hon %d va chia het cho 7 la: %d",n,sum);
    }
}
