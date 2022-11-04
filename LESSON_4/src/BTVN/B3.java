package BTVN;

import java.util.Scanner;

public class B3 {
    //Bài 3: Nhập số n và dãy các số nguyên a[0], a[1],…, a[n-1] rồi sắp xếp dãy trên theo thứ tự tăng dần.
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap mang: ");
        int[] arr = new int[n];
        for (int i=0;i< arr.length;i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Mang sau khi sap xep la: ");
        SapXep(arr);
        Xuat(arr);
    }

    public static void Xuat(int[] arr){
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void SapXep(int[] arr) {
        int temp = arr[0];
        for(int i=0;i<arr.length - 1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
