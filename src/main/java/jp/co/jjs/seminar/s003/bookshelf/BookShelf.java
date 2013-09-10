package jp.co.jjs.seminar.s003.bookshelf;

import java.util.*;

/**
 * 書籍を管理するクラスです。
 * @author tmaeda
 */
public class BookShelf {

    private final HashMap<String, Book> books = new HashMap<>();

    /**
     * 書籍を追加します。
     * @param book Bookクラスのオブジェクト
     */
    public void add(Book book) {
        books.put(book.getIsbn(), book);
    }
    
    /**
     * 書籍を削除します。
     * 書籍を削除するためには、ISBN番号を指定します。
     * @param isbn 
     */
    public void remove(String isbn) {
        books.remove(isbn);
    }
    
    /**
     * 書籍の冊数を返します。
     * @return 書籍の冊数
     */
    public int size() {
        return books.size();
    }
    
    /**
     * 登録されている書籍をCollection型で返します。
     * @return 登録されている書籍のCollection
     */
    public Collection<Book> list() {
        return books.values();
    }
}
