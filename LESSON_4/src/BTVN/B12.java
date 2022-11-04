package BTVN;

import java.util.Scanner;

public class B12 {
    //Bài 12: Viết chương trình tính tích 2 ma trận các số nguyên A cấp mxn và B cấp n x k.
    public static void main(String[] args) {
        System.out.println("Nhap m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap k: ");
        int k = new Scanner(System.in).nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        int[][] c = new int[m][k];
        Nhap(a,b,m,n,k);
        System.out.println("Tich 2 ma tran la: ");
        Multiplication(a,b,c,m,n,k);
        Xuat(c,m,k);
    }

    public static void Xuat(int[][] c , int m, int k) {
        for(int i=0;i<m;i++) {
            for (int j =0;j<k;j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void Nhap(int[][] a, int[][] b,int m, int n, int k ) {
        System.out.println("Nhap ma tran A: ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        System.out.println("Nhap ma tran B: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<k;j++) {
                b[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }

    public static void Multiplication(int[][] a, int[][] b, int[][] c,int m, int n, int k ) {
        for(int i=0;i<m;i++) {
            for(int j=0;j<k;j++) {
                c[i][j] = 0;
                for(int f = 0;f<n;f++) {
                    c[i][j] =c[i][j]  + (a[i][f] * b[f][j]);
                }
            }
        }
    }
}
