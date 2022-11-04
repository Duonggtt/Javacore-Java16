package BTVN;

import java.util.Scanner;

public class B11 {
        //Bài 11: Viết chương trình nhập số liệu cho ma trận các số nguyên A cấp mxn trong đó m, n là các số tự nhiên.
        //Sau đó tìm ma trận chuyển vị B = (bij) cấp n x m của A, với bij = aji
    public static void main(String[] args) {
        System.out.println("Nhap m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[n][m];
        System.out.println("Nhap vao ma tran a: ");
        for(int i=0;i<m;i++) {
            for (int j =0;j<n;j++) {
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        System.out.println("Ma tran cua A la: ");
        Xuat(a,m,n);
        System.out.println("Ma tran B chuyen vi cua A la: ");
        ChuyenVi(a,b,n,m);
        Xuat(b,n,m);
    }

    public static void Xuat(int[][] a , int m, int n) {
        for(int i=0;i<m;i++) {
            for (int j =0;j<n;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void ChuyenVi(int[][] a, int[][] b , int n, int m) {
        for(int i=0;i<n;i++) {
            for (int j =0;j<m;j++) {
                b[i][j] = a[j][i];
            }
        }
    }
}
