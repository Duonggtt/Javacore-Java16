package BTVN;

import java.util.Scanner;

public class B21 {
    //Bài 21: Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0).
    // Tính tổng, trung bình cộng của tất cả các giá trị trong ma trận.
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
        System.out.println("\nTong cac phan tu trong ma tran la: ");
        System.out.println(SUM(a,n,m));;
        System.out.println("Trung binh cong cac phan tu trong ma tran la: ");
        System.out.println(TBC(a,n,m));
    }

    public static float TBC(int[][] a,int n, int m) {
        float tbc = 0;
        int sum = SUM(a,n,m);
        tbc = (float) sum / (n*m);
        return tbc;
    }

    public static int SUM(int[][] a,int n, int m) {
        int sum = 0;
        for(int i=0;i<n;i++) {
            for (int j = 0;j<m;j++) {
                sum += a[i][j];
            }
        }
        return sum;
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
