package jp.co.jjs.seminar.s003.bookshelf;

import java.util.*;

public class BookShelf {

    private final HashMap<String, Book> books = new HashMap<>();

    public void add(Book book) {
        books.put(book.getIsbn(), book);
    }
    
    public void remove(String isbn) {
        books.remove(isbn);
    }
    
    public int size() {
        return books.size();
    }
    
    public Collection<Book> list() {
        return books.values();
    }
}
