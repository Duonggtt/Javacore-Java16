package ONCLASS;

import java.util.Scanner;

public class DEMO6 {
    public static void main(String[] args) {

        System.out.println("Nhap c: ");
        double  c = new Scanner(System.in).nextDouble();
        double PI = 0;
        double S = 0;

        for(int i=0; (double)1/(2*i+1) > c ; i++) {
            S += Math.pow(-1,i) / (2 * i + 1);
        }

        PI = S * 4;
        System.out.println(PI);

    }
}
