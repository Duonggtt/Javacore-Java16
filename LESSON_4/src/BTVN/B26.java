package BTVN;

import java.util.Scanner;

public class B26 {
    //Bài 26: Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0) và một số nguyên x.
    // Đếm số lần xuất hiện của x trong mảng a.
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap x: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap mang: ");
        int[] a = new int[n];
        Nhap(a,n);
        System.out.println("So lan xuat hien cua x la: " + Count(a,n,x));

    }
    public static void Nhap(int[] a,int n) {

        for(int i=0;i<n;i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
    }

    public static int Count(int[] a, int n,int x) {
        int count=0;
        for (int i = 0; i < n; i++) {
            if(a[i] == x) {
                count++;
            }
        }
        return count;
    }
}
