package BTVN;

import java.util.Scanner;

public class B17 {
    //Bài 17: Nhập 2 số tự nhiên m,n rồi kiểm tra xem chúng có nguyên tố cùng nhau không.
    // (Hai số nguyên tố cùng nhau là 2 số có UCLN là 1).

    public static void main(String[] args) {
        System.out.println("Nhap m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        if(UCLN(m,n)) {
            System.out.println("La 2 so nguyen to cung nhau!");
        }else {
            System.out.println("Ko la 2 so nguyen to cung nhau!");
        }
    }

    public static boolean UCLN(int m,int n) {
        int ucln = 1;
        for(int i=1;i<Math.min(m,n);i++) {
            if(m % i ==0 && n % i ==0) {
                    ucln = i;
            }
        }
        if(ucln == 1) {
            return true;
        }
        return false;
    }
}
