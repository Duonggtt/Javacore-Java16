package ONCLASS;

import java.util.Scanner;

public class DEMO2 {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(isCheck(n));
    }

    public static int isCheck(int n) {
        if(n==0 || n==1) {
            return 1;
        }
            return isCheck(n-1) + isCheck(n-2);
    }
}
