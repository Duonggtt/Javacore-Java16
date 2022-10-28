package ONCLASS;

import java.util.Scanner;

public class DEMO8 {
    public static void main(String[] args) {

        System.out.println("Nhap m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        while(m > n){
            System.out.println("M phai nho hon n !! vui long nhap lai!!!");
            System.out.println("Nhap m: ");
            m = new Scanner(System.in).nextInt();
            System.out.println("Nhap n: ");
            n = new Scanner(System.in).nextInt();
        }
        for(int i=m;i<n;i++) {
            if(Math.sqrt(i) - Math.floor(Math.sqrt(i)) == 0) {
                System.out.print( i + "\t");
                count++;
            }
        }
        System.out.println("\nCo " + count + " so chinh phuong !");

    }
}
