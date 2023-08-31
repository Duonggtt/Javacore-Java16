import java.util.Scanner;

public class Bai2 {

    static int[][] arr = new int[1000][1000];
    static int n;

    public static void arrInput() {
        System.out.println("\n==========================");
        System.out.println("Bai 2: ");
        System.out.println("Nhap n : ");
        do{
            n = new Scanner(System.in).nextInt();
            if(n <=2 || n > 10) {
                System.out.println("Nhap lai n!");
            }else {
                break;
            }
        }while(true);
        System.out.println("Nhap mang: ");
        for(int i = 0;i<n;i++) {
            for(int j = 0; j<n;j++) {
                System.out.println("Nhap arr[" + i +"][" + j + "] : ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        System.out.println("Nhap mang thanh cong!");
    }

    public static void arrOutput() {
        System.out.println("Ma tran vua nhap la: ");
        for(int i = 0;i<n;i++) {
            for(int j = 0; j<n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void countNum() {
        int count = 0;
        for(int i = 0;i<n;i++) {
            for(int j = 0; j<n;j++) {
                if(arr[i][j] > 0) {
                    count++;
                }
            }
        }
        System.out.println("So lan xuat hien so lon hon khong trong ma tran la : " + count);
    }

    public static void sumColumn() {
        for(int j = 0;j<n;j++) {
            int i = 0;
            int sum = 0;
            while(i < n) {
                sum += arr[i][j];
                i++;
            }
            System.out.println("Tong cot " + (j + 1) +" la : " + sum);
        }
    }

}
