package entity;

import entity.Book;

import java.util.ArrayList;

public class Library {

    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<Reader> readers = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }

    public void setReaders(ArrayList<Reader> readers) {
        this.readers = readers;
    }
}
