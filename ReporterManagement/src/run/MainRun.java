package run;

import LogicHandle.PostLogic;
import LogicHandle.PostManagementLogic;
import LogicHandle.ReporterLogic;
import entity.*;

import java.util.Scanner;

import static LogicHandle.PostManagementLogic.showPostManagement;

public class MainRun {
    public static Reporter[] reporters = new Reporter[1000];
    public static Post[] posts = new Post[1000];
    public static PostManagement[] postManagements = new PostManagement[1000];
    public static int postCount = 0;

    public static void main(String[] args) {
        while(true) {
            showMenu();
            int functionchoice = functionchoose();
            functionHandle(functionchoice);
        }
    }

    private static void functionHandle(int functionchoice) {
        switch (functionchoice) {
            case 1:
                System.out.println("Nhập số phóng viên muốn thêm : ");
                ReporterLogic.reporterInput();
                break;
            case 2:
                System.out.println("\n======================== Xuất danh sách phóng viên ========================");
                ReporterLogic.reporterOutput();
                break;
            case 3:
                System.out.println("Nhập số bài viết muốn thêm : ");
                PostLogic.postInput();
                break;
            case 4:
                System.out.println("\n======================== Xuất danh sách bài viết ========================");
                PostLogic.postOutput();
                break;
            case 5:
                PostManagementLogic.addNewPostManagement();
                showPostManagement();
                break;
            case 6:
                showSortMenu();
                break;
            case 7:
                PostManagementLogic.caculateSalary();
                break;
            case 8:
                System.exit(functionchoice);

        }
    }



    private static void showSortMenu() {
        System.out.println("Chọn cách sắp xếp : ");
        System.out.println("1. Sắp xếp theo tên");
        System.out.println("2. Sắp xếp theo số lượng bài viết giảm dần");
        System.out.println("3. Thoát ra ngoài menu chính.");
        System.out.println("Chọn thao tác : ");
        int functionSortChoose;
        do {
            functionSortChoose = new Scanner(System.in).nextInt();
            if(functionSortChoose >=1 && functionSortChoose <=3) {
                break;
            }
            System.out.println("Thao tác không tồn tại! Vui lòng chọn lại!");
        }while(true);
        switch (functionSortChoose) {
            case 1:
                PostManagementLogic.sortByName();
                break;
            case 2:
                PostManagementLogic.sortByPostNum();
                break;
            case 3:
                return;
        }
    }


    private static int functionchoose() {

        int functionchoice;
        do{
            functionchoice = new Scanner(System.in).nextInt();
            if(functionchoice >=1 && functionchoice <= 9) {
                break;
            }
            System.out.println("Thao tác không hợp lệ! Vui lòng chọn lại!");
        }while(true);
        return functionchoice;
    }

    private static void showMenu() {
        System.out.println("========================CHƯƠNG TRÌNH QUẢN LÝ PHÓNG VIÊN========================");
        System.out.println("1. Nhập danh sách phóng viên.");
        System.out.println("2. Xuất danh sách phóng viên.");
        System.out.println("3. Nhập danh sách kiểu bài viết.");
        System.out.println("4. Xuất danh sách kiểu bài viết.");
        System.out.println("5. Lập bảng tính công.");
        System.out.println("6. Sắp xếp danh sách bảng tính công.");
        System.out.println("7. Lập bảng tính thu nhập mỗi phóng viên.");
        System.out.println("8. Thoaát chương trình.");
        System.out.println("Chọn thao tác bạn muốn thực hiện: ");
    }

}
