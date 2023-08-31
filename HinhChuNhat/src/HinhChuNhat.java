import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        System.out.println("Nhap canh a: ");
        float a = new Scanner(System.in).nextFloat();

        System.out.println("Nhap canh b: ");
        float b = new Scanner(System.in).nextFloat();
        caculator(a,b);
    }

    public static void caculator(float a, float b) {
        float chuvi = (a + b) / 2;
        float dientich = a * b;
        System.out.println("Dien tich la: " + dientich);
        System.out.println("Chu vi la: " + chuvi);
    }
}