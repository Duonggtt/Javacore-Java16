package ONCLASS;

import java.util.Scanner;

public class DEMO7 {
    public static void main(String[] args) {

        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        float sum = 0;

        for(int i=1;i<n;i++) {
            sum += 1.0/i;
        }
        System.out.println(sum);
    }
}
