package BTVN;

import java.util.Scanner;

public class B6 {

    //Bài 6: Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1] và 2 số nguyên b, c (b < c).
    // Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c].
    public static void main(String[] args) {

        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap mang: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        System.out.println(Average(arr));

    }

    public static double Average(int[] arr) {
        int temp = arr[0];
        System.out.println("Nhap a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhap b: ");
        int b = new Scanner(System.in).nextInt();
        while(a > b) {
            System.out.println("Vui long nhap lai a < b");
            System.out.println("Nhap a: ");
            a = new Scanner(System.in).nextInt();
            System.out.println("Nhap b: ");
            b = new Scanner(System.in).nextInt();
        }
        int sum = 0;
        int count = 0;
        for(int i =a;i<b;i++) {
            if(arr[i] >a && arr[i] < b) {
                sum += arr[i];
                count++;
            }
        }
        double tbc = (double) sum / count;
        System.out.println("Trung binh cong cua cac phan tu trong doan a-b la : ");
        return tbc;
    }
}
