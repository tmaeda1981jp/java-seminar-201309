package jp.co.jjs.seminar.s003.bookshelf;

public class Book {

    private final String isbn;
    private final String title;
    private final int price;
    private final String dateOfPublish;
    
    public Book(String isbn, String title, int price, String dateOfPublish) {
        this.title  = title;
        this.isbn   = isbn;
        this.price  = price;
        this.dateOfPublish = dateOfPublish;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getDateOfPublish() {
        return dateOfPublish;
    }

    @Override
    public String toString() {
        return String.format("%s [ISBN: %s 価格: %d 発売日: %s]", title, isbn, price, dateOfPublish);
    }
}
