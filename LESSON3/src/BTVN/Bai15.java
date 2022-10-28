package BTVN;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        //Bài 15: Nhập 2 số tự nhiên m,n rồi kiểm tra xem chúng có nguyên tố cùng nhau không.
        // (Hai số nguyên tố cùng nhau là 2 số có UCLN là 1).

        System.out.println("Nhap m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int UCLN = 1;

        for(int i=1; i < Math.min(m,n); i++) {
            if(m%i==0 && n%i==0) {
                UCLN = i;
            }
        }
        for(int i=2;i<= Math.sqrt(n);i++) {
            for(int j=2;j<= Math.sqrt(m);j++) {
                if(m%j==0 && n%i==0) {
                    System.out.println("Ko phai so nguyen to cung nhau!");
                    return ;
                }
            }
        }if(UCLN == 1) {
            System.out.println("La so nguyen to cung nhau!");
        }
    }
}
