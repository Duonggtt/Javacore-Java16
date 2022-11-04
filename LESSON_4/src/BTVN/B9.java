package BTVN;

import java.util.Random;
import java.util.Scanner;

public class B9 {
    //Bài 9: Viết chương trình tạo ngẫu nhiên mảng a gồm N phần tử bao gồm các số nguyên. In ra các số khác nhau
    //trong dãy.
    public static void main(String[] args) {
        System.out.println("Nhap n : ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        System.out.println("day random la: ");
        Random(a,n);
        for(int i=1;i<n;i++) {
            System.out.println(a[i]);
        }
    }
    public static void Random(int[] a, int n) {
        Random rana = new Random();
        for(int i=1;i<n;i++) {
            a[i] = rana.nextInt(500);
        }
    }
}
