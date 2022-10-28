package BTVN;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        // Viết chương trình nhập hai số nguyên n,m và in ra hình chữ nhật rỗng các dấu * kích thước n*m. Ví dụ với n=5,m=4:
        //*  *  *  *  *
        //*           *
        //*           *
        //*  *  *  *  *

        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap m: ");
        int m = new Scanner(System.in).nextInt();

        for(int i =1; i<=m ;i++) {
            for(int j=1; j<=n;j++) {
                if(j == 1 || j == n || i == 1 || i ==m){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
