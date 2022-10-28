package ONCLASS;

import java.util.Scanner;

public class DEMO4 {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int i=1;
        int sum=0;

        do{
            sum+=i;
            i+=2;
        }while(i <= n);
        System.out.println(sum);
    }
}
