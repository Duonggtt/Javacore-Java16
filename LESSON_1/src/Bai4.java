public class Bai4 {
    public  static  void main(String[] args) {
        //Bài 4: Khai căn một số dương bất kì, kết quả làm tròn tới 3 chữ số thập phân.

        double giatri = 20;
        double num = Math.sqrt(giatri);
        System.out.println("Result = " + Math.ceil(num * 1000) / 1000);
    }
}
