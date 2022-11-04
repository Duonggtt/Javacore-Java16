package BTVN;

import java.util.Scanner;

public class B25 {
    //Bài 25: Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0).
    // Đếm xem trong mảng có bao nhiêu số lẻ và bao nhiêu số chẵn.
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap mang: ");
        int[] a = new int[n];
        Nhap(a,n);
        Count(a,n);
    }

    public static void Nhap(int[] a,int n) {

        for(int i=0;i<n;i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
    }

    public static void Count(int[] a,int n) {
        int countsole = 0;
        int countsochan = 0;
        for(int i=0;i<n;i++) {
            if(a[i]%2==0) {
                countsochan++;
            }else {
                countsole++;
            }
        }
        System.out.println("co " + countsochan + " so chan!");
        System.out.println("co " + countsole + " so le!");
    }
}
