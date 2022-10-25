package BTVN;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {

        //Bài 1: Giải và biện luận phương trình bậc nhất ax + b = 0, với a và b nhập vào từ bàn phím.


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a (a khac 0): ");
        float a = sc.nextFloat();
        System.out.println("Nhap vao b: ");
        float b = sc.nextFloat();

        String result = (a != 0) ? "Phuong trinh co 1 nghiem duy nhat la: x = " + (-b / a) : (a==0 && b ==0) ? "Phuong trinh vo so nghiem" : " Phuong trinh vo nghiem !";
        System.out.println(result);
    }
}
