package BTVN;

import java.util.Scanner;

public class B19 {
    //Bài 19: Thực hiện nhập vào một mảng số nguyên a có n phần tử (n>0).
    // Tìm số lớn nhất và nhỏ nhất trong mảng a.
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        System.out.println("Nhap mang: ");
        for(int i=0;i<n;i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("So lon nhat trong a la: ");
        System.out.println(MAX(a,n));
        System.out.println("So be nhat trong a la: ");
        System.out.println(MIN(a,n));
    }
    public static int MAX(int[]a , int n) {
        int max = a[0];
        for(int i=0;i<n;i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int MIN(int[]a, int n) {
        int min = a[0];
        for(int i=0;i<n;i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
