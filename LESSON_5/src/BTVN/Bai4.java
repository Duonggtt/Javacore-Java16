package BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        MyPoint[] mypoint = new MyPoint[n];
        Nhap(mypoint);
        Distance(mypoint);
    }

    public static void Nhap(MyPoint[] mypoint) {
        double x,y;
        for(int i=0;i<mypoint.length;i++) {
            mypoint[i] = new MyPoint();
            System.out.println("x = ");
            x = new Scanner(System.in).nextDouble();
            mypoint[i].setX(x);
            System.out.println("y = ");
            y = new Scanner(System.in).nextDouble();
            mypoint[i].setY(y);
        }
    }

    public static void Distance(MyPoint[] mypoint) {
        int x = 0,y = 0;
        double max =0;
        for (int i = 0; i < mypoint.length; i++) {
            for(int j=i+1;j<mypoint.length;j++) {
                if(mypoint[i].distance(mypoint[j]) > max) {
                    max = mypoint[i].distance(mypoint[j]);
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("Khoang cach max giua 2 diem " + x + " va " + y + " la : " + max);;
    }
}
