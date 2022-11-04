package BTVN;

import java.util.Scanner;

public class B27 {
    //Bài 27: Thực hiện nhập vào hai mảng số nguyên a, b đều có n phần tử (n>0).
    // Thực hiện tính tổng hai mảng này theo quy tắc:
    // phần tử đầu của a sẽ được cộng với phần tử cuối của b để cho ra phần tử đầu của mảng kết quả,
    // tiếp theo phần tử thứ 2 của a và phần tử gần cuối của b được cộng vào để cho ra phần tử thứ 2 của mảng kết quả, …
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap mang a: ");
        int[] a = new int[n];
        Nhap(a,n);
        System.out.println("Nhap mang b: ");
        int[] b = new int[n];
        int[] c = new int[n];
        Nhap(b,n);
        System.out.println("Mang c sau khi thuc hien tinh la: ");
        System.out.println(Sum(a,b,c,n));
    }

    public static int Sum(int[] a,int[] b,int[] c,int n) {
        int sum = 0;
        for(int i=0;i<n;i++) {
                    c[i] = a[i] + b[n-i-1];
        }
        for (int i = 0; i < n; i++) {
            sum+=c[i];
            System.out.print(c[i] + " ");
        }
        System.out.println("\nTong cac phan tu la: ");
        return sum;
    }

    public static void Nhap(int[] a,int n) {
        for(int i=0;i<n;i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
    }

}
