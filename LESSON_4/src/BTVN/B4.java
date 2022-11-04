package BTVN;

import java.util.Scanner;

public class B4 {
    //Bài 4: Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1].
    // Đếm xem có bao nhiêu cặp 2 phần tử liên tiếp bằng nhau trong dãy trên
    // (tức là đếm số cặp a[i] , a[i+1] sao cho a[i] = a[i+1];
    // nếu có trường hợp a[i] = a[i+1] = a[i+2] thì được xem là có 2 cặp).
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap mang: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("So cap cac phan tu bang nhau trong mang la: ");
        System.out.println(Count(arr,n));
    }

    public static int Count(int[] arr,int n) {
        int count=0;
        for(int i=0;i< n-1;i++) {
                if(arr[i] == arr[i+1]) {
                    count++;
                }
        }
        return count;
    }
 }
