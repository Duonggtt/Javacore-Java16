import java.util.Scanner;

public class Bai1 {
    static int[] arr = new int[1000];
    static int n;
    public static void arrInput() {
        System.out.println("==========================");
        System.out.println("Bai 1: ");
        System.out.println("Nhap n: ");
        do{
            n = new Scanner(System.in).nextInt();
            if(n <=2 || n > 1000) {
                System.out.println("Nhap lai n!");
            }else {
                break;
            }
        }while(true);
        System.out.println("Nhap mang: ");
        for(int i = 0;i<n;i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Nhap mang thanh cong!");
    }

    static void printEvenNum() {
        System.out.print("Cac so chan la: ");
        for(int i = 0;i<n;i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(" ");
    }

    static void countOddNum() {
        int count = 0;
        for(int i = 0;i<n;i++) {
            if(arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Mảng trên có " + count + " số lẻ.");
    }

    static void arrSort() {
        for(int i = 0; i<n;i++) {
            for(int j =0;j<n;j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sort la: ");
        for(int i =0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
