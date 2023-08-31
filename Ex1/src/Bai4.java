import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        if(n < 2) {
            System.out.println("Ko phai so nguyen to");
            return;
        }
        for(int i = 2; i< Math.sqrt(n);i++) {
            if(n % i ==0) {
                count++;
            }
        }
        if(count == 0) {
            System.out.println("La so nguyen to");
        }else {
            System.out.println("Khong phai so nguyen to");
        }
    }
}
