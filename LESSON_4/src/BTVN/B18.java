package BTVN;

public class B18 {
    //Bài 18: Viết chương trình liệt kê các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10
    // (ví dụ số: 721127).
    public static void main(String[] args) {
        for(int i=100000;i<1000000;i++) {
            if(ThuanNghich(i) && Sum(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean ThuanNghich(int n) {
        int reverse = 0;
        int k = n;
        while(k > 0) {
            reverse = reverse *10 + k%10;
            k/=10;
        }
        if(reverse == n) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean Sum(int n) {
        int sum = 0;
        while(n>0) {
            int sodu = n % 10;
            sum+=sodu;
            n/=10;
        }
        if(sum % 10 == 0){
            return true;
        }else {
            return false;
        }
    }
}
