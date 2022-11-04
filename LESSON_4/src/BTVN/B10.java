package BTVN;

import java.util.Scanner;

public class B10 {
    //Bài 10: Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau.
    // Nếu nhập một số đã có thì yêu cầu nhập lại.
    // Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        int pt;
        System.out.println("Nhap day so: ");
        for(int i=0;i<n;i++) {
            pt = new Scanner(System.in).nextInt();
            if(CheckArray(a,pt)) {
                System.out.println("Phan tu bi trung ! vui long nhap lai!");
                i--;
            }else {
                a[i] = pt;
            }
        }
        System.out.println("Day so sau khi nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static boolean CheckArray(int[] a,int k) {
        for(int i=0;i<a.length;i++) {
            if(a[i] == k) {
                return true;
            }
        }
        return false;
    }
}
