package ONCLASS;

import java.util.Scanner;

public class DEMO2 {
    public static void main(String[] args) {

        int Sum = 0;
        System.out.print("Nhap vao so n: ");
        int n = new Scanner(System.in).nextInt();
        if(n<=0) {
            System.out.println("n phai la so nguyen duong ! vui long nhap lai!");
            n = new Scanner(System.in).nextInt();
        }
        for(int i=0;i<=n;i++) {
            if(i % 2 ==0) {
                Sum+= i;
            }
        }
        System.out.println(Sum);
    }
}
