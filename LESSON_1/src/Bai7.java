public class Bai7 {
    public static void main(String[] args) {
        //Bài 7: Giải phương trình bậc nhất hai một ẩn ax2 + bx + c = 0 (với a khác 0, chỉ xét trường hợp với a,b,c để phương trình có 2 nghiệm riêng biệt).

        float a = 2;
        float b = 6;
        float c = 4;
        double x, y;
        float delta = (b*b) - (4 * a * c);

            x = ((-b) + Math.sqrt(delta)) / (2 * a);
            y = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nghiem phan biet cua phuong trinh ax2 + bx + c = 0 la: " + "x1 = " + x + ", " + "x2 = " + y);

    }
}
