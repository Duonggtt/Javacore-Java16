package BTVN;

import java.util.Scanner;

public class B23 {
    //Bài 23: Thực hiện nhập vào hai ma trận số nguyên a, b có n dòng và m cột (n, m>0).
    // Thực hiện tính tổng hai ma trận này.
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap ma tran a: ");
        int[][] a = new int[n][m];
        Nhap(a,n,m);
        System.out.println("Nhap ma tran b: ");
        int[][] b = new int[n][m];
        int[][] c = new int[n][m];
        Nhap(b,n,m);
        System.out.println("Tong 2 ma tran la: ");
        SUM(a,b,c,n,m);
        Xuat(c,n,m);
    }

    public static void SUM(int[][] a, int[][] b,int[][] c,int n, int m) {
        for(int i=0;i<n;i++) {
            for (int j = 0;j<m;j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public static void Nhap(int[][] a,int n, int m) {

        for(int i=0;i<n;i++) {
            for (int j = 0;j<m;j++) {
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }
    public static void Xuat(int[][] a,int n, int m) {
        for(int i=0;i<n;i++) {
            for (int j = 0;j<m;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
