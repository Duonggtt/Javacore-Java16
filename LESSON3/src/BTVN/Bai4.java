package BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        //Bài 4: Viết chương trình liệt kê n số nguyên tố đầu tiên.


        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int sont = 2;
        int count = 0;

        while(n > 0) {
            boolean isCheckNum = true;
            int i;
            for(i =2;i<=Math.sqrt(sont);i++) {
                if(sont%i==0) {
                    isCheckNum = false;
                    break;
                }
            }
            if(isCheckNum == true) {
                count++;
                System.out.println(sont + "\t");
            }
            if(count >= n) {
                break;
            }
            sont++;
        }
    }
}
