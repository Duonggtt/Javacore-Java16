public class Bai2 {
    public static void main(String[] args ){
        //Bài 2: Tính chu vi và diện tích hình tròn khi biết bán kính của nó.

        int R = 4;
        final double PI = 3.14;
        double C = 2 * PI * R;
        double S = (R * R) * PI;
        System.out.println("Chu vi hinh tron la: " + C);
        System.out.println("Dien tich hinh tron la: " + S);
    }
}
