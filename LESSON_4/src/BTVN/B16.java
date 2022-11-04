package BTVN;

import java.util.Scanner;

public class B16 {
    //Bài 16: Nhập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.

    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("So chan nho hon %d la: ",n);
        Sochan(n);
        System.out.printf("\nSo le nho hon %d la: ", n);
        Sole(n);
    }

    public static void Sochan(int n) {
        for(int i=1;i<n;i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Sole(int n) {
        for(int i=1;i<n;i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
