public class Bai8 {
    public static void main(String[] args) {
        //Bài 8: Tìm số lớn nhất trong 3 số nguyên a, b, c. Sử dụng lớp Math hỗ trợ.

        int a2 = 5;
        int b2 = 7;
        int c2 = 3;

        int lan1 = Math.max(a2, b2);
        int lan2 = Math.max(a2, c2);
        int MAX = Math.max(lan1, lan2);
        System.out.println("MAX trong 3 so " + a2 + ", " + b2 + ", " + c2 + " la: " + MAX);

    }
}
