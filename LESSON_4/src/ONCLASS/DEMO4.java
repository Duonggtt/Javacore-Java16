package ONCLASS;

import java.util.Scanner;

public class DEMO4 {
    public static void main(String[] args) {


        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        NhapMang(n,arr);
        System.out.println("Diem TB la: ");
        System.out.print(TinhTB(n,arr));
    }

    public static void NhapMang(int n, int[] arr) {
        System.out.println("Nhap vao mang: ");
        for (int i =0;i<arr.length;i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
    }

    public static float TinhTB(int n, int[] arr) {
        float TB = 0;
        int s = 0;
        for(int i=0;i<arr.length;i++) {
            s += arr[i];
            TB = (float)s / arr.length;
        }
        return TB;
    }
}
