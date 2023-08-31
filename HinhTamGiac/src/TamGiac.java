import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        float a = sc.nextFloat();
        System.out.println("Nhap b ");
        float b= sc.nextFloat();
        System.out.println("Nhap c: ");
        float c = sc.nextFloat();
        if(a+b>c || a+c>b || b+c>a) {
            Caulate(a,b,c);
        }else {
            System.out.println("Không phải tam giác");
        }
    }
    public static void Caulate(float a,float b, float c) {
            float chuvi = a + b + c;
            float p = (a+b+c) / 2;
            float dientich = (float) Math.sqrt(p*(p - a)*(p - b)*(p - c));
            System.out.println("Dien tich hinh tam giac la: " + dientich);
            System.out.println("Chu vi hinh tam giac la :" + chuvi);
    }
}