package BTVN;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //Bài 2: Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?

        System.out.print("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int count = 0;

        for (int i=1; i<=n ; i++) {
            if(n % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("co "+ count + " uoc so cua " + n + " !");
    }
}
