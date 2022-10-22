public class Bai3 {
    public static void main(String[] args) {
        //Bài 3: Tìm số lớn nhất trong 4 số biết trước.

        int x1 = 2;
        int x2 = 9;
        int x3 = 4;
        int x4 = 5;

        if(x1 > x2 && x1 > x3 && x1 > x4) {
            System.out.println("So lon nhat trong bon so la: " + x1);
        }else if(x2 > x1 && x2 > x3 && x2 > x4) {
            System.out.println("So lon nhat trong bon so la: " + x2);
        }else if(x3 > x1 && x3 > x2 && x3 > x4) {
            System.out.println("So lon nhat trong bon so la: " + x3);
        }else {
            System.out.println("So lon nhat trong bon so la: " + x4);
        }
    }
}
