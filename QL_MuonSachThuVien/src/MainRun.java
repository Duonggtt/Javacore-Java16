import entity.BookTitle;
import entity.Reader;

import java.util.Scanner;

public class MainRun {

    public static Reader[] readers = new Reader[1000];
    public static BookTitle[] bookTitles = new BookTitle[1000];

    public static void main(String[] args) {

            while(true) {
                showMenu();
                System.out.print("Vui lòng chọn thao tác bạn muốn thực hiện! : ");
                int functionChoices = chooseFunction();
                readerHandle(functionChoices);
            }
    }

    private static void showMenu() {
        System.out.println("============= QUẢN LÝ MƯỢN SÁCH THƯ VIỆN =============");
        System.out.println("1. Nhập danh sách đầu sách mới.");
        System.out.println("2. Xuất danh sách đầu sách.");
        System.out.println("3. Nhập thông tin bạn đọc mới.");
        System.out.println("4. Xuất danh sách bạn đọc.");
        System.out.println("5. Sắp xếp quản lý mượn sách theo tên bạn đọc.");
        System.out.println("6. Sắp xếp quản lý mượn sách theo số lượng sách được mượn giảm dần.");
        System.out.println("7. Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc.");
        System.out.println("8. Thoát chương trình!");
    }

    private static int chooseFunction() {
        int functionChoices;
        do{
            functionChoices = new Scanner(System.in).nextInt();
            if(functionChoices >=1 && functionChoices <=8) {
                break;
            }
            System.out.println("Chức năng không hợp lệ! Vui lòng nhập lại!");
        }while(true);
        return functionChoices;
    }

    private static void readerHandle(int functionChoices) {

        switch (functionChoices) {
            case 1:
                System.out.print("Nhập số lượng đầu sách cần thêm : ");
                int bookNum = new Scanner(System.in).nextInt();
                bookInput(bookNum);
                break;
            case 2:
                System.out.println("\n\n========== Xuất danh sách đầu sách ==========\n");
                bookOutput();
                System.out.println("\n\n============================================\n");
                break;
            case 3:
                System.out.print("Nhập số lượng bạn đọc cần thêm : ");
                int readerNum = new Scanner(System.in).nextInt();
                readerInput(readerNum);
                break;
            case 4:
                System.out.println("\n\n========== Xuất danh sách bạn đọc ==========\n");
                readerOutput();
                System.out.println("\n\n============================================\n");
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                System.exit(functionChoices);

        }
    }

    private static void bookOutput() {
        for(int i=0;i<bookTitles.length;i++) {
            if(bookTitles[i] != null) {
                System.out.println(bookTitles[i]);
            }
        }
    }

    private static void bookInput(int bookNum) {
        for(int i=0;i<bookNum;i++) {
            System.out.println("Đầu sách thứ " + (i + 1) + " : ");
            BookTitle bookTitle = new BookTitle();
            bookTitle.NhapDauSach();
            for(int j=0;j<bookTitles.length;j++) {
                if(bookTitles[i] == null) {
                    bookTitles[i] = bookTitle;
                    break;
                }
            }
        }
    }

    private static void readerOutput() {
        for(int i = 0; i < readers.length;i++) {
            if(readers[i] != null ) {
                System.out.println(readers[i]);
            }
        }
    }

    private static void readerInput(int readerNum) {
        for (int i = 0; i < readerNum; i++) {
            System.out.println("Bạn đọc thứ " + (i + 1) + " : ");
            Reader reader = new Reader();
            reader.NhapThongTin();
            for(int j = 0;j< readers.length;j++) {
                if(readers[i]  == null) {
                    readers[i] = reader;
                    break;
                }
            }
        }
    }


}
