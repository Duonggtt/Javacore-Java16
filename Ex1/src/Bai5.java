import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Nhap so 1");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap so 2");
        int n = new Scanner(System.in).nextInt();
        int ucln = 1;
        for(int i =1;i<= m && i<=n;i++) {
            if(m % i ==0 && n % i ==0) {
                ucln = i;
            }
        }
        System.out.println(ucln);
    }
}
