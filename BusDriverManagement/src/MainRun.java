import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {

        while(true){
            showMenu();
            int functionchoice = chooseFunction();

        }

    }

    private static int chooseFunction() {
        int functionchoice;
        do{
            functionchoice = new Scanner(System.in).nextInt();
            if(functionchoice >=1 && functionchoice <=10) {
                break;
            }
            System.out.println("Thao tác không hợp lệ!! Vui long nhập lại!");
        }while(true);
        return functionchoice;
    }

    private static void showMenu() {
        System.out.println("=======================CHƯƠNG TRÌNH QUA LÝ PHÂN CÔNG LÁI XE BUS=======================");
        System.out.println("1. Nhập danh sách tài xế.");
        System.out.println("2. Xuất danh sách tài xế.");
        System.out.println("3. Nhập danh sách tuyến.");
        System.out.println("4. Xuất danh sách tuyến.");
        System.out.println("5. Phân công danh sách lái xe.");
        System.out.println("6. Xuất danh sách phân công.");
        System.out.println("7. Sắp xếp danh sách phân công theo tên.");
        System.out.println("8. Sắp xếp danh sách phân công theo số lượng tuyến giảm dần.");
        System.out.println("9. Tính tổng khoảng cách chạy xe của mỗi tài xế trong ngày.");
        System.out.println("10. Thoát chương trình.");
        System.out.println("\n Chọn thao tác cần thực hiện: ");
    }
}
