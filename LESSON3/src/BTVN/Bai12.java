package BTVN;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        //Bài 12: Nhập vào 2 số tự nhiên m và n, sao cho m < n. Hãy liệt kê các số chính phương trong đoạn [m,n].
        // Có bao nhiêu số chính phương?

        System.out.println("Nhap m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        while(m > n) {
            System.out.println("m phai nho hon n ! vui long nhap lai !");
            System.out.println("Nhap m: ");
            m = new Scanner(System.in).nextInt();
            System.out.println("Nhap n: ");
            n = new Scanner(System.in).nextInt();
        }

        for(int i = m; i< n; i++) {
            if(Math.sqrt(i) - Math.floor(Math.sqrt(i)) == 0) {
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.printf("\nCo tat ca %d so chinh phuong trong khoang tu m -> n !",count);

    }
}
