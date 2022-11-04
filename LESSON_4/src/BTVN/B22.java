package BTVN;

import java.util.Scanner;

public class B22 {
    //Bài 22: Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0).
    // Tìm giá trị lớn nhất và nhỏ nhất của ma trận này.
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap ma tran: ");
        int[][] a = new int[n][m];
        Nhap(a,n,m);
        System.out.println("Ma tran sau khi xuat la: ");
        Xuat(a,n,m);
        System.out.println("\nPhan tu min trong ma tran la: " + MIN(a,n,m));
        System.out.println("Phan tu max trong ma tran la: " + MAX(a,n,m));
    }

    public static int MIN(int[][] a,int n, int m) {
        int min = a[0][0];
        for(int i=0;i<n;i++) {
            for (int j = 0;j<m;j++) {
                if(a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        return min;
    }
    public static int MAX(int[][] a,int n, int m) {
        int max = a[0][0];
        for(int i=0;i<n;i++) {
            for (int j = 0;j<m;j++) {
                if(a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }
    public static void Xuat(int[][] a,int n, int m) {
        for(int i=0;i<n;i++) {
            for (int j = 0;j<m;j++) {
                System.out.print(a[i][j] + " ");
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
}
