public class Bai9 {
    public static void main(String[] args) {
        //Bài 9: Tìm thương của 2 số nguyên, làm tròn kết quả tới 3 chữ số thập phân. Sử dụng lớp Math hỗ trợ.

        int so1 = 8;
        int so2 = 20;
        System.out.println("Thuong cua 2 so la: " +(float) Math.ceil((so2 / so1) * 1000)/1000);

    }
}
