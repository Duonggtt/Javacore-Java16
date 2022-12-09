package handle;

import entity.Book;
import entity.Handle;
import entity.Library;
import entity.Reader;

import java.util.ArrayList;
import java.util.Scanner;

public class ReaderHandle implements Handle<Reader> {
    @Override
    public Reader insert() {
        Reader reader = new Reader();
        System.out.println("Nhập id: ");
        reader.setId(Integer.parseInt(new Scanner(System.in).nextLine()));
        System.out.println("Nhập tên: ");
        reader.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập ngày sinh: ");
        reader.setBirthDate(new Scanner(System.in).nextLine());
        return reader;
    }

    @Override
    public Reader delete(Reader object, ArrayList<Reader> list) {
        System.out.println("Nhập id cần xóa: ");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        for (Reader reader: list) {
            if(id == reader.getId()){
                list.remove(reader);
                break;
            }
        }
        return object;
    }

    @Override
    public Reader update(Reader object, ArrayList<Reader> list) {
        System.out.println("Nhập id cần update: ");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        for (Reader reader: list) {
            if(id == reader.getId()){
                System.out.println("cập nhật tên: ");
                reader.setName(new Scanner(System.in).nextLine());
                break;
            }
        }
        return object;
    }
}
