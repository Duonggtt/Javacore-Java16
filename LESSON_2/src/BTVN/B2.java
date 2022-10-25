package BTVN;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        //Bài 2: Giải và biện luận phương trình bậc hai ax2 + bx + c = 0, với a, b và c nhập vào từ bàn phím, a khác 0.

        Scanner sc = new Scanner(System.in);

        double x1,x2;

        System.out.println("Nhap a: ");
        float a = sc.nextFloat();
        System.out.println("Nhap b: ");
        float b = sc.nextFloat();
        System.out.println("Nhap c: ");
        float c = sc.nextFloat();

        float delta = (b * b) - (4 * a * c);

        x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

        String result = delta > 0 ? "Phuong trinh co 2 nghiem phan biet: \nx1= " + x1 + "\n" + "x2= " + x2 : delta == 0 ? "Phuong trinh co nghiem kep x1=x2= " + (-b / (2*a)) : "Phuong trinh vo nghiem";
        System.out.println(result);
    }
}
