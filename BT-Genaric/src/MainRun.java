import entity.Book;
import entity.Library;
import entity.Reader;
import handle.BookHandle;
import handle.ReaderHandle;

public class MainRun {

    public static void main(String[] args) {
        BookHandle bookHandle = new BookHandle();
        ReaderHandle readerHandle = new ReaderHandle();
        System.out.println("Nhập thông tin sách: ");
        Book book = bookHandle.insert();
        System.out.println("Nhập thông tin tác giá: ");
        Reader reader = readerHandle.insert();

        Library.books.add(book);
        Library.readers.add(reader);

        System.out.println("Truoc khi cap nhat: ");
        for (Book book1: Library.books) {
            System.out.println(book1);
        }

        for (Reader reader1: Library.readers) {
            System.out.println(reader1);
        }

        System.out.println("Cập nhật thông tin sách: ");
        bookHandle.update(book, Library.books);


        System.out.println("Cập nhật thông tin tác giả: ");
        readerHandle.update(reader, Library.readers);

        System.out.println("sau khi cap nhat: ");
        for (Book book1: Library.books) {
            System.out.println(book1);
        }

        for (Reader reader1: Library.readers) {
            System.out.println(reader1);
        }

        System.out.println("Xóa sách: ");
        bookHandle.delete(book, Library.books);


        System.out.println("Xóa thông tin tác giả: ");
        readerHandle.delete(reader, Library.readers);


        System.out.println("Sau khi xóa: ");
        for (Book book1: Library.books) {
            System.out.println(book1);
        }

        for (Reader reader1: Library.readers) {
            System.out.println(reader1);
        }

    }

}
