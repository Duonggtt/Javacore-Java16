package ONCLASS;

import java.util.Scanner;

public class DEMO5 {
    public static void main(String[] args) {

        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        if(n < 2) {
            System.out.println("Ko phai so nguyen to !");
            return;
        }
        for (int i = 2;i <= Math.sqrt(n);i++) {
            if(n % i == 0) {
                System.out.println("Ko la so nguyen to");
                return;
            }
        }
        System.out.println("La so nguyen to");
    }
}
