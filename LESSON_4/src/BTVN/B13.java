package BTVN;

import java.util.Scanner;

public class B13 {
    //Bài 13: Nhập vào 2 số tự nhiên m và n, sao cho m < n.
    // Hãy liệt kê các số chính phương trong đoạn [m,n]. Có bao nhiêu số chính phương?
    public static void main(String[] args) {
        System.out.println("Nhap m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        KiemTraDK(m,n);
        ChinhPhuong(m,n);
    }

    public static void KiemTraDK(int m,int n) {
        while(m>n) {
            System.out.println("Vui long nhap m > n!");
            System.out.println("Nhap m: ");
            m = new Scanner(System.in).nextInt();
            System.out.println("Nhap n: ");
            n = new Scanner(System.in).nextInt();
        }
    }

    public static void ChinhPhuong(int m,int n) {
        int count = 0;
        for(int i = m; i< n; i++) {
            if(Math.sqrt(i) - Math.floor(Math.sqrt(i)) == 0) {
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.printf("\nCo tat ca %d so chinh phuong trong khoang tu m -> n !",count);
    }
}
