import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        if(n % 2 != 0) {
            System.out.println("n la so le");
            for(int i =1;i<=n;i++) {
                if(i % 2 != 0) {
                    sum += i;
                }
            }
        }else {
            System.out.println("n la so chan");
            for(int i =1;i<=n;i++) {
                if(i % 2 == 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
