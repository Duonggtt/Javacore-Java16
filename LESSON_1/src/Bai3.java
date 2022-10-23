public class Bai3 {
    public static void main(String[] args) {
        //Bài 3: Tìm số lớn nhất trong 4 số biết trước.

        int x1 = 2;
        int x2 = 9;
        int x3 = 4;
        int x4 = 5;

        int lan1 = Math.max(x1 , x2);
        int lan2 = Math.max(x1 , x3);
        int lan3 = Math.max(x1, x4);

        int lan4 = Math.max(lan1, lan2);
        int lan5 = Math.max(lan1, lan3);

        int result = Math.max(lan4, lan5);
        System.out.println(result);
    }
}
