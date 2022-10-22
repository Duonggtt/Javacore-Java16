public class Bai4 {
    public  static  void main(String[] args) {
        //Bài 4: Khai căn một số dương bất kì, kết quả làm tròn tới 3 chữ số thập phân.

        double num = Math.sqrt(20);
        System.out.println("Result = " + (double) Math.ceil(num * 1000) / 1000);
    }
}
