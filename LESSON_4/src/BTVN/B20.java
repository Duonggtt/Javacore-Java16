package BTVN;

import java.util.Scanner;

public class B20 {
    //Bài 20: Thực hiện nhập vào một mảng số nguyên a có n phần tử (n>0) và một giá trị thực x.
    // Thực hiện sắp xếp mảng a theo thứ tự tăng dần và chèn giá trị x vào trong mảng a
    // sao cho vẫn giữ được tính sắp xếp của mảng.
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        while(n<0) {
            System.out.println("Vui long nhap n > 0!");
            n = new Scanner(System.in).nextInt();
        }
        int[] a = new int[n + 1];
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao mang: ");
        for(int i=0;i<n;i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Mang sau khi sap xep la: ");
        SapXep(a,n);
        Xuat(a,n);
        System.out.println("\nMang sau khi chen them phan tu x la: ");
        Chen(a,x,n);
        Xuat(a,n);
    }

    public static void Chen(int[] a,int x,int n) {
        int index = -1;
        for(int i=0;i<n;i++) {
            if(a[i] > x) {
                index = i;
                break;
            }
        }
        if(index == -1 ) {
            a[n] = x;
        }else {
            for (int i = n; i > index ; i--) {
                a[i] = a[i-1];
            }
            a[index] = x;
        }
    }

    public static void Xuat(int[] a,int n) {
        for(int i =0;i<n;i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void SapXep(int[] a,int n) {
        int temp = 0;
        for(int i=0;i<n;i++) {
            for (int j=i;j<n;j++) {
                if(a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
