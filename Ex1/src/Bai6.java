import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        tamGiac();
        vuongCheo();
    }

    public static void tamGiac() {
        System.out.println("Nhap chieu cao: ");
        int h = new Scanner(System.in).nextInt();
        for(int i =1; i<= h;i++){
            for(int j = 1; j<= i;j++) {
                if(j == 1 || j == i || i == h) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void vuongCheo() {
        System.out.println("Nhap canh : ");
        int h = new Scanner(System.in).nextInt();
        for(int i =1; i<= h;i++){
            for(int j = 1; j<= h;j++) {
                if(j == 1 || j == i || i == h || i == 1 || j == h || i == (h-j)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
