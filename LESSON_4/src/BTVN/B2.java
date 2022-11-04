package BTVN;

public class B2 {
    //Bài 2: Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
    //a) Là số nguyên tố.
    //b) Tất cả các chữ số là nguyên tố
    //c) Đảo của nó cũng là một số nguyên tố
    public static void main(String[] args) {
        for(int i=1000000;i<10000000;i++) {
            if(soNguyenTo(i) && daoSoNguyenTo(i) && chuSoNguyenTo(i) ) {
                System.out.println(i);
            }
        }
    }

    public static boolean soNguyenTo(int n) {
        while(n>=2) {
            for(int i=2;i<= Math.sqrt(n) ;i++) {
                if(n%i==0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
//
    public static boolean chuSoNguyenTo(int n) {
        while(n>0) {
            int x= n%10;
            n/=10;
            if(soNguyenTo(x)) {
                continue;
            }
            return false;
        }
        return true;
    }
//
    public static boolean daoSoNguyenTo(int n) {
        int m=n;
        int nghichDao = 0;
        while (m>2) {
            nghichDao = nghichDao * 10 + m%10;
            m/=10;
        }
        if(nghichDao == n) {
            for(int i=2;i<= Math.sqrt(nghichDao) ;i++) {
                if(nghichDao%i==0) {
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
