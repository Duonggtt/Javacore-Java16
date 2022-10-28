package BTVN;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        //Bài 11: Nhập số tự nhiên n rồi tính các tổng sau:
        //• S = tổng các số tự nhiên không lớn hơn n.
        //• S1 = tổng các số tự nhiên lẻ không lớn hơn n.
        //• S2 = tổng các số tự nhiên chẵn không lớn hơn n


        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        int S1 = 0;
        int S2 = 0;
        for(int i=0;i<=n;i++) {
            S+=i;
            if(i % 2 !=0) {
                S1+=i;
            }else {
                S2 +=i;
            }
        }
        System.out.println("Tong cua S la: " + S);
        System.out.println("Tong cua S1 la: " + S1);
        System.out.println("Tong cua S2 la: " + S2);
    }
}
