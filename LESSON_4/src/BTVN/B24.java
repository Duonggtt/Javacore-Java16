package BTVN;

import java.util.Scanner;

public class B24 {
    //Bài 24: Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0). Thực hiện sắp xếp mảng theo thứ tự giảm dần.
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap mang: ");
        int[] a = new int[n];
        Nhap(a,n);
        System.out.println("Mang sau khi sap xep giam dan la: ");
        Sortdown(a,n);
        Xuat(a,n);
    }

    public static void Sortdown(int[] a,int n) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void Nhap(int[] a,int n) {

        for(int i=0;i<n;i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
    }
    public static void Xuat(int[] a,int n) {
        for(int i=0;i<n;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
