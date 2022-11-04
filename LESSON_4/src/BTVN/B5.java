package BTVN;

import java.util.Scanner;

public class B5 {
//    Bài 5: Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1].
//     Tìm số lớn thứ hai và vị trí của nó trong dãy.
//     Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.
    public static void main(String[] args) {

        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap mang: ");
        int[] a = new int[n];
        Nhap(a,n);
        int max = Max(a,n);
        int max2 = Max2(a,n);
        if(max != max2) {
            System.out.println("Gia tri lon thu 2 trong mang la: " + Max2(a,n));
            System.out.println("Vi tri cua gia tri lon thu 2 la: " + Vitri(a,n));
        }else {
            System.out.println("Ko co gia tri lon thu 2!");
        }
    }

    public static int Max(int[] a,int n) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int Max2(int[] a,int n) {
        int max = Max(a,n);
        int max2 = max;
        for (int i = 0; i < n; i++) {
            if(a[i] != max) {
                max2 = a[i];
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if(a[i] > max2 && a[i] != max) {
                max2 = a[i];
            }
        }
        return max2;
    }

    public static int Vitri(int[] a,int n) {
        int pos = -1;
        int max2 = Max2(a,n);
        for(int i=0;i<n;i++) {
            if(a[i] == max2) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static void Nhap(int[] a,int n) {
        for(int i=0;i<n;i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
    }

}
