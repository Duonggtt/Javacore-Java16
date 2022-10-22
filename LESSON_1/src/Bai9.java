public class Bai9 {
    public static void main(String[] args) {
        //Bài 9: Tìm thương của 2 số nguyên, làm tròn kết quả tới 3 chữ số thập phân. Sử dụng lớp Math hỗ trợ.

        double so1 = 6;
        double so2 = 20;
        double thuong = so2 / so1;
        System.out.println("Thuong cua 2 so la: " + thuong);
        System.out.println("Ket qua lam tron den so thap phan thu 3 = " + Math.ceil(thuong * 1000) / 1000);

    }
}
