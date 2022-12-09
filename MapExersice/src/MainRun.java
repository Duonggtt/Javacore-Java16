import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainRun {

    public static void main(String[] args) {
        StudentHandle studentHandle = new StudentHandle();
        Map<Integer, Student> map = new HashMap<Integer, Student>();
        while(true){
            System.out.println("\n======================================================================");
            System.out.println("1. Nhập và xuất thông tin sinh viên.");
            System.out.println("2. Tìm sinh viên bằng id.");
            System.out.println("3. Update sinh viên dựa vào id.");
            System.out.println("======================================================================\n");

            System.out.println("Chọn thao tác bạn muốn nhập: ");
            int functionChoice ;
            do{
                functionChoice = Integer.parseInt(new Scanner(System.in).nextLine());
                if(functionChoice >= 1 && functionChoice <= 4){
                    break;
                }
                System.out.println("Thao tác không hợp lệ!");
            }while(true);

            switch (functionChoice){
                case 1:
                    studentHandle.inputInfo(map);
                    break;
                case 2:
                    studentHandle.findStudentById(map);
                    break;
                case 3:
                    studentHandle.updateStudentById(map);
                    break;
                case 4:
                    System.exit(functionChoice);
            }
        }
    }

}
