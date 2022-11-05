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
        System.out.println("Nhap vao mang: ");
        for(int i=0;i<n-1;i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Mang sau khi sap xep la: ");
        SapXep(a,n);
        Xuat(a);
        System.out.println("\nNhap vao phan tu x can chen: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("\nMang sau khi chen them phan tu x la: ");
        Chen(a,x);
    }

    public static void Chen(int[] a,int x) {

        if(a[0] > x) {
            for(int i=a.length-1;i>0;i--) {
                a[i] = a[i-1];
            }
            a[0] = x;
        }else if(a[a.length-2] < x) {
            a[a.length-1] = x;
        }
        else {
            int index = 0;
            for(int i =0;i<a.length-1;i++) {
                if(a[i] > x) {
                    index = i;
                    break;
                }
            }
            for(int i=a.length-1;i>index;i--) {
                a[i] = a[i-1];
            }
            a[index] = x;
        }

        Xuat(a);
//
    }

    public static void Xuat(int[] a) {
        for(int i =0;i<a.length;i++) {
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
