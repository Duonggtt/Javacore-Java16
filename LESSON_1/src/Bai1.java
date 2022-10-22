public class Bai1 {
    public static void main(String[] args) {
        //Bài 1: Tính chu vi và diện tích hình chữ nhật khi biết chiều dài và chiều rộng của chúng.

        int chieudai = 5;
        int chieurong = 2;
        double chuvi = (chieudai + chieurong) * 2;
        double dientich = chieudai * chieurong;
        System.out.println("Chu vi hinh chu nhat la: " + chuvi);
        System.out.println("Dien tich hinh chu nhat la: " + dientich);

    }
}