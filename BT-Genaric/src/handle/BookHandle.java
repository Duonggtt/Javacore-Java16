package handle;

import entity.Book;
import entity.Handle;
import entity.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookHandle implements Handle<Book> {
    @Override
    public Book insert() {
        Book book = new Book();
        System.out.println("Nhập id: ");
        book.setId(Integer.parseInt(new Scanner(System.in).nextLine()));
        System.out.println("Nhập tên: ");
        book.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập tác giá: ");
        book.setAuthor(new Scanner(System.in).nextLine());
        System.out.println("Nhập ngày phát hành: ");
        book.setPublicDate(new Scanner(System.in).nextLine());
        return book;
    }

    @Override
    public Book delete(Book object, ArrayList<Book> list) {
        System.out.println("Nhập id cần xóa: ");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        for (Book book: list) {
            if(id == book.getId()){
                list.remove(book);
                break;
            }
        }
        return object;
    }

    @Override
    public Book update(Book object, ArrayList<Book> list) {
        System.out.println("Nhập id cần update: ");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        for (Book book: list) {
            if(id == book.getId()){
                System.out.println("Cập nhật tên: ");
                book.setName(new Scanner(System.in).nextLine());
                break;
            }
        }
        return object;
    }

}
