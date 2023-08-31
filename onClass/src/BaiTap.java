import java.util.Scanner;

public class BaiTap {
    static int[] arr = new int[1000];
    static int n ;

    public static void main(String[] args) {
            while(true) {
                showMenu();
                int funcChoice = func();
                functionMenu(funcChoice);
            }
    }

    static int func() {
        int funct;
        do{
            funct = new Scanner(System.in).nextInt();
            if(funct >=1 && funct <= 5) {
                break;
            }
            System.out.println("Vui long chon thao tac tu 1-5");
        }while(true);
        return funct;
    }

    static void functionMenu(int funcChoice) {
        switch (funcChoice) {
            case 1:
                arrInput();
                break;
            case 2:
                arrPrint();
                break;
            case 3:
                countNum();
                break;
            case 4:
                findMaxNum();
                break;
            case 5:
                countNumExist();
                break;

            default:
        }
    }

    static void showMenu() {
        System.out.println("=======================================================");
        System.out.println("1. Nhập mảng mới");
        System.out.println("2. In ra mảng");
        System.out.println("3. Đếm số chẵn trong mảng");
        System.out.println("4. Tim so lon nhat trong mang");
        System.out.println("5. Dến số lần xuất hiện của số x nhập vào từ bàn phím");
        System.out.println("=======================================================");
        System.out.println("Chon Thao tac ban muon thuc hien: ");
    }

    private static void countNumExist() {
        int count = 0;
        System.out.println("Nhap vao so x : ");
        int x = new Scanner(System.in).nextInt();
        for(int i =0;i<n;i++) {
            if(arr[i] == x) {
                count++;
            }
        }
        System.out.println(" so lan ma x xuat hien la: " + count);
    }


    public static void arrInput() {
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

    public static void arrPrint() {
        System.out.println("Mảng vừa nhập là: ");
        for(int i = 0;i< n;i++) {
            System.out.println(arr[i]);
        }
    }

    private static void countNum() {
        int count = 0;
        for(int i = 0;i<n;i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Mảng trên có " + count + " số chẵn.");
    }

    private static void findMaxNum() {
        int max = 0;
        for(int i =0;i<n;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("So lon nhat trong mang la: " + max);
    }

}