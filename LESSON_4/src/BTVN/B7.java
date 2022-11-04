package BTVN;

import java.util.Scanner;

public class B7 {

    //Bài 7: Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
    // Kiểm tra xem a có phải là mảng đối xứng hay không (ví dụ: [15 2 1 2 15] là mảng đối xứng).
    public static void main(String[] args) {
        System.out.println("Nhap N: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap mang a: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Scanner(System.in).nextInt();
            if(a[i] < 0) {
                System.out.println("Vui long nhap so nguyen duong!");
                new Scanner(System.in).nextInt();
            }
        }
        if(CheckArray(a)) {
            System.out.println("La mang doi xung!");
        }else {
            System.out.println("Khong phai la mang doi xung!");
        }

    }

    public static boolean CheckArray(int[] a) {

        for(int i=0;i< (a.length)/2;i++) {
            if(a[i] == a[a.length-i-1]) {
                return true;
            }
        }
        return false;
    }
}
