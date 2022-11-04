package BTVN;

import java.util.Scanner;

public class B8 {

    //Bài 8: Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
    // In phần tử có số lần xuất hiện nhiều nhất trong a.
    public static void main(String[] args) {
        System.out.println("Nhap N: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap mang a: ");
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Scanner(System.in).nextInt();
            if(a[i] < 0) {
                System.out.println("Vui long nhap so nguyen duong!");
                new Scanner(System.in).nextInt();
            }
        }Count(a,b);

    }

    public static void Count(int[] a, int[] b) {
        int count = 0;
        int max = 1;
        for(int i=0;i<a.length;i++) {
            for (int j=i;j<a.length;j++) {
                if(a[i] == a[j]) {
                    b[i]++;
                }
            }
        }
        for(int i=0;i<a.length;i++) {
            if(b[i] > max) {
                max = b[i];
            }
        }
        for(int i=0;i<a.length;i++) {
            if(b[i] == max) {
                System.out.println(a[i]);
            }
        }
    }
}
