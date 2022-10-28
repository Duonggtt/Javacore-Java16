package BTVN;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        //Bài 1: Viết chương trình nhập vào 4 số nguyên a, b, c và d. In ra màn hình kết quả xem số nào lớn nhất trong 4 số vừa nhập.

        System.out.print("Nhap a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhap b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhap c: ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("Nhap d: ");
        int d = new Scanner(System.in).nextInt();
        int max = a;

        if(b > a && b > c && b > d) {
            max = b;
            System.out.printf("\n%d la so lon nhat !", max);
        }else if(c > b && c > a && c > d) {
            max = c;
            System.out.printf("\n%d la so lon nhat !", max);
        }else if(d > a && d > b && d > c) {
            max = d;
            System.out.printf("\n%d la so lon nhat !", max);
        }else {
            System.out.printf("\n%d la so lon nhat !", max);
        }
    }
}
