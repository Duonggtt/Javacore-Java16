package BTVN;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        //Bài 14: Nhập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.

        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();

        System.out.printf("\nCac so chan nho hon %d la: ", n);
        for(int i = 0; i<n ; i++) {
            if(i % 2 ==0) {
                System.out.print(i + "\t");
            }
        }
        System.out.printf("\nCac so le nho hon %d la: ", n);
        for(int j = 0; j<n ; j++) {
            if(j % 2 !=0) {
                System.out.print(j + "\t");
            }
        }
    }
}
