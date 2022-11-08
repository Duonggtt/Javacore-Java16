package entity;

import constant.BookTypeConstant;

import java.util.Scanner;

public class BookTitle {

    public static int AUTO_BOOK_ID = 0;
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String Specialization;
    private int publishYear;

    public BookTitle() {
        if(AUTO_BOOK_ID == 0) {
            AUTO_BOOK_ID = 9999;
        }
        AUTO_BOOK_ID++;
        this.bookId = AUTO_BOOK_ID;
    }

    public static int getAutoBookId() {
        return AUTO_BOOK_ID;
    }

    public static void setAutoBookId(int autoBookId) {
        AUTO_BOOK_ID = autoBookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "BookTitle{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", Specialization='" + Specialization + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }

    public void NhapDauSach() {
        System.out.println("Nhập tên đầu sách: ");
        this.bookName = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên tác giả: ");
        this.bookAuthor = new Scanner(System.in).nextLine();
        System.out.println("Nhập năm xuất bản: ");
        this.publishYear = new Scanner(System.in).nextInt();
        System.out.println("Chọn loại đầu sách: ");
        System.out.println("1. Khoa học tự nhiên.");
        System.out.println("2. Văn học-Nghệ thuật.");
        System.out.println("3. Điện tử Viễn thông.");
        int bookTypeTemp;
        do {
            bookTypeTemp = new Scanner(System.in).nextInt();
            if(bookTypeTemp >=1 && bookTypeTemp <=3) {
                break;
            }
            System.out.println("Loại đầu sách không hợp lệ! Vui lòng chọn lại!");
        }while(true);
        switch (bookTypeTemp) {
            case 1:
                this.Specialization = BookTypeConstant.NATURAL_SCIENCES;
                break;
            case 2:
                this.Specialization = BookTypeConstant.LITERATURE_ART;
                break;
            case 3:
                this.Specialization = BookTypeConstant.TELECOMMUNICATION;
                break;
        }
    }

}
