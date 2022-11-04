package BTVN;

import java.util.Scanner;

public class B28 {
    //Bài 28: Thực hiện nhập vào ma trận vuông số nguyên a có n dòng và n cột (n>0).
    // Tính tổng đường chéo chính của ma trận này.
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap mang a: ");
        int[][] a = new int[n][n];
        Nhap(a,n);
        System.out.println("Tong duong cheo chinh cua ma tran la: " );
        System.out.println(Sum(a,n));
    }

    public static void Nhap(int[][] a,int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }

    public static int Sum(int[][] a,int n) {
        int sum = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(a[i] == a[j]) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }
}
