import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;

    public static float[] sinhviens = new float[100];

    public static void main(String[] args) {
        System.out.println("Nhập số sinh viên: ");
        do {
            n = new Scanner(System.in).nextInt();
            if( n > 3 && n < 100) {
                break;
            }
            System.out.println("Vui lòng nhập n > 3 && n < 100");
        }while(true);
        for(int i = 0;i< n;i++) {
            System.out.println("Nhap vao diem sinh vien: ");
            sinhviens[i] = new Scanner(System.in).nextFloat();
        }
        findHighestAndLowestcore();
        countRankingScoreA();
        percentFail();
        sortScore();
    }

    private static void sortScore() {
        Arrays.sort(sinhviens);
    }

    private static void percentFail() {
        int count = 0;
        for(Float sv : sinhviens) {
            if(sv < 4) {
                count++;
            }
        }
        float failNum = (count / n);
        System.out.printf("Phần trăm sinh viên học lại là: %.2f", failNum);
    }
    private static void countRankingScoreA() {
        int count = 0;
        for(Float sv : sinhviens) {
            if(sv >= 8.5) {
                count++;
            }
        }
        System.out.println("Số sinh viên đạt điểm A là : " + count + " sinh viên.");
    }

    private static void findHighestAndLowestcore() {
        float max = 0;
        float min = 10;
        for(Float sv : sinhviens) {
            if(sv > max) {
                max = sv;
            }
            if(sv < min && sv != 0) {
                min = sv;
            }
        }

        System.out.println("Điểm cao nhất là: " + max);
        System.out.println("Điểm thấp nhất là: " + min);
    }
}