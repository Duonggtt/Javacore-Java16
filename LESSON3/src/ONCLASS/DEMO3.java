package ONCLASS;

import java.util.Scanner;

public class DEMO3 {
    public static void main(String[] args) {

        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int i = 0;
        int sum = 0;
        while((i <= n)) {
            sum += i;
            i+=2;
        }
        System.out.println(sum);
    }
}
