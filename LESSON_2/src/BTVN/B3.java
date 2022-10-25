package BTVN;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        //Bài 3: Nhập vào chiều dài và chiều rộng của hình chữ nhật, tính chu vi và diện tích của hình chữ nhật đó.

        Scanner sc = new Scanner(System.in);

        System.out.println("NHap vao chieu dai hinh chu nhat: ");
        int a = sc.nextInt();
        System.out.println("NHap vao chieu rong hinh chu nhat: ");
        int b = sc.nextInt();

        double C = (a + b) * 2;
        double S = a * b;

        System.out.println("Dien tich hinh chu nhat la : " +(double) S);
        System.out.println("Chu vi hinh chu nhat la : " +(double) C);

    }
}
