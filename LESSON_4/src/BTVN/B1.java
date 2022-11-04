package BTVN;

public class B1 {
    public static void main(String[] args) {
        //Bài 1: Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
        //a) Là số thuận nghịch.
        //b) Chỉ có chữ số 0, 6, 8
        //c) Tổng chữ số chia hết cho 10
        for(int i=1000000;i<1000000000;i++) {
            if(CheckNum(i) && Sum(i) && ThuanNghich(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean ThuanNghich(int n) {

        int reveresNum = 0;
        int x = n;

        while(x > 0) {
            reveresNum = reveresNum * 10 + x%10;
            x/=10;
        }

        if(reveresNum == n) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean CheckNum(int n) {
        while(n>0) {
            int sodu = n % 10;
            if(sodu !=0 && sodu!=6 &&sodu!=8) {
                return false;
            }
            n/=10;
        }
        return true;
    }
//
    public static boolean Sum(int n) {
        int sum=0;
        while(n>0) {
            int sodu = n % 10;
            n/=10;
            sum+= sodu;
        }
        int socuoi = sum%10;
        if(socuoi == 0) {
            return true;
        }else {
            return false;
        }
    }



}
